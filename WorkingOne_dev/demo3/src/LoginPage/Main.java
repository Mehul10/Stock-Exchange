package LoginPage;
import java.sql.*;

public class Main {
	static final String URL;
	 static final String uname;
	 static final String password;
	 static Connection con;
	 static Statement st;
	 static
	 {
		
		 URL="jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12373504";
		 uname="sql12373504";
		 password="IUEwbNJt72";
		 try
		 {
		 Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(URL,uname,password);
		 st=con.createStatement();
		 }
		 catch(Exception er)
		 {
			 er.getMessage();
			 er.printStackTrace();
			 System.out.println("DATABASE INIT ERROR");
		 }
	 }

	public static void main(String[] args) throws Exception {
		new Loginpage();
	}
	public static ResultSet query(String Query2) throws Exception{
		try
		{
		ResultSet p=st.executeQuery(Query2);
		return p;
		}
		catch(Exception err)
		{
			err.getMessage();
			err.printStackTrace();
			System.out.println("QUERY ERROR");
			
		}
		return null;
	}
	public static void query1(String Query2) throws Exception{
		try
		{
		st.executeUpdate(Query2);
		}
		catch(Exception err)
		{
			err.getMessage();
			err.printStackTrace();
			System.out.println("QUERY ERROR");
			
		}
	}
		
	}

