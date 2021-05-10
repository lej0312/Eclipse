<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.member.dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.member.dao.MemberDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid");
	MemberDAOImpl dao = MemberDAOImpl.getInstance();
	dao.memDelete(userid);
	ArrayList<MemberDTO> arr = dao.memList(); //전체보기 -> 자바코드
	int count = dao.getCount(); //개수 -> 자바코드
	//arr(java) <=> JSON ***체크
	JSONObject mainObj = new JSONObject();//루트
	
	JSONArray jarr = new JSONArray(); //데이터
	for(MemberDTO member : arr){
		String mode = member.getAdmin()==0?"일반회원":"관리자";
		JSONObject obj = new JSONObject();
		obj.put("name", member.getName());
		obj.put("userid", member.getUserid());
		obj.put("email", member.getEmail());
		obj.put("phone", member.getPhone());
		obj.put("pwd", member.getPwd());
		obj.put("admin", mode);
		jarr.add(obj); //회원 정보
	}
	//개수 -> JSON ***여기서부터 밑까지
	JSONObject countObj = new JSONObject();
	countObj.put("count", count);
	//루트에 추가
	mainObj.put("countObj",countObj);
	mainObj.put("jarr", jarr);
	out.println(mainObj.toString());
%>