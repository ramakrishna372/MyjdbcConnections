package com.palle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FinalExOfJdbc {

	public static void main(String[] args) {
	
B b=new B();
b.inserting(1, "hari");
	}

}
class B{

	public void inserting(int sno,String sname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "admin");
	String query="insert into bitta(sno,sname) values(?,?)";
	PreparedStatement s=con.prepareStatement(query);
	s.setInt(1, sno);
	s.setString(2, sname);
	s.executeUpdate();
	s.close();
		con.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
