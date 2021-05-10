<%@page import="java.util.ArrayList"%>
<%@page import="com.board.dao.BoardDAO"%>
<%@page import="com.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf-8");
	BoardDAO dao = BoardDAO.getInstance();
	String pageNum = request.getParameter("pageNum");
	if(pageNum==null){
		pageNum = "1";
	}
	String field="";
	String word="";
	if(request.getParameter("word")!=null){
		word = request.getParameter("word");
		field = request.getParameter("field");
	} //18~23 검색관련
	int currentPage = Integer.parseInt(pageNum);
	int pageSize = 5; //한 화면에 보여지는 게시물 수
	int startRow = (currentPage-1) * pageSize + 1;	//1 6 11
	int endRow = currentPage * pageSize;			//5 10 15
	ArrayList<BoardDTO> arr = dao.boardList(field, word, startRow, endRow);
	int count = dao.boardCount(field, word);
	String sid = (String)session.getAttribute("userid");
	
%>
</head>
<body>
<div align="right">
<!-- 세션이 있으면 글쓰기 없으면 화면으로-->
<%
	if(sid!=null){//세션있음
%>
		<%=sid %>님 반갑습니다. / 
		<a href="../member/logout.jsp">로그아웃</a> /
		<a href="writeForm.jsp">글쓰기</a>
<%
	}else{ //세션없음
%>
		<!-- <a href="../member/loginForm.jsp">로그인</a> <-상대경로-내가 기준 ..상위로 올라감 cf)절대경로-맨앞에 /있으면  -->
		<a href="/MemberProject/member/loginForm.jsp">로그인11</a> 
<%
	}
%>
</div>
<h2>게시글 목록(<%=count %>)</h2>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>	
	<tbody>
	<%
		for(BoardDTO board : arr){
	%>
		<tr>
			<td><%=board.getNum() %></td>
			<td><a href="boardView.jsp?num=<%=board.getNum()%>"><%=board.getSubject() %></a></td>
			<td><%=board.getWriter() %></td>
			<td><%=board.getReg_date() %></td>
			<td><%=board.getReadcount() %></td>
		</tr>
	<%
		}
	%>
	</tbody>
</table>
<br><br>
<form action="list.jsp" name="search" method="get">
	<select name="field" size=1>
		<option value="subject">제 목
		<option value="writer">작성자
	</select>
		<input type="text" size=16 name="word">
		<input type="submit" value="찾기">
</form>
<div align="center">
<%
	if(count>0){ //eg)게시글 48개 한 화면 5개 출력 => 48/5 + 45%5==0?0:1 ==> 10페이지 필요
		int pageCount = count/pageSize + (count%pageSize==0? 0 : 1);
		int pageBlock = 3;
		int startPage = (int)((currentPage-1)/pageBlock) * pageBlock +1; //10
		int endPage = startPage + pageBlock -1; //12(계산) 10(실제)
		if(endPage > pageCount){
			endPage = pageCount; //endPage=10
		}
		//이전
		if(startPage > pageBlock){
		%>
			<a href="list.jsp?pageNum=<%=startPage-pageBlock%>&field=<%=field%>&word=<%=word%>">[이전]</a>
		<%
		}
		for(int i=startPage; i<=endPage; i++){ //페이지번호
			if(i==currentPage){ //링크 없음
		%>	
			[<%=i %>]
		<%
			}else{ //링크있음
		%>
			<a href="list.jsp?pageNum=<%=i%>&field=<%=field%>&word=<%=word%>">[<%=i %>]</a>
		<%
			}
		}
		if(endPage < pageCount){ //다음
		%>
			<a href="list.jsp?pageNum=<%=startPage+pageBlock%>&field=<%=field%>&word=<%=word%>">[다음]</a>
		<%
		}
	}
%>
</div>
</body>
</html>