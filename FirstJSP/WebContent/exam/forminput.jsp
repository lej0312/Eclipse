<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="formResult.jsp" method="post"> 
	<!-- method="get"은 기본값이라 생략 -> 주소에 내용이 담김  
	post를 사용하면 헤드?에 담겨서 보이지 않음
	-->
		비밀번호 : <input type="password" name="pwd"><br>
		이름 : <input type="text" name="name"><br>
		나이 : <input type="text" name="age"><br>
		성별 : <input type="radio" name="gender" value="여자" checked>여자
		<input type="radio" name="gender" value="남자">남자
		<br>
		관심분야<br> 
		<input type="checkbox" name="hobby" value="운동">운동
		<input type="checkbox" name="hobby" value="게임">게임
		<input type="checkbox" name="hobby" value="등산">등산
		<input type="checkbox" name="hobby" value="영화">영화
		<br>
		직업 : <select name="job">
			<option value="학생">학생</option> 
			<option value="공무원">공무원</option>
			<option value="기타">기타</option>
			</select><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>