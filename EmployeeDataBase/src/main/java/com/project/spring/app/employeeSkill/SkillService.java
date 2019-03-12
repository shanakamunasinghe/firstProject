package com.project.spring.app.employeeSkill;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository skillRepository;
	
	
	public List<Skill> getAllSkills(){
		List<Skill> employees = new ArrayList<>();
		skillRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Skill getSkill(int id) {
		return skillRepository.findOne(id);
	}

	public void addSkill(Skill skill) {
		skillRepository.save(skill);
		
	}

	public void updateSkill(int id, Skill skill) {
		skillRepository.save(skill);
	}

	public void deleteSkill(int id) {
		skillRepository.delete(id);
	}
}