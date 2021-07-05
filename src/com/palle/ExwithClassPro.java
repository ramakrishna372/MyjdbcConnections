package com.palle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExwithClassPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		
a.inserting(2, "sitha");
a.inserting(3, "rama");

}

}
class A{
	public void creating() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "admin");
		Statement s=con.createStatement();
		String query="create table bitta(sno int,sname varchar(40))";
		s.executeUpdate(query);
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


	public void inserting(int sno,String sname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "admin");
		Statement s=con.createStatement();
		s.executeUpdate("insert into bitta(sno,sname) values("+sno+",'"+sname+"')");
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

