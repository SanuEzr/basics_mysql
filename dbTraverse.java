package com.viewsql;
import java.sql.*;
public class dbTraverse {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery("select * from student");
		while(res.next()) {
			System.out.println("Rno: "+res.getString(1));
			System.out.println("Name: "+res.getString(2));
			System.out.println("Branch: "+res.getString(3));
		}
		res.close();
		st.close();
		con.close();
	}
}