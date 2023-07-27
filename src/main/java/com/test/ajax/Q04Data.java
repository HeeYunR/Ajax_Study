package com.test.ajax;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/q04data.do")
public class Q04Data extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String id = req.getParameter("id");
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		
		System.out.println(id);
		System.out.println(x);
		System.out.println(y);
		
		
		//Q04Data.java
		
		AjaxDAO dao = new AjaxDAO();
		Q04DTO dto = new Q04DTO();
		
		dto.setId(id);
		dto.setX(x);
		dto.setY(y);
		
		dao.setCat(dto);
		
		

	}

}
