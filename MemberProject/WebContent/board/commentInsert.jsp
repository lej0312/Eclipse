<%@page import="com.board.dto.CommentDTO"%>
<%@page import="com.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String msg = request.getParameter("msg");
	int bnum = Integer.parseInt(request.getParameter("bnum"));
	String sid = (String)session.getAttribute("userid");
	if(sid==null){ //로그인 안됨
		out.println("1");
	}else{ //로그인 됨
		BoardDAO dao = BoardDAO.getInstance();
		CommentDTO comment = new CommentDTO();
		comment.setMsg(msg);
		comment.setBnum(bnum);
		comment.setUserid(sid); //로그인 된 사람으로 userid
		dao.commentInsert(comment);
	}
%>