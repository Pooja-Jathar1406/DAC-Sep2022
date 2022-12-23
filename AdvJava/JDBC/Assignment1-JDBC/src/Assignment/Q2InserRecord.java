package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;

public class Q2InserRecord {
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
		     String InsertQry="insert into Student values(106,'Pranav', 79, '1996-05-11');";
		     boolean flag=s.execute(InsertQry);
		     System.out.println(flag);
		     
		     s.close();
	    	 conn.close();
			     
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
}
