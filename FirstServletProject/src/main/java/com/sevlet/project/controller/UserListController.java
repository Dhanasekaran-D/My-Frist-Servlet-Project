package com.sevlet.project.controller;
import java.util.UUID;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.project.dp.DataBaseUtil;
import com.servlet.project.dto.User;

/**
 * Servlet implementation class UserListController
 */
@WebServlet("/UserListController")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  
		String Name = request.getParameter("Name");
		String FatherName = request.getParameter("fatherName");
		String Phone = request.getParameter("phone");
		String Email = request.getParameter("email");
		String City = request.getParameter("city");
		String State = request.getParameter("state");
		String country=request.getParameter("country");
		String Pincode = request.getParameter("pincode");
		
		System.out.println(Name+".........."+FatherName+"..........."+Phone+"......."+Email+"........."+City+"........"+State+"......."+country+"......."+Pincode);
		User myuser=new User();
		myuser.setId(UUID.randomUUID());
		myuser.setName(Name);
		myuser.setFatherName(FatherName);
		myuser.setPhone(Phone);
		myuser.setEmail(Email);
		myuser.setCity(City);
		myuser.setState(State);
		myuser.setCountry(country);
		myuser.setPincode(Pincode);
		DataBaseUtil.save(myuser);
		request.setAttribute("myuser", myuser);
		//DataBaseUtil.save(myuser);
		request.getRequestDispatcher("UserList.jsp").include(request, response);
		response.sendRedirect("UserFormController");

	}

}
