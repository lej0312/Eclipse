<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	Calendar ca = Calendar.getInstance();
	String[] arr = {"일","월","화","수","목","금","토"};
	String day = "";
	int num = 0;
	switch(ca.get(Calendar.DAY_OF_WEEK)){
	case 1:day = "일요일"; break;
	case 2:day = "월요일"; break;
	case 3:day = "화요일"; break;
	case 4:day = "수요일"; break;
	case 5:day = "목요일"; break;
	case 6:day = "금요일"; break;
	case 7:day = "토요일"; break;
	}
%>
</head>
<body>
오늘은 
<%=ca.get(Calendar.YEAR) %>년
<%=ca.get(Calendar.MONTH)+1 %>월 <!-- 0부터 시작해서 +1 -->
<%=ca.get(Calendar.DATE) %>일
<%=ca.get(Calendar.DAY_OF_WEEK) %>요일
<hr/>
배열요일 : <%= arr[ca.get(Calendar.DAY_OF_WEEK)-1]%>
<hr/>
switch배열: <%=day %>


</body>
</html>