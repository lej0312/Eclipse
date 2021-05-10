<%@page import="com.exam.DataBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DataBean bean = new DataBean(); //객체생성, 자바에서 만들고 임포트  //태그가 없어서 html부분 지워도 됨
%>
<%=bean.getToday() %> 
