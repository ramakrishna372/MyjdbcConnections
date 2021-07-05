package com.palle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExamapleOfJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "admin");
Statement s=con.createStatement();
ResultSet r=s.executeQuery("select * from emp");
while(r.next()==true) {
	System.out.println("sno="+r.getInt(1));
	System.out.println("sname="+r.getString(2));
	System.out.println("sage="+r.getInt(3));
}
con.close();
s.close();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
