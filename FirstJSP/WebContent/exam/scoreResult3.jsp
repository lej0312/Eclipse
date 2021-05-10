<%@page import="com.exam.ScoreBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int math = Integer.parseInt(request.getParameter("math"));
	ScoreBean sb = new ScoreBean();
	sb.setName(name);
	sb.setKor(kor);
	sb.setEng(eng);
	sb.setMath(math);
%>
</head>
<body>
이름 : <%=name %> <br/>
이름 2 : <%=sb.getName() %> <br/>
국어 : <%=sb.getKor() %>
영어 : <%=sb.getEng() %>
수학 : <%=sb.getMath() %>
총점 : <%=sb.getTotal() %>
평균 : <%=sb.getAvg() %>
학점 : <%=sb.getGrade() %>

</body>
</html>

<!-- 유지,보수를 편하게 하기 위해 파일을 분리시켜서 작성하는게 좋음 (scoreResult 보다 효율적) -->