package com.project.spring.app.employeeSkill;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class EmployeeSkillDatabaseSeeder implements CommandLineRunner{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private SkillRepository skillRepository;
	
	@Autowired
	public EmployeeSkillDatabaseSeeder(EmployeeRepository employeeRepository,SkillRepository skillRepository){
		this.employeeRepository = employeeRepository;
		this.skillRepository = skillRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Employee> empbookings = new ArrayList<>();
		empbookings.add(new Employee("Marriot","Marriot@gmail.com","1995"));
		empbookings.add(new Employee("Ibis","Ibis@gmail.com","1995"));
		empbookings.add(new Employee("Novotel","Novotel@gmail.com","1995"));
		
		employeeRepository.save(empbookings);
		
		List<Skill> skillbookings = new ArrayList<>();
		skillbookings.add(new Skill("run","run description"));
		skillbookings.add(new Skill("fly","fly description"));
		skillbookings.add(new Skill("jump","jump description"));
		
		skillRepository.save(skillbookings);
	}
	
}