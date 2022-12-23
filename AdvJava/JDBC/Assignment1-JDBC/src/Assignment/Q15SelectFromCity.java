package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Q15SelectFromCity {
	public static void main(String[] args) {
		try {
	    	 //to load driver class
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 String url= "jdbc:mysql://localhost:3306/Assignment1?useSSL=false";
		     String username = "root";
		     String password="pooja123";
		     
		     Connection conn= DriverManager.getConnection(url,username,password);
			java.sql.Statement s= conn.createStatement();
			     
			ResultSet rs =s.executeQuery("select * from emp_add where emp_id=113;");
		      
            
			while(rs.next()) {
		    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4) );
		      }
		       
		     s.close();
	    	 conn.close();
			     
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
}
