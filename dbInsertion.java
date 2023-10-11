package com.viewsql;
import java.sql.*;
public class dbInsertion {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into student values(1,'Java','IT')");
		System.out.println(i+" Records inserted successfully.");
		st.close();
		con.close();
	}
}