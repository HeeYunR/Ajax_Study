package com.test.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/q02data.do")
public class Q02Data extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//Q02Check.java
		String dong = req.getParameter("dong");
				
		Q02DAO dao = new Q02DAO();
				
		int result = dao.checkDong(dong);
				
		/*
			{ "result": 1 }
		*/
				
		resp.setContentType("application/json");
		resp.getWriter().printf("{ \"result\": %d }", result);
		resp.getWriter().close();
	}

}