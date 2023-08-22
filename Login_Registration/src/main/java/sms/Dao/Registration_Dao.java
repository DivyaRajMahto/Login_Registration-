package sms.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import sms.model.Registration;

public class Registration_Dao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root") ;
		
			
	}
	
	public int addStudent(Registration std) throws ClassNotFoundException, SQLException {
		Connection con= null;
		int result=0;
		try {
			con = Registration_Dao.getConnection();
			con.setAutoCommit(false);
			PreparedStatement st = con.prepareStatement("insert into login(UserID,Password) values(?,?)"); 
		    st.setString(1, std.getUserID());
		    st.setString(2,std.getPassword() );
		    
		    result= st.executeUpdate();
		    
			st = con.prepareStatement("insert into student_info (UserID,UserName,Age,Address,Branch) values(?,?,?,?,?)"); 
		    st.setString(1, std.getUserID());
		    
		    st.setString(2, std.getUserName());
		    st.setString(3, std.getAge());
		    st.setString(4, std.getAddress());
		    st.setString(5, std.getBranch());
		    
		    
		    result= st.executeUpdate();	
		    if(result!=0) {
		    	con.commit();
		    }
		    else {
		    	con.rollback();
		    }
		    
	}catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
		con.rollback();
	}
		finally {
			con.close();
		}
    return result;
}}

