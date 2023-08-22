package sms.Dao;

import sms.model.Login_Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		
		
			
	}
		

	public Login_Model checklogin(String UserID, String Password) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con =null ;
		ResultSet rs = null;
		Login_Model user=null;
		try {
			con = LoginDao.getConnection();
			PreparedStatement prd= con.prepareStatement(" Select u.UserID,u.UserName,u.Age,u.Address,u.Branch From student_info u Join login l on u.UserID=l.UserID  where l.UserID=? and l.Password=?");
			prd.setString(1, UserID);
			prd.setString(2,Password);

			rs = prd.executeQuery(); 
			 
			 
				 while(rs.next()) {
						 user = new Login_Model();
						user.setUserID(rs.getString("UserID"));
						
						user.setUserName(rs.getString("UserName"));
						user.setAge(rs.getString("Age"));
						user.setAddress(rs.getString("Address"));
						user.setBranch(rs.getString("Branch"));
						System.out.println(user);
						
				 
			 }
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally {
			con.close();
		}
		
		return user;
	}

	
	}
