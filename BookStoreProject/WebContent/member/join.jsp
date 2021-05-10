<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<script src="../js/member.js"></script>
<div class="container">

	<h2>회원가입</h2>
	<br/>
	<form action="join" id="frm" method="post">
		<div class="row">
			<div class="col">
				<label for="userid">아이디</label> <input type="text"
					class="form-control" id="userid" placeholder="아이디 입력" name="userid"
					readonly="readonly">
			</div>
			<div class="col align-self-end">
				<button type="button" id="idCheckBtn" class="btn btn-warning">아이디
					중복 확인</button>
			</div>
		</div>
		<div class="form-group">
			<label for="pwd">비밀번호</label> <input type="password"
				class="form-control" id="pwd" placeholder="비밀번호 입력" name="pwd">
		</div>
		<div class="form-group">
			<label for="pwd_check">비밀번호 재확인</label> <input type="password"
				class="form-control" id="pwd_check" placeholder="비밀번호 재입력"
				name="pwd_check">
		</div>
		<div class="form-group">
			<label for="name">이름</label> <input type="text" class="form-control"
				id="name" placeholder="이름 입력" name="name">
		</div>
		<div class="form-group">
			<label for="email">이메일</label> <input type="text"
				class="form-control" id="email" placeholder="이메일 입력" name="email">
		</div>
		<div class="form-group">
			<label for="phone">전화번호</label> <input type="text"
				class="form-control" id="phone" placeholder="전화번호 입력" name="phone">
		</div>
		<div class="form-group">
			<label for="addr">주소</label> <input type="text" class="form-control"
				id="addr" placeholder="주소 입력" name="addr">
		</div>
		<br/>
		<button type="button" class="btn btn-warning" id="sendBtn">회원가입</button>
		<button type="reset" class="btn btn-secondary" id="reset">다시
			작성</button>
	</form>
</div>

<%@ include file="../include/footer.jsp"%>