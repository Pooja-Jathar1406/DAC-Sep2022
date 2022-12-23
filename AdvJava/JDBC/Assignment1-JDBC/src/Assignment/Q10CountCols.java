package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

public class Q10CountCols {

	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/Assignment1?useSSL=false";
			String username="root";
			String password="pooja123";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			
			java.sql.CallableStatement s = con.prepareCall("{call insert_rec(?, ?, ? ,?)}") ;  
			
			s.setInt(1, 200);
			s.setString(2,"Sonali");
			s.setInt(3, 89);
			s.setString(4, "1996-05-11");
			
 
			int i=s.executeUpdate();
			
			System.out.println(i+" rows affected!");
			
			
			s.close(); 
			con.close();
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}	

	}

}
