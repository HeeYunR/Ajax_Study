package com.test.ajax;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03data.do")
public class Ex03Data extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//Ex03Data.java
		
		AjaxDAO dao = new AjaxDAO();
		
		ResearchDTO dto = dao.getResearch(1);
		
		req.setAttribute("dto", dto);

		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/views/ex03data.jsp");
		dispatcher.forward(req, resp);
	}

}
