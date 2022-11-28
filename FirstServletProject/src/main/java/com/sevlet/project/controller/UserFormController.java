package com.sevlet.project.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.project.dp.DataBaseUtil;
import com.servlet.project.dto.User;

/**
 * Servlet implementation class UserFormController
 */
@WebServlet("/UserFormController")
public class UserFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserFormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userobj=DataBaseUtil.getAllUsers();
		request.setAttribute("details", userobj);
		request.getRequestDispatcher("UserList.jsp").include(request, response);
	}

}
