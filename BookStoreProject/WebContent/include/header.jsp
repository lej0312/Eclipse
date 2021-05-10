<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>인터넷 서점</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="/BookStoreProject/resources/layout/styles/layout.css"
	rel="stylesheet" type="text/css" media="all">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body id="top">
	<div class="wrapper row0">
		<div id="topbar" class="hoc clear">
			<div class="fl_left">
				<ul class="nospace">
					<c:choose>
						<c:when test="${empty sessionScope.user }">
							<!-- 세션이 없을 때  -->
							<li class="nav-item"><a class="nav-link"
								href="/BookStoreProject/member/login">로그인</a></li>
							<li class="nav-item"><a class="nav-link"
								href="/BookStoreProject/member/join">회원가입</a></li>
							<li class="nav-item"><a class="nav-link" href="#">장바구니</a></li>
						</c:when>
						<c:otherwise>
							<!-- 세션이 있을 때  -->
							<li class="nav-item"><a class="nav-link"
								href="/BookStoreProject/member/logout">로그아웃</a></li>
							<c:if test="${sessionScope.user.admin==0 }">
								<li class="nav-item"><a class="nav-link" href="#">장바구니</a></li>
							</c:if>
							<li class="nav-item"><a class="nav-link"
								href="/BookStoreProject/member/view">정보수정</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
			<div class="fl_right">
				<ul class="navbar-nav">
					<c:if test="${sessionScope.user.admin==1 }">
						<span class="navbar-text">(${sessionScope.user.name }관리자님
							반갑습니다.)</span>
					</c:if>
					<c:if test="${sessionScope.user.admin==0 }">
						<span class="navbar-text">(${sessionScope.user.name }님
							반갑습니다.)</span>
					</c:if>
				</ul>
			</div>
		</div>
	</div>

	<div class="wrapper row1">
		<header id="header" class="hoc clear">
			<div id="logo" class="one_half first">
				<h1 class="logoname">
					<a href="/BookStoreProject/product/plist"><span>인터넷</span>서점</a>
				</h1>
			</div>
		</header>

		<nav id="mainav" class="hoc clear">
			<ul class="clear">
				<li class="active"><a href="/BookStoreProject/product/plist">Home</a></li>
				<li><a href="/BookStoreProject/product/plist">도서</a></li>
				<li><a href="/BookStoreProject/board/boardlist">고객센터</a></li>
				<c:if test="${sessionScope.user.admin==1 }">
					<li><a class="drop" href="/BookStoreProject/product/pinsert">도서관리</a>
						<ul>
							<li><a href="/BookStoreProject/product/pinsert">도서등록</a></li>
							<li><a href="/BookStoreProject/product/plist">도서목록</a></li>
						</ul>
					<li class="nav-item"><a class="nav-link"
						href="/BookStoreProject/member/memberlist">회원관리</a></li>
					<li class="nav-item"><a class="nav-link" href="#">주문관리</a></li>
				</c:if>
			</ul>
		</nav>
	</div>
</body>