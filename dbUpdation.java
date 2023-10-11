package com.viewsql;
import java.sql.*;
public class dbUpdation {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		Statement st=con.createStatement();
		st.executeUpdate("update student set rno=100 where branch='IT'");
		System.out.println("Record updated successfully");
		st.close();
		con.close();
	}
}