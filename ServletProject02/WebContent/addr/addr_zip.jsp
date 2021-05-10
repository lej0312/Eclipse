<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function() {
	$("#send").on("click", function() {
		sendIt();
	})
	$("#dong").keydown(function(e){
		if(e.keyCode==13){ //keyCode:13=엔터 엔터치면 값이 들어가게함 
			sendIt();
			return false;
		}
	}) //keydown
	$("#result").on("click", "tr", function() {
		var address = $("td:eq(1)", this).text()+" "+
					$("td:eq(2)", this).text()+" "+
					$("td:eq(3)", this).text()+" "+
					$("td:eq(4)", this).text()
		$(opener.document).find("#zipcode").val($("td:eq(0)", this).text());
		$(opener.document).find("#addr").val(address);
		self.close();
	}) //result
}) //document
var sendIt = function() {
	if($("#dong").val()==""){
		alert("동이름을 입력하세요.")
		$("#dong").focus();
		return false;
	}
	$.ajax({
		type : "post",
		url : "zip.addr",
		data : {"dong" : $("#dong").val()} //JSON-get방식이라서 사용 불가
	})
	.done(function(d) {
		var str = "<table>";
/* 		for(i=0; i<d.length; i++){
			str += "<tr>"
			str += "<td>"+d[i].zipcode+"</td>"
			str += "<td>"+d[i].sido+"</td>"
			str += "<td>"+d[i].gugun+"</td>"
			str += "<td>"+d[i].dong+"</td>"
			str += "<td>"+d[i].bunji+"</td>"
			str += "</tr>"
		} */
		$.each(d, function(key, val) {
			str += "<tr>"
				str += "<td>"+val.zipcode+"</td>"
				str += "<td>"+val.sido+"</td>"
				str += "<td>"+val.gugun+"</td>"
				str += "<td>"+val.dong+"</td>"
				str += "<td>"+val.bunji+"</td>"
				str += "</tr>"
		})
		str += "</table>"
		$("#result").html(str);
	})
	.fail(function(e) {
		alert("error : " + e);
	})
}
</script>

</head>
<body>
	<table>
		<tr>
			<td>동이름 입력 : <input type="text" name="dong" id="dong">
			<input type="button" value="검색" id="send">
			</td>
		</tr>
	</table>
	<div id="result"></div>
</body>
</html>