<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	String phone = request.getParameter("phone");
	out.println("이름 : "+name);
%>
	<br>
<%
	out.println("주소 : "+addr);
%>

<body>
	<hr/>
	<!--  주석:ctrl+shift+/  -->
		이름1 : <% out.println(name); %> <br/>
		주소1 : <% out.println(addr); %> <br/>
	<hr/>
		이름2 : <%=name %> <br/>
		주소2 : <%=addr %> <br/>
		전화번호 : <%=phone %>
</body>
</html> 