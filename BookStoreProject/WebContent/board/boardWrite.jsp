<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<div class="container">

	<form action="write" method="post" id="frm">
		<div class="form-group">
			<label for="writer">아이디</label> <input type="text"
				class="form-control" id="userid" name="userid"
				value="${sessionScope.user.userid }" readonly="readonly">
		</div>
		<div class="form-group">
			<label for="subject">제목</label> <input type="text"
				class="form-control" id="subject" placeholder="제목을 입력하세요"
				name="subject">
		</div>
		<div class="form-group">
			<label for="eamil">이메일</label> <input type="text"
				class="form-control" id="email" placeholder="이메일을 입력하세요"
				name="email">
		</div>
		<div class="form-group">
			<label for="content">내용</label>
			<textarea class="form-control" rows="5" id="content" name="content"></textarea>
		</div>
		<button type="submit" class="btn btn-primary">글쓰기</button>
	</form>
</div>
<%@ include file="../include/footer.jsp"%>
