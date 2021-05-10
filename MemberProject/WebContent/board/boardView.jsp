<%@page import="com.board.dao.BoardDAO"%>
<%@page import="com.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> <!-- $ jquery 사용을 위한 주소 -->
<%
   request.setCharacterEncoding("utf-8");
   int num = Integer.parseInt(request.getParameter("num"));
   BoardDAO dao = BoardDAO.getInstance();
   BoardDTO board = dao.boardView(num);
   int ref = board.getRef();
   int re_step = board.getRe_step();
   int re_level = board.getRe_level();
%>
</head>
<script>
function del() {
   if(confirm("정말 삭제할까요?")) {
      location.href="deletePro.jsp?num="+<%=num %> /* deletePro.jsp로 갈 때, num 값을 가지고 넘어 감 */
   }
}
</script>
<body>
<h2>글 내용 보기</h2>
<input type="hidden" name="num" id="num" value=<%=num %>>
<table border="1">
   <tr>
      <td>글번호</td>
      <td><%=board.getNum() %></td>
      <td>조회수</td>
      <td><%=board.getReadcount() %></td>
   </tr>
   <tr>
      <td>작성자</td>
      <td><%=board.getWriter() %></td>
      <td>작성일</td>
      <td><%=board.getReg_date() %></td>
   </tr>
   <tr>
      <td>글제목</td>
      <td colspan="3"><%=board.getSubject() %></td>
   </tr>
   <tr>
      <td>글내용</td>
      <td colspan="3"><%=board.getContent() %></td>
   </tr>
   <tr>
      <td colspan="4">
         <input type="button" value="글수정" onclick="location.href='updateForm.jsp?num=<%=num %>'">
         <input type="button" value="글삭제" onclick="del()"> <!-- jquery 안쓰고 jasascript del() 함수 사용 -->
         <input type="button" value="답글쓰기" onclick="location.href='writeForm.jsp?num=<%=num %>&ref=<%=ref %>&re_step=<%=re_step %>&re_level=<%=re_level %>'">
         <input type="button" value="글목록" onclick="location.href='list.jsp'">
      </td>
   </tr>
</table>
<br/><br/><br/><br/>
<div align="center">
   <textarea rows="5" cols="50" id="msg"></textarea>
   <input type="button" value="comment write" id="commentBtn">
</div>
<div id="result"></div>
<script>
var init = function() {
   $.getJSON("commentList.jsp",
         {"bnum" : $("#num").val()},
         function(resp) {
          var str = "<table>"
          $.each(resp.main, function(key, val){
             str += "<tr>";
             str += "<td>"+val.msg+"</td>";
             str += "<td>"+val.userid+"</td>";
             str += "<td>"+val.regdate+"</td>";
             str += "</tr>";
             
          })
          str += "</table>"
          $("#result").html(str);
         } //callback
      )//getJSON
} //init
$("#commentBtn").on("click", function() { /* $ : jquery -> 사용을 위한 주소 필요 */
   $.ajax({
      type : "get",
      url : "commentInsert.jsp",
      data : {"msg" : $("#msg").val(), "bnum" : $("#num").val()}, // 메세지값, bnum도 가지고 가야 함
      success : function(resp) {
    	  if(resp.trim()==1){
    		  alert("로그인하세요.");
    		  location.href="../member/loginForm.jsp";
    	  }else{
    	      init()
    	      $("#msg").val("");
    	  }
      },
      error : function(e) {
         alert("error : " + e);
      }
   
   }) // ajax
}) //commentBtn
init();
</script>
</body>
</html>