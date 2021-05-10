package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BbsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String subject = req.getParameter("subject");
		String memo = req.getParameter("memo");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("이름 : " + name + "<br>");
		out.println("제목 : " + subject + "<br>");
		out.println("메모 : " + memo + "<br>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		
	}
}
