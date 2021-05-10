<%@page import="com.address.Address"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.address.AddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<%
	AddressDAO dao = AddressDAO.getInstance();
	ArrayList<Address> arr = dao.getList();
	
%>
</head>
<body>
<div class="container">
  <h2>전체보기</h2>
  <div align="right">
  	<a href="insert.jsp">추가하기</a>
  </div>
   <table class="table table-hover mt-5"> <!-- mt-5 : 위로 여백을 5 줌 cf)mb -->
    <thead>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>주소</th>
        <th>전화번호</th>
      </tr>
    </thead>
    <tbody>
<%
	for(Address ad : arr){
%>		
		<tr>
			<td><%=ad.getNum() %></td>
			<td><%=ad.getName() %></td>
			<td><%=ad.getAddr() %></td>
			<td><%=ad.getTel() %></td>
		</tr>
<%
	}
%>
    </tbody>
  </table>
</div>
</body>
</html>