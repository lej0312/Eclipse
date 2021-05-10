<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>


<div class="container">
	<h2>도서 정보 수정</h2>
	<form action="update" class="form-horizontal" method="post"
		enctype="multipart/form-data">

		<div class="form-group row">
			<label class="col-sm-2">제목</label>
			<div class="col-sm-3">
				<input type="text" id="name" name="name" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">작가</label>
			<div class="col-sm-3">
				<input type="text" id="writer" name="writer" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">가격</label>
			<div class="col-sm-3">
				<input type="text" id="unitPrice" name="unitPrice"
					class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">정보</label>
			<div class="col-sm-5">
				<textarea name="description" cols="50" rows="2" class="form-control"></textarea>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">출판사</label>
			<div class="col-sm-3">
				<input type="text" name="manufacturer" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">카테고리</label>
			<div class="col-sm-3">
				<input type="text" name="category" class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">재고</label>
			<div class="col-sm-3">
				<input type="text" id="unitsInStock" name="unitsInStock"
					class="form-control">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2">제품 상태</label>
			<div class="form-check-inline">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" name="condition" value="New" checked>새상품
				</label>
			</div>
			<div class="form-check-inline">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" name="condition" value="Old">중고상품
				</label>
			</div>
		</div>

		<div class="form-group row">
			<label class="col-sm-2">파일 수정</label>
			<div class="col-sm-5">
				<input type="file" name="productImage" class="form-control"
					id="productImage">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-sm-offset-2 col-sm-10 ">
				<input type="submit" class="btn btn-warning" value="수정">
			</div>
		</div>
	</form>
</div>


<%@ include file="../include/footer.jsp"%>