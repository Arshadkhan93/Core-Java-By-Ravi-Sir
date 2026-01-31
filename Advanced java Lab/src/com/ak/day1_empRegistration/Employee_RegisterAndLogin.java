package com.ak.day1_empRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee_RegisterAndLogin {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUser = "MYDB";
	String dbPwd = "MYDB";
	
	Connection connect()
	{
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			return con;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;		
	}
	
	public void register()
	{
		String id = IO.readln("Enter Your Id :");
		String name = IO.readln("Enter Your Name :");
		double salary = Double.parseDouble(IO.readln("Enter Your Salary :"));
		String fName = IO.readln("Enter Your First Name :");
		String lName = IO.readln("Enter Your Last Name :");
		String mailid = IO.readln("Enter Your Mail Id :");
		long phNo = Long.parseLong(IO.readln("Enter Your Phone No :"));
		
		Connection con = connect();
		try
		{
			PreparedStatement pstmt=con.prepareStatement("insert into empinfo values(?,?,?,?,?,?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);;
			pstmt.setString(4, fName);
			pstmt.setString(5, lName);
			pstmt.setString(6, mailid);
			pstmt.setLong(7, phNo);
			int rowCount=pstmt.executeUpdate();
			if(rowCount==0)
				throw new RuntimeException("Registration Failed!! , Try Again");
			else
				IO.println("Registration Completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	private void displayAll()
	{
		Connection con = connect();
		try
		{
			String select="SELECT * FROM EMPINFO";
			PreparedStatement ps1=con.prepareStatement(select);
			ResultSet rs = ps1.executeQuery();
			while(rs.next())
			{
				String id = rs.getString(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				String fName = rs.getString(4);
				String lName = rs.getString(5);
				String mailid = rs.getString(6);
				long phNo = rs.getLong(7);
				
				IO.println("Employee ID : "+id);
				IO.println("Employee Name : "+name);
				IO.println("Employee Salary : "+salary);
				IO.println("Employee First Name : "+fName);
				IO.println("Employee Last Name : "+lName);
				IO.println("Employee Mail Id : "+mailid);
				IO.println("Employee Phone Number : "+phNo);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private void update()
	{
		String id = IO.readln("Enter Your ID :");
		String email = IO.readln("Enter new Email:");
		long phno = Long.parseLong(IO.readln("Enter new Phone no:"));
		Connection con = connect();
		String update ="UPDATE EMPINFO SET MAILID=?,PHNO=? WHERE ID=?";
		try
		{
		PreparedStatement ps =con.prepareStatement(update); 
		ps.setString(1, email);
		ps.setLong(2, phno);
		ps.setString(3, id);
		int rowCount = ps.executeUpdate();
		if(rowCount==0)
			throw new RuntimeException("Invalid inputs!! Data not Updated");
		else
			IO.println("Data Updated Successfully");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private void delete()
	{
		IO.println("Enter Range of Salary of Employee you want to delete ");
		double startingSal = Double.parseDouble(IO.readln("Enter Starting Range Salary :"));
		double toSalary = Double.parseDouble(IO.readln("Enter Ending Range Salary :"));
		
		String delete ="delete from empinfo where salary between ? and ?";
		Connection con = connect();
		
		try
		{
			PreparedStatement pstmt = con.prepareStatement(delete);
			pstmt.setDouble(1, startingSal);
			pstmt.setDouble(2, toSalary);
			int rowCount = pstmt.executeUpdate();
			if(rowCount==0)
			{
				throw new RuntimeException("No Record Availabe in Salary Range");				
			}
			else
			{
				IO.println("Record Deleted Successfully!!!");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private void increment()
	{
		int id = Integer.parseInt(IO.readln("Enter Id of Employeee Who Want Increment :"));
		double inc = Double.parseDouble(IO.readln("Enter Percentage Of Increment (in %) :"));
		
		String increment = "update empinfo set salary=salary+(salary*(?/100)) where id=?";
		Connection con = connect();
		try
		{
			PreparedStatement pstmt = con.prepareStatement(increment);
			pstmt.setDouble(1, inc);
			pstmt.setInt(2, id);
			int rowCount = pstmt.executeUpdate();
			if(rowCount==0)
				IO.println("Increment not Added!!");
			else
				IO.println("Successfully added Increment.");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private void afterLogin()
	{
		IO.println("1. Show all Employees.");
		IO.println("2. Update MailId & Phno (Based on ID)");
		IO.println("3. Delete Employees Based on salary.");
		IO.println("4. Increase 10% salary of each Employee");
		int choice = Integer.parseInt(IO.readln("Enter your Choice :"));
		switch(choice)
		{
		case 1->displayAll();
		case 2->update();
		case 3->delete();
		case 4->increment();
		}
	}
	public void login()
	{
		String id = IO.readln("Enter your ID :");
		String name = IO.readln("Enter Your Name: ");
		
		Connection con = connect();
		try
		{
			PreparedStatement statement = con.prepareStatement("SELECT * FROM EMPINFO WHERE ID=? AND NAME=?");
			statement.setString(1, id);
			statement.setString(2, name);
			if(statement.execute())
			{
				IO.println("Login Succesfull");
				afterLogin();
			}
			else
				IO.println("Not Availabe");
			//ResultSet rs =statement.executeQuery();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	void main()
	{
		
		IO.println("1 . Register");
		IO.println("2 . Login");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice :"));
		
		switch(choice)
		{
		case 1->register();
		
		case 2->login();
		
		default->IO.println("Invalid Choice!!!");
		}
		
	}
}
