<%@page import="com.address.AddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="ad" class="com.address.Address"/>
<jsp:setProperty property="*" name="ad"/>
<%
	AddressDAO dao = AddressDAO.getInstance();
	dao.addressInsert(ad);
	response.sendRedirect("list.jsp"); //list페이지로 이동
%>

