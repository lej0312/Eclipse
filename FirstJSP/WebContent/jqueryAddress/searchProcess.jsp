<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.jqueryAddress.AddressVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jqueryAddress.JAddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String field = request.getParameter("field");
	String word = request.getParameter("word");
	JAddressDAO dao = JAddressDAO.getInstance();
	ArrayList<AddressVO> sarr = dao.searchList(field, word); //검색 전체보기
	int count = dao.searchCount(field, word);//검색 개수
	//sarr(자바) -> JSON
	
	//mainObj (루트)
	JSONObject mainObj = new JSONObject();
	
	//countObj (개수)
	JSONObject countObj = new JSONObject();
	countObj.put("count", count);
	
	JSONArray jarr = new JSONArray();
	for (AddressVO avo : sarr){
		JSONObject obj = new JSONObject();
		obj.put("num", avo.getNum());
		obj.put("name", avo.getName());
		obj.put("addr", avo.getAddr());
		obj.put("tel", avo.getTel());
		obj.put("zipcode", avo.getZipcode());
		jarr.add(obj);
	}
	mainObj.put("countObj", countObj);
	mainObj.put("jarrObj", jarr);
	
	out.println(mainObj.toString());
%>