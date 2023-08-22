package sms.controller;
import sms.model.Login_Model;
import sms.Dao.LoginDao;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login_Ctrl
 */
@WebServlet("/Login_Ctrl")
public class Login_Ctrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Ctrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String UserID = request.getParameter("UserID");
		String Password = request.getParameter("Password");
		LoginDao da =new LoginDao();
		Login_Model user = null;
		try {
			user = da.checklogin(UserID,Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=null;
		if(user!=null) {
			rd=request.getRequestDispatcher("Login_Table.jsp");
			request.setAttribute("Std_Info",user);
			
		}else {
			request.setAttribute("Error", "UserID or Password is incorrect........."); 
			rd=request.getRequestDispatcher("Login.jsp");
			
		}
		rd.forward(request,response);
		
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
