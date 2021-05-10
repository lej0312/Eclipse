<%@page import="com.jqueryAddress.AddressVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jqueryAddress.JAddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function(){
	$("#btnSearch").click(function() {
		$.ajax({
			type : "get", 
			url : "searchProcess.jsp",
			data : {
				"field" : $("#field").val(),
				"word" : $("#word").val()
			},
			success : function(resp) {
				alert(resp);
				//resp JSON 형태를 인식 
				var d = JSON.parse(resp); //데이터(jarrObj), 개수(countObj)
				var str = "";
				$.each(d.jarrObj, function(key, val){
					str += "<tr>";
					str += "<td>" + val.num + "</td>";
					str += "<td><a href='addrDetail.jsp?num="+val.num+"'>" + val.name + "</a></td>";
					str += "<td>" + val.addr + "</td>";
					str += "</tr>";
				})
				$("table tbody").html(str); //table 안의 tbody
				$("#cntSpan").text(d.countObj.count)
			},
			error : function(e) {
				alert("error : " + e);
			}
			
		})//ajax	
	})//btnSearch click
})//document
</script>
</head>
<body>
<%
	JAddressDAO dao = JAddressDAO.getInstance();
	ArrayList<AddressVO> arr = dao.list();
	int count = dao.addrCount();
%>
</head>
<body>
  <div align="right">
  	<a href="insert.jsp">추가하기</a>
  </div>
  <h3>전체보기(<span id="cntSpan"><%=count %></span>)</h3>
  <table>
    <thead>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>주소</th>
      </tr>
    </thead>
    <tbody>
<%
	for(AddressVO ad : arr){
%>		
		<tr>
			<td><%=ad.getNum() %></td>
			<td><a href="addrDetail.jsp?num=<%=ad.getNum()%>"><%=ad.getName() %></a></td>
			<td><%=ad.getAddr() %></td>
		</tr>
<%
	}
%>
    </tbody>
  </table>
  	<select name="field" id="field">
  		<option value="name">이름</option>
  		<option value="tel">전화번호</option>
  	</select>
  	<input type="text" name="word" id="word">
  	<input type="button" value="검색" id="btnSearch">
</body>
</html>