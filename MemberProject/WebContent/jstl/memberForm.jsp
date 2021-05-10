<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>회원가입</h2>
		<form action="memberPro.jsp" id="frm" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" id="name" placeholder="Enter name" name="name">
			</div>
			<div class="row">
				<div class="col">
					<label for="userid">UserID:</label> <input type="text"
						class="form-control" id="userid" placeholder="Enter UserId"
						name="userid">
				</div>
				<div class="col align-self-end">
					<button type="button" id="idCheckBtn" class="btn btn-primary">중복확인</button>
				</div>
			</div>
			<div class="form-group">
				<label for="pwd">PWD:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter pwd" name="pwd">
			</div>
			<div class="form-group">
				<label for="pwd_check">PWD_Check:</label> <input type="password"
					class="form-control" id="pwd_check" placeholder="Enter pwd_check"
					name="pwd_check">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="text"
					class="form-control" id="email" placeholder="Enter email"
					name="email">
			</div>
			<div class="form-group">
				<label for="phone">Phone:</label> <input type="text"
					class="form-control" id="phone" placeholder="Enter phone"
					name="phone">
			</div>
			<div class="form-check-inline">
				<label class="form-check-label"> 
				<input type="radio"	class="form-check-input" name="admin" value="0" checked>일반회원
				</label>
			</div>
			<div class="form-check-inline">
				<label class="form-check-label"> 
				<input type="radio" class="form-check-input" name="admin" value="1">관리자
				</label>
			</div>
			<br/>
			<button type="submit" class="btn btn-primary" id="sendBtn">Submit</button>
		</form>
	</div>
</body>
</html>