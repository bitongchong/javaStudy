package com.bitongchong.springmvc.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bitongchong.springmvc.entities.Employee;
import com.bitongchong.springmvc.entities.Employee;

@Repository
public class EmployeeDao {
	private static Map<Integer,Employee> employees = null;
	static Integer init_id = 100;
	static {
		employees = new HashMap<Integer,Employee>();
		employees.put(1, new Employee(1,"yuehe","343@qq,com",1));
		employees.put(11, new Employee(11,"yuehe1","3431@qq,com",11));
		employees.put(111, new Employee(111,"yuehe1","343@qq,com1",111));
		employees.put(1111, new Employee(1111,"yuehe","343@11qq,com",1111));
		employees.put(11111, new Employee(11111,"yuehe1","3431@qq,com",11111));
	}
	public Collection<Employee> getEmployees(){
		return employees.values();
	}
	public Employee getEmployeeById(Integer id) {
		return employees.get(id);
	}

	public void deleteEmployeeById(Integer id) {
		employees.remove(id);
	}
	
	public void save(Employee employee) {
		employees.put(init_id++, employee);
	}
}
