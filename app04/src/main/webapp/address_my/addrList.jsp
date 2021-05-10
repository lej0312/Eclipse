<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#btnSearch").click(function(){
		$.getJSON("search.my",
			{"field" : $("#field").val(), "word" : $("#word").val()},		
			function(resp) {
				fsuccess(resp);
			})
		});//btnSearch
	fsuccess = function(resp) {
		$("#count").html(resp.count);
		var str="";
		$.each(resp.arr, function(key, val){
			str += "<tr>"
			str += "<td>" + (resp.count-key) + "</td>"
			str += "<td>" + val.name + "</td>"
			str += "<td>" + val.addr + "</td>"
			str += "<td>" + val.tel + "</td>"
			str += "<td onclick='fdelete("+val.num+")'>삭제</td>"
			str += "</tr>"
		})
		$("table tbody").html(str);
	}
});//document

function fdelete(num){
	if(confirm("정말 삭제할까요?")){
		$.getJSON("deleteAjax.my?num="+num, function(resp){
			fsuccess(resp);
		})
	}
}

</script>
</head>
<body>
<a href="insert.my">글쓰기</a>
<h3>회원목록보기(<span id="count">${count }</span>)</h3>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
			<th>전화번호</th>
			<th>삭제</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${arr }" var="address" varStatus="st">
	<tr>
		<td>${count-st.index }</td>
		<td><a href="view.my?num=${address.num }">${address.name }</a></td>
		<td>${address.addr }</td>
		<td>${address.tel }</td>
		<td onclick="fdelete(${address.num})">삭제</td>
	</tr>
	</c:forEach>
	</tbody>
</table>
<br/><br/><br/><br/>
<div align="center">
	<form name="search" id="serach">
		<select name="field" id="field">
			<option value="name">이름</option>
			<option value="tel">전화번호</option>
		</select>
		<input type="text" name="word" id="word">
		<input type="button" value="찾기" id="btnSearch">
	</form>
</div>

</body>
</html>