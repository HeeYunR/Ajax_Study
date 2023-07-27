package com.test.ajax;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01.do")
public class Ex01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//Ex01.java
		String count = req.getParameter("count");
		
		req.setAttribute("count", count);

		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/views/ex01.jsp");
		dispatcher.forward(req, resp);
	}

}