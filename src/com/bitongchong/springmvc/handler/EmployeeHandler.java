package com.bitongchong.springmvc.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitongchong.springmvc.dao.DepartmentDao;
import com.bitongchong.springmvc.dao.EmployeeDao;
import com.bitongchong.springmvc.entities.Employee;

@Controller
public class EmployeeHandler {
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;
	
	@RequestMapping("/emps")
	public String list(Map<String, Object> map) {
		map.put("employees", employeeDao.getEmployees());
		return "list";
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public String addEmp(Map<String, Object> map) {
		map.put("dpetId", departmentDao.getId());
		map.put("employee", new Employee());
		return "input";
	}
	@RequestMapping(value="/emp", method=RequestMethod.POST)
	public String saveEmp(Employee employee) {
		employeeDao.save(employee);
		return "forward:/emps";
	}
	
	@RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
	public String list(@PathVariable("id") Integer id) {
		employeeDao.deleteEmployeeById(id);
		return "redirect:/emps";
	}
	
	@RequestMapping(value="/emp/{id}", method=RequestMethod.GET)
	public String getEmp(@PathVariable("id") Integer id, Map<String, Object> map) {
		map.put("dpetId", departmentDao.getId());
		map.put("employee", employeeDao.getEmployeeById(id));
		return "forward:/input";
	}
	
	@ModelAttribute
	public void getEmployee(@RequestParam(value="id",required=false) Integer id
			, Map<String, Object> map) {
		if (id != null) {
			map.put("employee", employeeDao.getEmployeeById(id));
		}
	}

	@RequestMapping(value="/emp", method=RequestMethod.PUT)
	public String updateEmp(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
}
