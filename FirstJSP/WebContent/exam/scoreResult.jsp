<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% 
	request.setCharacterEncoding("utf-8"); //습관적으로 하기...
	int kor = Integer.parseInt(request.getParameter("kor")); //80
	int math = Integer.parseInt(request.getParameter("math")); //70
	int eng = Integer.parseInt(request.getParameter("eng")); //50
	int tot = kor+math+eng;
	int avg = tot/3; //93
	String grade = "";
	switch(avg/10){
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		default : grade="F";
	}
%>
</head>
<body>
	이름 : <%=request.getParameter("name") %> <br/>
	국어 : <%=kor %> <br/>
	수학 : <%=math%> <br/>
	영어 : <%=eng %> <br/>
	총점 : <%=tot %> <br/>
	평균 : <%=avg %> <br/>
	학점 : <%=grade%>
	<!-- 90점 이상 A  
	80점 이상 B
	70점 이상 C
	나머지 F -->
</body>
</html>