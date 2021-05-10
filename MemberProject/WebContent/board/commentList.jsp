<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.board.dto.CommentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
   request.setCharacterEncoding("utf-8");
   int bnum = Integer.parseInt(request.getParameter("bnum"));
   BoardDAO dao = BoardDAO.getInstance();
   ArrayList<CommentDTO> carr = dao.commentList(bnum);
   //carr ==> JSON
   
   JSONObject mainObj = new JSONObject(); //루트
   
   JSONArray jarr = new JSONArray(); //데이터(배열)
   for(CommentDTO comm : carr){
      JSONObject obj = new JSONObject();
      obj.put("userid", comm.getUserid());
      obj.put("cnum", comm.getCnum());
      obj.put("bnum", comm.getBnum());
      obj.put("regdate",comm.getRegdate());
      obj.put("msg", comm.getMsg());
      jarr.add(obj);
      
   }
   //루트에 담기
   mainObj.put("main",jarr);
   out.println(mainObj.toString());

%>