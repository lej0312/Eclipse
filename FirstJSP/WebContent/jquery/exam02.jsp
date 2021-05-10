<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function(){ //세가지 인자를 가짐 (?,가야할 페이지,콜백함수)
	$("#getBtn").click(function(){
		$.get("process.jsp",
				{
				"id" : $("#id").val(),
				"pwd" : $("#pwd").val(),
				"method" : "get"
				},
				function(data){
					//alert(data);
					$("#result").html(data); //jquery에는 html이라는 함수 존재-태그형태를 그대로 적용
				} //function 부분 : 콜백함수
		)//get
	})//getBtn
	
/* 	$("#postBtn").click(function(){
		$.post("process.jsp",{
			"id" : $("#id").val(),
			"pwd" : $("#pwd").val(),
			"method" : "post"
		},function(resp){
			//alert(resp);
			$("#result1").html(resp);
		})
	}) */
	
 	$("#postBtn").on("click", function(){
		$.post("process.jsp",{
			"id" : $("#id").val(),
			"pwd" : $("#pwd").val(),
			"method" : "post"
		},function(resp){
			//alert(resp);
			$("#result1").html(resp);
		})
	})//postBtn
	
	$("#ajaxBtn").on("click", function(){
		$.ajax({
			type : "get", 
			url : "process.jsp", //가고자하는 페이지
			data : {
				"id" : $("#id").val(),
				"pwd" : $("#pwd").val(),
				"method" : "ajax"
			},
			success : function(resp){
				//alert(resp);
				$("#result1").html(resp);
			},
			error : function(e){
				alert(e + "error");
			}
			
		});//$.ajax
	});//ajaxBtn
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



<!-- 페이지 이동없이 한 화면에 결과값 출력  -->

<!-- 
JSON
키 : 값 형태로
-->