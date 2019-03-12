package com.project.spring.app.employeeSkill;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployee(){
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Employee getEmployee(int employeeId) {
		return employeeRepository.findOne(employeeId);
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}
	
	public void updateEmployee(int employeeId, Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(int employeeId) {
		employeeRepository.delete(employeeId);
	}
}