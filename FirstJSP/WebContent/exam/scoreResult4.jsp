<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="sb" class="com.exam.ScoreBean"/> 
<jsp:setProperty property="*" name="sb"/> <!-- property:멤버 변수  -->
<body> 
이름 : <%=sb.getName() %> <br/>
국어 : <%=sb.getKor() %> <br/>
영어 : <%=sb.getEng() %> <br/>
수학 : <%=sb.getMath() %> <br/>
총점 : <%=sb.getTotal() %> <br/>
평균 : <%=sb.getAvg() %> <br/>
학점 : <%=sb.getGrade() %> <br/>
</body>
</html>