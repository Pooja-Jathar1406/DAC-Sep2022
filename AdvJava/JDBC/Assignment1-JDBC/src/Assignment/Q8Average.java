package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Q8Average {

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
		     ResultSet rs =s.executeQuery("select avg(marks) from student ;");
		      while(rs.next()) {
		    	  System.out.println(rs.getInt(1));
		      }
		       
		     s.close();
	    	 conn.close();
			     
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
