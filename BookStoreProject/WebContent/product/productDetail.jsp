<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<script>
function productDel(pid){
	if(confirm('정말 삭제할까요?')){
		location.href="pdelete?productId="+pid;
	}
}
</script>
<div class="container">
	<h2>상세보기</h2>
	<div class="d-flex container">
		<div class="card" style="width: 400px">
			<img class="card-img-top"
				src="/BookStoreProject/upload/${product.filename }" alt="Card image">
		</div>
		<div class="container">
			<table class="table table-boarderless">
				<tr>
					<td width="200px">도서명</td>
					<td>${product.pname }(${product.category })</td>
				</tr>
				<tr>
					<td>작가</td>
					<td>${product.writer }</td>
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
						<button class="btn btn-primary" onClick="location.href='#'">장바구니
							담기</button>
						<button class="btn btn-warning" onClick="location.href='#'">바로구매</button>
						<button class="btn btn-secondary" onClick="location.href='plist'">상품목록</button>
						<c:if test="${sessionScope.user.admin==1 }">
							<button class="btn btn-secondary" onclick="location.href='pupdate?productId=${product.productId}'">수정</button>
							<button class="btn btn-secondary" onclick="productDel(${product.productId})">삭제</button>
						</c:if>
				</tr>
			</table>
		</div>
	</div>
	<div id="comments">
		<h2>한 줄 리뷰</h2>
		<ul>
			<li>
				<article>
					<header>
						<address>
							<a href="#">이달랑</a>님의 리뷰
						</address>
					</header>
					<div class="comcont">
						<p>
							깨알같은 일상의 리뷰<br>읽으면 읽을수록 공감도 되고 재밌네요!
						</p>
					</div>
				</article>
			</li>
			<li>
				<article>
					<header>
						<address>
							<a href="#">이두부</a>님의 리뷰
						</address>
					</header>
					<div class="comcont">
						<p>미친듯한 전개와 흡입력!</p>
					</div>
				</article>
			</li>
		</ul>
		<h2>한 줄 리뷰 쓰기</h2>
		<form action="#" method="post">
			<div class="block clear">
				<textarea name="comment" id="comment" cols="10" rows="5"></textarea>
			</div>
			<div>
				<input type="submit" name="submit" value="등록"> &nbsp; <input
					type="reset" name="reset" value="취소">
			</div>
		</form>
	</div>
</div>

<%@ include file="../include/footer.jsp"%>