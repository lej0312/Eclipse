<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<div class="container">
	<h2>도서목록</h2>
	<div class="container">
		<div class="row">
			<c:forEach items="${products }" var="product">
				<div class="col-4" style="width: 400px">
					<img class="card-img-top"
						src="/BookStoreProject/upload/${product.filename }"
						alt="Card image" style="width: 180px; height: 220px">
					<div class="card-body">
						<h3 class="card-title">${product.pname }/${product.writer }</h3>
						<p class="card-text">${product.description }</p>
						<a href="pdetail?productId=${product.productId }"
							class="btn btn-primary">상세보기</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>

<%@ include file="../include/footer.jsp"%>