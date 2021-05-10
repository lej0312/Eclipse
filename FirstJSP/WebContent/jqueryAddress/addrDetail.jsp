<%@page import="com.jqueryAddress.AddressVO"%>
<%@page import="com.jqueryAddress.JAddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("num"));
	JAddressDAO dao = JAddressDAO.getInstance();
	AddressVO ad = dao.detail(num);
%>
<script>
function addrDel() {
	if (confirm("정말 삭제할까요?")){
		location.href="deleteProcess.jsp?num=<%=num%>";
	}
}

function zipRead(){
	window.open("zipCheck.jsp", "", "width=700 height=400")
}
</script>

</head>
<body>
상세보기
<form action="updateProcess.jsp" method="post"> <!-- form태그는 여백이 있어서 table위에 적어주는 것이 좋음 -->
<input type="hidden" name="num" value="<%=num %>"> <!-- *hidden 보이지는 않지만..? -->
	<table>
	<tr>
		<th>이름</th>
		<td><input type="text" name="name" value="<%=ad.getName() %>"></td>
	</tr>
	<tr>
		<th>우편번호</th>
		<td><input type="text" name="zipcode" id="zipcode" size="7" value="<%=ad.getZipcode() %>">
		<input type="button" value="검색" onclick="zipRead()"> 
		</td>
	</tr>
	<tr>
		<th>주소</th>
		<td><input type="text" name="addr" id="addr" size="70" value="<%=ad.getAddr() %>"> </td>
	</tr>
	<tr>
		<th>전화번호</th>
		<td><input type="text" name="tel" value="<%=ad.getTel() %>"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="수정"> 
			<input type="button" value="함수삭제" onclick="addrDel()"> 
			<input type="button" value="전체보기" onclick="location.href='addrList.jsp'"> 
			<input type="reset" value="취소"> 		
		</td>
	</tr>
	</table>
</form>
</body>
</html>