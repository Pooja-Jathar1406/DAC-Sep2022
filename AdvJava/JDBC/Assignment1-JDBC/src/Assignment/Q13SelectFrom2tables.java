package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Q13SelectFrom2tables {
	public static void main(String[] args) {
		try {
	    	 //to load driver class
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 String url= "jdbc:mysql://localhost:3306/Assignment1?useSSL=false";
		     String username = "root";
		     String password="pooja123";
		     
		     Connection conn= DriverManager.getConnection(url,username,password);
			java.sql.Statement s= conn.createStatement();
			     
			ResultSet rs =s.executeQuery("select * from emp_info,emp_add where emp_info.emp_id=emp_add.emp_id;");
		      
            
			while(rs.next()) {
		    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7));
		      }
		       
		     s.close();
	    	 conn.close();
			     
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
}
