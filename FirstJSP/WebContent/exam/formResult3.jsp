<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="fb" class="com.exam.FormBean"/> <!-- id:본인이 지정하는 것  -->
<jsp:setProperty property="*" name="fb"/>
<%
	String h[] = fb.getHobby();
	String tmp = "";
	for (int i=0; i<h.length; i++) {
		tmp += h[i] + " ";
	}
%>

</head>
<body>
비밀번호 : <%=fb.getPwd() %><br/>
이름 : <%=fb.getName() %><br/>
나이 : <%=fb.getAge() %><br/>
성별 : <%=fb.getGender() %><br/>
관심분야 : <%=tmp %><br/>
직업 : <%=fb.getJob() %><br/>
<hr/>
이름 : <jsp:getProperty property="name" name="fb"/><br/>
성별 : <jsp:getProperty property="gender" name="fb"/><br/>
</body>
</html>