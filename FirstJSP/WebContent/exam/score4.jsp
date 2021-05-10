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
	$("#btn").click(function(){
		if($("#name").val()==""){
			alert("이름을 입력하세요.");
			return;
		}
		if($("#kor").val()==""||!($.isNumeric($("#kor").val()))){
			alert("국어 점수를 입력하세요.");
			return;
		}
		if($("#math").val()==""||!$.isNumeric($("#math").val())){
			alert("수학 점수를 입력하세요.");
			return;
		}
		if($("#eng").val()==""||!$.isNumeric($("#eng").val())){
			alert("영어 점수를 입력하세요.");
			return;
		}
		$("#frm").submit();
	})
});
</script>
</head>
<body>
<form action="scoreResult4.jsp" id="frm">
	이름 : <input type="text" name="name" id="name"><br> <!-- id값을 줘야 객체를 찾음  -->
	국어 : <input type="text" name="kor" id="kor"><br>
	수학 : <input type="text" name="math" id="math"><br>
	영어 : <input type= "text" name="eng" id="eng"><br>
	<input type="button" value="성적조회" id="btn"> <!-- submit 불가 -->
	<input type="reset" value="취소" > 
</form>
</body>
</html>

<!-- 
DOM
Jquery : 자바스크립트 모음
1. 다운로드
2. CDN -->