package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empNo;
	private String empName;
	private Date hireDate;
	private int salary;
	
	public Employee(int empNo, String empNameString, Date date, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empNameString;
		this.hireDate = date;
		this.salary = salary;
	}
	
	public Date getHireData() {
		return hireDate;
	}
	@Override
	public String toString()
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", hireDate=" + format.format(hireDate) + ", salary=" + salary + "]";
	}
}
