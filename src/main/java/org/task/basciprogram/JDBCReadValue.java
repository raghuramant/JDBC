package org.task.basciprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCReadValue {

	public static void main(String[] args) throws ClassNotFoundException, Throwable {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample_jdbc", "root", "mysql!@#123");
		String sqlQuery = "SELECT * FROM sample_jdbc.employee_details;";
		PreparedStatement ps = con.prepareStatement(slQuery);
		ResultSet rs = ps.executeQuery();
		int Empid = 0;
		long phonenumber = 0;
		String userName = null, password = null, confirmPw = null, emailID = null, Gender = null, city = null,
				district = null;
		while (rs.next()) {
			Empid = rs.getInt("id");
			userName = rs.getString("username");
			password = rs.getString("password");
			confirmPw = rs.getString("confirmpassword");
			emailID = rs.getString("emailID");
			city = rs.getString("city");
			district = rs.getString("district");
			 phonenumber = rs.getLong("phonenumber");
			Gender = rs.getString("Gender");

		}
		System.out.println("Employee ID : " + Empid);
		System.out.println("Username: " + userName);
		System.out.println("Password : " + password);
		System.out.println("Confirm Password: " + confirmPw);
		System.out.println("Gender : " + Gender);
		System.out.println("Email ID: " + emailID);
		System.out.println("District : " + district);
		System.out.println("Phone Number : " + phonenumber);
		
	}

}
