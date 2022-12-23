package Assignment;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Q1CreateTable {

	public static void main(String[] args) {
		try {
	    	 //to load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String url= "jdbc:mysql://localhost:3306/Assignment1?useSSL=false";
		     String username = "root";
		     String password="pooja123";
		     
		     Connection conn= DriverManager.getConnection(url,username,password);
			java.sql.Statement s= conn.createStatement();
			     
		     //execute the create table query
		     String createQry="create table Student(Rno int primary key, Name varchar(20), Marks int, DOB date);";
		     boolean flag=s.execute(createQry);
		     System.out.println(flag);
		     
		     s.close();
	    	 conn.close();
			     
			} catch (Exception e) {
				 
				e.printStackTrace();
			}

	}

}
