package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;

public class Q12EmpInfoAddress {
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
		     String InsertQry1="insert into emp_info values(113,'Aish', 50000, '2022-03-11');";
		     boolean flag1=s.execute(InsertQry1);
		     System.out.println(flag1);
		     if(!flag1) {
		    	 String InsertQry2="insert into emp_add values(3,'Banglore','India', 113);";
			     boolean flag2=s.execute(InsertQry2);
			     System.out.println(flag2);
		     }
		     s.close();
	    	 conn.close();
			     
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
}
