package com.project.spring.app.employeeSkill;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;



@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	
	@Column(name = "employeeName")
	private String employeeName;
	@NotNull
	@Email
	@Column(name = "employeeEmail")
	private String employeeEmail;
	@NotNull
	@Column(name = "dOfBirth")
	private String dOfBirth;
	
	

	

	public Employee() {
		
	}
	
	public Employee(String employeeName, String employeeEmail, String dOfBirth) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.dOfBirth = dOfBirth;
	}
	
	public Employee(int id,String employeeName, String employeeEmail, String dOfBirth) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.dOfBirth = dOfBirth;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getdOfBirth() {
		return dOfBirth;
	}

	public void setdOfBirth(String dOfBirth) {
		this.dOfBirth = dOfBirth;
	}

	public long getId() {
		return id;
	}
	
	@Override
	 public String toString() {
	 return String.format("Employee[id=%d, employeeName='%s', employeeEmail='%s',dOfBirth='%s']", id, employeeName, employeeEmail,dOfBirth);
	 }
}

