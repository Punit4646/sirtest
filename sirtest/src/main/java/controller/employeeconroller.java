package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.employeeDao;
import model.employee;

/**
 * Servlet implementation class employeeconroller
 */
@WebServlet("/employeeconroller")
public class employeeconroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeeconroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			employee e = new employee();
			e.setName(request.getParameter("name"));
			e.setContact(Long.parseLong(request.getParameter("contact")));
			e.setGender(request.getParameter("gender"));
			e.setAddress(request.getParameter("address"));
			e.setDob(request.getParameter("dob"));
			e.setEmail(request.getParameter("email"));
			e.setPassword(request.getParameter("password"));
			System.err.println(e);
			employeeDao.insertemployee(e);
			response.sendRedirect("employee-login.jsp");
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
