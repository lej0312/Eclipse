<%@page import="com.member.dao.MemberDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//id가 db에 존재하는지 안하는지 구분
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid");
	MemberDAOImpl dao = MemberDAOImpl.getInstance();
	String flag = dao.idCheck(userid);
	out.println(flag);
%>