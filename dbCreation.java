package com.viewsql;
import java.sql.*;
public class dbCreation {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,user,password);
		Statement st=con.createStatement();
		st.executeUpdate("create table student(rno int,name varchar(20),branch varchar(20))");
		st.close();
		con.close();
	}
}