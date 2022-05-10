package com.Bridgelabz.JDBC_EmployeePayroll;

public class EmployeePayrollException extends Exception {
	public enum ExceptionType {
		UPDATE_FAIL
	}

	public ExceptionType type;

	public EmployeePayrollException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

	public EmployeePayrollException(
			com.Bridgelabz.Day29_IndianStatesCensusAnalyser.StateAnalyzerException.ExceptionType updateFail,
			String message) {
		// TODO Auto-generated constructor stub
	}
}