<%@page import="com.address.ZipCodeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.address.AddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a:link		{text-decoration: none; color:#000}
	a:hover 	{text-decoration: none; color:#000}
	a:visited 	{text-decoration: none; color:#000}
</style>
<%
	request.setCharacterEncoding("utf-8");
	String dong = request.getParameter("dong");
	AddressDAO dao = AddressDAO.getInstance();
	ArrayList<ZipCodeBean> zarr = dao.zipcodeRead(dong);
%>
<script>
function dongCheck() {
	//if(document.getElementById("dong").value==""){
	if(document.querySelector("#dong").value==""){
		alert("동이름을 입력하세요.");
		//document.getElementById("dong").focus(); //focus:커서 깜빡이는 것
		document.querySelector("#dong").focus();
		return;
	}
	//document.getElementById("frm").submit();
	document.querySelector("#frm").submit();
}
	
function send(code, sido, gugun, dong, bunji) {
	const address = sido + " " + gugun + " " + dong + " " + bunji; //const 대신 var사용 가능
	//alert(address);
	//opener.document.getElementById("zipcode").value = code;
	//opener.document.getElementById("addr").value = address;
	opener.document.querySelector("#zipcode").value = code;
	opener.document.querySelector("#addr").value = address;
	self.close();
	
}
</script>
</head>
<body>
<b>우편번호 찾기</b>
<form action="zipCheck.jsp" id="frm">
	<table>
		<tr>
			<td>동이름 입력 : <input type="text" name="dong" id="dong">
			<input type="button" value="검색" onclick="dongCheck()">
			</td>
		</tr>
		<tr>
<%
		if(zarr.isEmpty()) {
%>
				<td>검색 결과가 없습니다.</td>
<%
		} else {
%>
				<td>* 검색 후, 아래 우편번호를 클릭하면 자동으로 입력됩니다.</td>
<%
		}
%>
		</tr>
<%
	for(ZipCodeBean z : zarr) {
		String zip = z.getZipcode();
		String sido = z.getSido();
		String bunji = z.getBunji();
		String gugun = z.getGugun();
		String d = z.getDong();
%>
		<tr>
			<td><a href="javascript:send('<%=zip%>','<%=sido%>','<%=gugun%>','<%=d%>','<%=bunji%>')">
			<%=zip %> <%=sido %> <%=gugun %> <%=d %> <%=bunji %></a></td>
		</tr>
<%
	}
%>
	
		
	</table>
</form>
</body>
</html>

<!-- 자바스크립트
변수 var
호이스팅:변수 위로 올려주는것..?

ecma Script 2015 => es6
변수
const : 변하지 않는 값
let : 변하는 값
화살표 함수 -->