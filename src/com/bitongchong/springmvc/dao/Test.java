package com.bitongchong.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.bitongchong.springmvc.entities.Employee;

public class Test {		

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();
		System.out.println(employeeDao.getEmployees());
		DepartmentDao departmentDao = new DepartmentDao();
		System.out.println(departmentDao.getDepartments());
		System.out.println(departmentDao.getId());
	}
}
