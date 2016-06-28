package org.demo;
import java.sql.*;
import java.util.Random;
public class OracleDemo {

	public static void main(String args[])
	{
		try
		{
		Class.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver");
		Connection connection = null;
		connection = DriverManager.getConnection(
				"jdbc:datadirect:openedge://localhost:8911;databaseName=rbdb","dbadmin","dbadmin");
		
		System.out.println("conection successul.");
		Statement st=connection.createStatement();
  
	boolean b=st.execute("create table emp3(eno int,ename varchar(20))");
	//boolean b1=st.execute("commit");
	System.out.println("result is"+b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
