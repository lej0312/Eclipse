package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String[] hobby = req.getParameterValues("hobby");
		String job = req.getParameter("job");
		
//		req.setAttribute("name", name);
//		req.setAttribute("age", age);
//		req.setAttribute("gender", gender);
//		req.setAttribute("hobby", hobby);
//		req.setAttribute("job", job);
		
		//생성자 이용
		//Person person = new Person(name, age, gender, hobby, job);
		//req.setAttribute("p", person);
		
		//setter 이용
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setHobby(hobby);
		person.setJob(job);
		req.setAttribute("p", person);
		
		RequestDispatcher rd = req.getRequestDispatcher("formResult.jsp");
		rd.forward(req, resp);
	}
}
