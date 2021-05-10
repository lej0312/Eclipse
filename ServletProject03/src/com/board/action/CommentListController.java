package com.board.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.board.model.CommentDTO;
import com.board.model.SBoardDAO;
import com.board.model.SBoardDAOImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class CommentListController
 */
@WebServlet("/board/commentlist")
public class CommentListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 int bnum = Integer.parseInt(request.getParameter("bnum"));
		 SBoardDAO sdao = SBoardDAOImpl.getInstance();
		 ArrayList<CommentDTO> carr = sdao.findAllComment(bnum);
//		 JSONArray jarr = new JSONArray();
//		 for(CommentDTO com : carr) {
//			 JSONObject obj = new JSONObject();
//			   obj.put("userid" , com.getUserid());
//			   obj.put("bnum" , com.getBnum());
//			   obj.put("cnum" , com.getCnum());
//			   obj.put("msg" , com.getMsg());
//			   obj.put("regdate" , com.getRegdate());
//			   jarr.add(obj);
//		 }
//		 response.setContentType("application/json;charset=utf-8");
//		 PrintWriter out = response.getWriter();
//		 out.println(jarr.toJSONString());
		 
		 //�ڹ� object => json
		 Gson gson = new Gson();
		 String obj = gson.toJson(carr);
		 response.setContentType("application/json;charset=utf-8");
		 PrintWriter out = response.getWriter();
		 out.println(obj.toString());
		 
	 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
