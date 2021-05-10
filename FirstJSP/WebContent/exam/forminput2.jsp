<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
//$(document).ready(function(){
$(function(){
	$("#btn").click(function(){
		if($("#pwd").val()==""){ 
			alert("비밀 번호를 입력하세요.");
			return false;
		}
		if($("#name").val()==""){
			alert("이름를 입력하세요.");
			return false;
		}
		if($("#age").val()==""){
			alert("나이를 입력하세요.");
			return false;
		}
		if($("input:radio[name=gender]:checked").length==0){ //#은 id, class는 .
			alert("성별 선택");
			return false;
		}
		if($("input:checkbox[name=hobby]:checked").length==0){
			alert("관심분야 선택");
			return false;
		}
		$("#frm").submit();	
	})
})
</script>
</head>
<body>
	<form action="formResult.jsp" method="post" id="frm> 
	<!-- method="get"은 기본값이라 생략  주소에 내용이 담김  
	post를 사용하면 헤드에 담겨서 보이지 않음 -->
		비밀번호 : <input type="password" name="pwd" id="pwd"><br> <!-- id:유일할때 사용 cf)class:여러개일때  -->
		이름 : <input type="text" name="name" id="name"><br>
		나이 : <input type="text" name="age" id="age"><br>
		성별 : <input type="radio" name="gender" value="여자" checked>여자
		<input type="radio" name="gender" value="남자">남자
		<br>
		관심분야<br> 
		<input type="checkbox" name="hobby" value="운동">운동
		<input type="checkbox" name="hobby" value="게임">게임
		<input type="checkbox" name="hobby" value="등산">등산
		<input type="checkbox" name="hobby" value="영화">영화
		<br>
		직업 : <select name="job" id="job">
			<option value="학생">학생</option> 
			<option value="공무원">공무원</option>
			<option value="기타">기타</option>
			</select><br>
		<input type="button" value="전송" id="btn">
	</form>
</body>
</html>

<!-- 
val() ==> getter역할해서 값을 가져오고
val(5) ==> setter 5를 넣어줌
 -->
