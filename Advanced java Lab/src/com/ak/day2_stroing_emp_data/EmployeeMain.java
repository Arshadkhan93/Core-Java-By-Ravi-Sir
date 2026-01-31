package com.ak.day2_stroing_emp_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeMain 
{
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUser = "MYDB";
	String dbPwd = "MYDB";
	Connection connect()
	{
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			return con;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Employee> getData()
	{
		ArrayList<Employee> listOfEmp= new ArrayList<>();
		try
		{
			Connection con = connect();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPLOYEE1 where age>=25");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				listOfEmp.add(emp);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listOfEmp;
	}
	void main()
	{
		
		ArrayList<Employee> listOfEmp = getData();
		for(Employee e : listOfEmp)
			IO.println(e);
	}
}
