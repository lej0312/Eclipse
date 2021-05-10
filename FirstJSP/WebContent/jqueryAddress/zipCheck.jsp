<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
// $(document).ready(function(){
// 	$("#send").on("click",function(){//비동기함수(값을 가지고 감)
// 		$.getJSON("zipProcess.jsp",//JSON 형태로 받아 옴
// 				{"dong":$("#dong").val()})//zP페이지로 dong 가지고 감 / input 타입은 val 
// 				.done(function(resp){//콜백
// 					alert(resp.length);
// 				})
// 		)//getJSON
// 	})//send
$(document).ready(function(){
	$("#send").on("click", function(){
		$.getJSON("zipProcess.jsp", 
				{ "dong" : $("#dong").val()},
				function(resp) {
					//alert(resp.length);
					var str = "<table>"
					$.each(resp, function(key, val) {
						str += "<tr>"
						str += "<td>" + val.zipcode + "</td>"
						str += "<td>" + val.sido + "</td>"
						str += "<td>" + val.gugun + "</td>"
						str += "<td>" + val.dong + "</td>"
						str += "<td>" + val.bunji + "</td>"
						str += "</tr>"
					})
					str += "</table>"
					$("#result").html(str);				
				}
		)//getJSON
	})//send
	$("#result").on("click", "tr", function() {//result 영역에서 tr이 클릭되면 실행
		var address = $("td:eq(1)", this).text()+" "+ //this:클릭한 tr
					$("td:eq(2)", this).text()+" "+
					$("td:eq(3)", this).text()+" "+
					$("td:eq(4)", this).text()
		$(opener.document).find("#zipcode").val($("td:eq(0)", this).text());
		$(opener.document).find("#addr").val(address);
		self.close();
	})
	
})//document

</script>
</head>
<body>
<table>
	<tr>
		<td>동이름<input type="text" name="dong" id="dong"/>
		<input type="button" value="검색" id="send"/>
		</td>
	</tr>
</table>
<div id="result"></div>


</body>
</html>