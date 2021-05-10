<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

	
	<div class="d-flex container">
	<h2>주문 관리</h2>
		<div class="card" style="width:400px">
			<img class="card-img-top" src="/ServletProject03/upload/${product.filename }" alt="Card image">
		</div>
		<div class="container">
			<table class="table table-boarderless">
				<tr>
					<td width="200px">상품명</td>
					<td>${product.pname }(${product.category })</td>
				</tr>
				<tr>
					<td>판매가</td>
					<td>${product.unitPrice }</td>
				</tr>
				<tr>
					<td>상품설명</td>
					<td>${product.description }</td>
				</tr>

				<tr>
					<td colspan="2">
						<button class="btn btn-warning">장바구니 담기</button>
						<button class="btn btn-primary">바로 구매</button>
						<button class="btn btn-secondary" onClick="location.href='plist'">상품 목록</button>
				</tr>
			
			</table>
		</div>
	</div>


<%@ include file="../include/footer.jsp" %>