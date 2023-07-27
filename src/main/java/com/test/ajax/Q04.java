package com.test.ajax;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/q04.do")
public class Q04 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//Q04.java
		AjaxDAO dao = new AjaxDAO();
		
		List<Q04DTO> list = dao.getCat();
		
		req.setAttribute("list", list);

		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/views/q04.jsp");
		dispatcher.forward(req, resp);
	}

}