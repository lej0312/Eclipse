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
	$("#b1").click(function() {
		$.get("test.txt", function(resp, status){
			var str = "데이터 : " + resp + "\n 상태: " +status
			$("#result").text(str);
		})
		
	})//b1
	
	$("#b2").click(function(){
		$.get("test.txt", function(resp){
			var d = JSON.parse(resp); //parse:json으로 돌아온 결과를 해석해서 원하는 값만
			var str = "";
			for(i=0; i<d.length; i++){ //d.length:2 (홍길동 추가 전)
				console.log(d[i].picture)
				str += "이름 : "+d[i].irum +"<br>"
			}
			$("#result").html(str);
		})
	})
	
	$("#b3").on("click", function(){
		var str = "";
		$.getJSON("test.txt", function(resp){
			$.each(resp, function(key, val){	//each cf)for
				str += "회원번호 : " + val.memberNumber +"<br>";
				str += "이름 : " + val.irum +"<br>";
				str += "이미지 : " + val.picture +"<hr>";
			})//each
			$("#result").html(str);
		})//getJSON
	})//b3
	
})//document
</script>
</head>
<body>
<button id="b1">결과1</button>
<button id="b2">결과2</button>
<button id="b3">결과3</button>
<div id="result"></div>
</body>
</html>

<!-- 
jquery 함수
괄호 안에 값이 없으면 getter 역할
text() : 하얀 바탕(document)
val() : input
html() : 태그 적용

괄호 안에 값이 있으면 setter 역할
text('홍길동') 
val('홍길동')
html('홍길동') 
-->