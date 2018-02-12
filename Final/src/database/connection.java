package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbUrl = "jdbc:mysql://localhost:3036/emp";
String username = null;
String password = null;
// TODO Auto-generated method stub
Connection con=DriverManager.getConnection(dbUrl,username,password);
Class.forName("com.mysql.jdbc.Driver");
Statement stmt = con.createStatement();	
ResultSet rs=stmt.executeQuery("select *  from employee;");
//While Loop to iterate through all data and print results		
while (rs.next()){
    		String myName = rs.getString(1);								        
            String myAge = rs.getString(2);					                               
            System. out.println(myName+"  "+myAge);		
    }		
	 // closing DB Connection		
	con.close();		
}
	}


