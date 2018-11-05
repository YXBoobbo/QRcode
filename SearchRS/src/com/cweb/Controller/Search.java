package com.cweb.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cweb.pojo.Product;

@WebServlet("/GetProductById")
public class Search extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product pro1=new Product();
		pro1.setArea("123");
		pro1.setName("456");
		pro1.setNumber("100000001");
		pro1.setPic("images/1111.jpg");
		
		request.setAttribute("proArea", pro1.getArea());
		request.setAttribute("proName", pro1.getName());
		request.setAttribute("proNubmer", pro1.getNumber());
		request.setAttribute("proPic", pro1.getPic());
		
        
		request.getRequestDispatcher("product.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
