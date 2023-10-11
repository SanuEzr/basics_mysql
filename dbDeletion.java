package com.viewsql;
import java.sql.*;
public class dbDeletion {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		Statement st=con.createStatement();
		st.executeUpdate("delete from student where rno=100");
		System.out.println("Record deleted successfully");
		st.close();
		con.close();
	}
}