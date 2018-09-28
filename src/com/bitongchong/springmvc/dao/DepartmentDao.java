package com.bitongchong.springmvc.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.bitongchong.springmvc.entities.Department;

@Repository
public class DepartmentDao{
	
	private static Map<Integer,Department> departments = null;
	static {
		departments = new HashMap<Integer,Department>();
		departments.put(1, new Department(1, "liu"));
		departments.put(11, new Department(11, "liu1"));
		departments.put(111, new Department(111, "liu11"));
		departments.put(1111, new Department(1111, "liu111"));
		departments.put(11111, new Department(11111, "liu1111"));
	}
	public Collection<Department> getDepartments(){
		return departments.values();
	}
	public Department getDepartmentById(Integer id) {
		return departments.get(id);
	}
	public Set<Integer> getId() {

		Set<Integer> keys = departments.keySet();   //此行可省略，直接将map.keySet()写在for-each循环的条件中

		return keys;
	}
}
