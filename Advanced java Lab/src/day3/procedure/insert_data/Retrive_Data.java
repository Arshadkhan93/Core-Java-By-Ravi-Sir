package day3.procedure.insert_data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Types;

/*
 create or replace procedure getData(stid varchar2,strol out varchar2,stname out varchar2,stbr out varchar2,
sthno out varchar2,stct out varchar2,stpc out number,
stmi out varchar2,stph out number)
is
begin
select sturollno,stuname,stubranch into strol,stname,stbr from studata where stuid=stid;
select stuhno,city,pincode into sthno,stct,stpc from stuaddress where stuid=stid;
select mid,phno into stmi,stph from stucontact where stuid=stid;
end;
/ 
 */
public class Retrive_Data 
{
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String usr = "mydb";
	String pwd = "MYDB";
	
	void Retrive()
	{
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, usr, pwd);
			CallableStatement cls = con.prepareCall("{call getData(?,?,?,?,?,?,?,?,?)}");
			cls.setString(1,"1");
			cls.registerOutParameter(2, Types.VARCHAR);
			cls.registerOutParameter(3, Types.VARCHAR);
			cls.registerOutParameter(4, Types.VARCHAR);
			cls.registerOutParameter(5, Types.VARCHAR);
			cls.registerOutParameter(6, Types.VARCHAR);
			cls.registerOutParameter(7, Types.NUMERIC);
			cls.registerOutParameter(8, Types.VARCHAR);
			cls.registerOutParameter(9, Types.NUMERIC);
			//cls.registerOutParameter(2, Types.VARCHAR);
			cls.execute();
			
			IO.println("Student ID : 1");
			IO.println("Student Roll Number : "+cls.getString(2));
			IO.println("Student Name : "+cls.getString(3));
			IO.println("Student Branch : "+cls.getString(4));
			IO.println("Student Home NO : "+cls.getString(5));
			IO.println("Student City : "+cls.getString(6));
			IO.println("Student Pincode : "+cls.getString(7));
			IO.println("Student Email Id : "+cls.getString(8));
			IO.println("Student Phone Number : "+cls.getString(9));
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	void main()
	{
		Retrive();
	}
}
