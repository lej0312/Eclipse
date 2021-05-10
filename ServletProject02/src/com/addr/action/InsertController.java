package com.addr.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.addr.model.AddrDTO;
import com.addr.model.SAddrDAO;
import com.addr.model.SAddrDAOImpl;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/addr/insert.addr")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("addr_insert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
//		String name = request.getParameter("name");
//		String zipcode = request.getParameter("zipcode");
//		String addr = request.getParameter("addr");
//		String tel = request.getParameter("tel");
//		AddrDTO address = new AddrDTO();
//		address.setName(name);
//		address.setZipcode(zipcode);
//		address.setAddr(addr);
//		address.setTel(tel);
		
		AddrDTO address = new AddrDTO();
		address.setName(request.getParameter("name"));
		address.setZipcode(request.getParameter("zipcode"));
		address.setAddr(request.getParameter("addr"));
		address.setTel(request.getParameter("tel"));
		
		SAddrDAO dao = SAddrDAOImpl.getInstance();
		dao.addrInsert(address);
		response.sendRedirect("list.addr");
		//response.sendRedirect => 제어권 이동(url 변경 => 새로고침 :update, insert)
		//forward() => 결과값을 유지하면서 이동(주소 안바뀜 : select)
	}

}
