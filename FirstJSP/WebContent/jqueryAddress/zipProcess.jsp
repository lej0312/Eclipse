<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.jqueryAddress.ZipCodeVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jqueryAddress.JAddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String dong = request.getParameter("dong");
	//String dong = "서면";
	JAddressDAO dao = JAddressDAO.getInstance();
	ArrayList<ZipCodeVO> zarr = dao.getZipcode(dong);
	//java -> JSON 변환
	JSONArray jarr = new JSONArray();
	for(ZipCodeVO z : zarr){
		JSONObject obj = new JSONObject();
		obj.put("zipcode", z.getZipcode());
		obj.put("sido", z.getSido());
		obj.put("gugun", z.getGugun());
		obj.put("dong", z.getDong());
		obj.put("bunji", z.getBunji());
		jarr.add(obj);
	}
	out.println(jarr.toString());
%>