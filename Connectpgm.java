package com.ravi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Connectpgm {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-60VBUG3U:1521:xe","Megha","Megha");  
	//	Statement stmt=con.createStatement();  
		
//		  System.out.println("Enter Id ");
//		  int id=sc.nextInt();
//		  System.out.println("Enter date in (dd-mm-yyyy) formate"); 
//		  String da=sc.next();
//		  
//		  SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
//		  java.util.Date udate=sdf.parse(da);
//		  
//		  System.out.println(udate);
//		  long ms=udate.getTime(); 
//		  java.sql.Date sdate=new java.sql.Date(ms);
//		  
		 // PreparedStatement ps=con.prepareStatement("insert into testing values(?,?)");
		  //ps.setInt(1, id); 
		  //ps.setDate(2, sdate);
		String name=sc.next();
		String pass=sc.next();
		String gender=sc.next();
		String email=sc.next();
		String phone=sc.next();

		  
		  PreparedStatement ps=con.prepareStatement("insert into Student values (?,?,?,?,?)");
		  ps.setString(1, name); 
		  ps.setString(2, pass);
		  ps.setString(3, gender);
		  ps.setString(4, email);
		  ps.setString(5, phone);
//		  
	  int res=ps.executeUpdate();
//		  
	  if (res==0) 
		  System.out.println("Record not inserted"); 
	  else
		  System.out.println("Successful");
			
	//int res=stmt.executeUpdate("insert into testing values(5,'20/08/1945')");
		
		//ps.close();
		con.close();
		
		/*
		 * ResultSet rs=stmt.executeQuery("select * from emp765"); while(rs.next())
		 * System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		 */

	}

}
