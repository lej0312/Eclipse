package com.member.action;

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

import com.member.model.SMemberDAO;
import com.member.model.SMemberDAOImpl;
import com.member.model.SMemberDTO;

/**
 * Servlet implementation class UserDeleteController
 */
@WebServlet("/member/userDelete")
public class UserDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 String userid = request.getParameter("userid");
		 SMemberDAO dao =SMemberDAOImpl.getInstance();
		 dao.memberDelete(userid); //����
		 ArrayList<SMemberDTO> arr = dao.getMember(); //��ü���
		 int count = dao.memberCount();//ȸ����
		 //json ����ؾ� ��.
		 
		 //����(��Ʈ)
		 JSONObject mainObj = new JSONObject();
		 //ī��Ʈ
		 JSONObject countObj = new JSONObject();
		 countObj.put("count", count);
		 //ȸ�����
		 JSONArray jarr = new JSONArray();
		 for(SMemberDTO dto : arr) {
			 String mode = dto.getAdmin()==1?"������":"�Ϲ�ȸ��";
			 JSONObject obj = new JSONObject();
			 obj.put("name", dto.getName());
			 obj.put("userid", dto.getUserid());
			 obj.put("email", dto.getEmail());
			 obj.put("phone", dto.getPhone());
			 obj.put("mode",  mode);
			 jarr.add(obj);
		 }
		 
		 //mainObj ���
		 mainObj.put("jarr", jarr);
		 mainObj.put("countObj", countObj);
		 //json ���
		 response.setContentType("application/json;charset=utf-8");
		 PrintWriter out = response.getWriter();
		 out.println(mainObj.toJSONString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
