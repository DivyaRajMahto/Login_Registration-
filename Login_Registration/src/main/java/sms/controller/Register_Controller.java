package sms.controller;
import sms.Dao.Registration_Dao;
import sms.model.Registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register_Controller
 */
@WebServlet("/Register")
public class Register_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
		rd.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserID = request.getParameter("UserID");
		String Password = request.getParameter("Password");
		String UserName = request.getParameter("UserName");
		String Age = request.getParameter("Age");
		String Address = request.getParameter("Address");
		String Branch = request.getParameter("Branch");
		
		Registration regd = new Registration();
		regd.setUserID(UserID);
		regd.setPassword(Password);
		regd.setUserName(UserName);
		regd.setAge(Age);
		regd.setAddress(Address);
		regd.setBranch(Branch);
		
		Registration_Dao regd_dao = new Registration_Dao();
		int x=0;
		 
		try {
		     
		     
		     x=regd_dao.addStudent(regd);		
		     }catch (Exception e) {
		    	 
		    	 e.printStackTrace();
				// TODO: handle exception
			}
		if(x!=0) {
			System.out.println("Added");
		}else {
			System.out.println("Not added");
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("Registered_Page.jsp");
		rd.forward(request,response);
	}

}
