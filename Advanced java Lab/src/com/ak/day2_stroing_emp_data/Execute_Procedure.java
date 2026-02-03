package com.ak.day2_stroing_emp_data;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Execute_Procedure 
{
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String usr = "mydb";
	String pwd = "MYDB";
	
	void m1()
	{
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, usr, pwd);
			CallableStatement s = con.prepareCall("{call insertstudata(?,?,?,?,?,?,?,?,?)}");
			s.setString(1, "1");
			s.setString(2, "N1");
			s.setString(3, "Raj");
			s.setString(4, "Ameerpet");
			s.setInt(5, 63);
			s.setString(6, "hyd");
			s.setInt(7, 500073);
			s.setString(8, "raj12@gmail.com");
			s.setInt(9, 987654321);
			
			boolean ex = s.execute();
			IO.println(ex);
			if(!ex)
				IO.println("Procedure Executed");
			else
				IO.println("Procedure Not Executed"+ex);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	void main()
	{
		m1();
	}
}
