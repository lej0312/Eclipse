<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<div class="container">
	<h2>게시글 상세보기</h2>
	<input type="hidden" name="num" id="num" value="${board.num }">
	<table class="table">
		<tr class="table-info">
			<th>글번호</th>
			<td id="no">${board.num }</td>
			<th>조회수</th>
			<td>${board.readcount }</td>
		</tr>
		<tr class="table-info">
			<th>작성자</th>
			<td>${board.userid}</td>
			<th>작성일</th>
			<td>${board.regdate }</td>
		</tr>
		<tr class="table-info">
			<th>글제목</th>
			<td colspan="3">${board.subject}</td>
		</tr>
		<tr class="table-info">
			<th>글내용</th>
			<td colspan="3">${board.content}</td>
		</tr>
	</table>
	<br>
	<c:if test="${sessionScope.user.userid==board.userid }">
		<!-- 삭제할 경우(작성글=작성자id)에만 보이게 -->
		<button type="button" class="btn btn-primary"
			onclick="location.href='boardupdate?num=${board.num}'">수정</button>
		<button type="button" class="btn btn-secondary" id="delBtn">삭제</button>
	</c:if>

	<div class="container mt-5">
		<textarea rows="5" cols="50" id="msg"></textarea>
		<button type="button" class="btn btn-warning" id="commentBtn">
			댓글 남기기</button>
	</div>
	<div id="result"></div>
</div>
<script>
	var init = function() {
		$.getJSON("commentlist", {
			"bnum" : $("#num").val()
		}, function(resp) {
			var str = "<table class='table table-hover'>"
			$.each(resp, function(key, val) {
				str += "<tr>";
				str += "<td>" + val.msg + "</td>";
				str += "<td>" + val.userid + "</td>";
				str += "<td>" + val.regdate + "</td>";
				str += "</tr>";
			})
			str += "</table>"
			$("#result").html(str);
		}) //getJSON

	}

	$("#commentBtn").on("click", function() {
		//alert($("#no").text())
		$.ajax({
			type : "get",
			url : "commentInsert",
			data : {
				"msg" : $("#msg").val(),
				"bnum" : $("#num").val()
			}
		}).done(function(resp) {
			if (resp.trim() == "1") {
				alert("로그인하세요");
				location.href = "/member/login";
			} else {
				//alert("성공")
				init();
				$("#msg").val('');
			}

		}).fail(function(e) {
			alert("Comment 추가 실패")
		})
	})

	$("#delBtn").click(function() {
		if (confirm("정말 삭제할까요?")) {
			//location.href="delete?num="+${board.num}
			$.getJSON("delete", {
				"num" : $("#num").val()
			}, function(resp) {
				if (resp == 0) {
					alert("삭제할 수 없습니다.")
				} else {
					alert("삭제성공");
					location.href = "/board/boardlist";
				}
			}) //getJSON
		} //confirm
	}) //delBtn

	init();
</script>

<%@ include file="../include/footer.jsp"%>