<%@page import="com.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="board" class="com.board.dto.BoardDTO"/>
<jsp:setProperty property="*" name="board"/>
<%
	BoardDAO dao = BoardDAO.getInstance();
	String ip = request.getRemoteAddr();
	board.setIp(ip); //ip 주소
	dao.boardInsert(board); //10개 컬럼
	response.sendRedirect("list.jsp");
%>
