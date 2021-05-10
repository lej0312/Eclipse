<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function() {
	$("#getBtn").on("click", function() {
		$.get("process.jsp",
				{
					"id" : $("#id").val(),
					"pwd" : $("#pwd").val(),
					"method" : "get"
				}
		)//get
		.done(function(resp){
			$("#result").html(resp); //.:앞부분 처리 후 실행
		})
	})//getBtn
	
	$("#postBtn").on("click", function() {
		const test = $.get("process.jsp", { //const 생략 가능 혹은 var사용 가능
					"id" : $("#id").val(),
					"pwd" : $("#pwd").val(),
					"method" : "post"
		})//post
		test.done(function(resp) {
			$("#result1").html(resp);
		})
	})//postBtn
	
	$("#ajaxBtn").on("click", function() {
		$.ajax({
			type : "get",
			url : "process.jsp",
			data : {
				"id" : $("#id").val(),
				"pwd" : $("#pwd").val(),
				"method" : "ajax"
			}
		})//ajax
		.done(function(resp) {
			$("#result1").html(resp);
		})
		.fail(function(e){
			alert("error : " + e);
		})
	})//ajaxBtn
	
	
})//document

</script>
</head>
<body>
id : <input type="text" id="id" name="id"><br>
pwd : <input type="text" id="pwd" name="pwd"><br>
<button type="button" id="getBtn">get 전송</button>
<button type="button" id="postBtn">post 전송</button>
<button type="button" id="ajaxBtn">ajax 전송</button>
<hr>
<div id="result"></div>
<div id="result1"></div>
</body>
</html>
