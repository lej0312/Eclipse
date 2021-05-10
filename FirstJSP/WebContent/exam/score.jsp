<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function check() { //값들이 비어져있거나 옳바르지 못한 형식으로 입력할 때 
	if(document.getElementById("name").value==""){ //DOM(Document Object Modem?Model?)
		alert("이름을 입력하세요.");
		return; //return값이 없을때 사용하는 return=종료
	}
	if(document.getElementById("kor").value==""||isNaN(document.getElementById("kor").value)){
		alert("국어 점수(숫자)를 입력하세요.");
		return;
	}
	if(document.getElementById("math").value==""||isNaN(document.getElementById("math").value)){
		alert("수학 점수(숫자)를 입력하세요.");
		return;
	}
	if(document.getElementById("eng").value==""||isNaN(document.getElementById("eng").value)){
		alert("영어 점수(숫자)를 입력하세요.");
		return;
	}
	frm.submit();	
}
</script>
</head>
<body>
	<form action="scoreResult.jsp" name="frm">
	이름 : <input type="text" name="name" id="name"><br> <!-- id값을 줘야 객체를 찾음  -->
	국어 : <input type="text" name="kor" id="kor"><br>
	수학 : <input type="text" name="math" id="math"><br>
	영어 : <input type= "text" name="eng" id="eng"><br>
	<input type="button" value="성적조회" onclick="check()"> <!-- submit 불가 -->
	<!-- <button type="button" onclick="check()">성적조회 button</button> button 기본이 submit이기 때문에 type="button" 해줘야함...? -->
	<input type="reset" value="취소" > 
	</form>
</body>
</html>

<!-- 
DOM
Jquery : 자바스크립트 모음
1. 다운로드
2. CDN -->