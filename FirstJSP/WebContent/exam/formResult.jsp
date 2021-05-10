<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf-8");	/* post로 설정할 경우 글자가 깨지기 떄문에 써줘야 함 */
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name"); /* getParameter:하나만  */
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String job = request.getParameter("job");
	String[] hobby = request.getParameterValues("hobby"); /* getParameterValues:여러개 가능 */
	String tmp="";
	try {
		for (int i=0; i<hobby.length; i++) {
			tmp += hobby[i] + " ";
		}
	} catch (NullPointerException e) {
		tmp = "선택없음";
	}
	
%> <!-- 스크립트릿 안에 자바 문법 그대로 사용하면 됨  -->
</head>
<body>
	비밀번호 : <%=pwd %> <br/>
	이름 : <%=name %> <br/>
	나이 : <%=age %> <br/>
	성별 : <%=gender %> <br/>
	관심분야 : <%=tmp %> <br/> <!-- tmp 넣는것 체크  -->
	직업 : <%=job %> <br/>
	<hr>
	이름: <%=request.getParameter("name") %>
</body>
</html>