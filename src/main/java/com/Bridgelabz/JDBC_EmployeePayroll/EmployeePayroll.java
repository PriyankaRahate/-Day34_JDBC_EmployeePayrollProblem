package com.Bridgelabz.JDBC_EmployeePayroll;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class EmployeePayroll {

	
	public static void main(String[] args) {

		
		String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
        String userName = "root";
        String password = "123456";
		Connection connection;

		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("Cannot find driver in classpath");
		}
		listDrivers();
		try {
			System.out.println("Connecting to database: " + jdbcURL);
			connection = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection successful: " + connection);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	private static void listDrivers() {

		
		Enumeration<Driver> driverList = DriverManager.getDrivers();

		
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println("   " + driverClass.getClass().getName());
		}
	}
}

