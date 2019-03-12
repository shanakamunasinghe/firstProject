package com.project.spring.app.employeeSkill;


import java.util.ArrayList;
import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SkillController {
	@Autowired 
	private SkillService skillService;
	private List<Skill> data = new ArrayList<>(); 
	private Skill value = new Skill();
	
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	
	
	@RequestMapping("/skills")
	public List<Skill> getAllSkills() {
		data = skillService.getAllSkills();
		if(data == null) {
			throw new ValidationException("The dataBase has a problem");
		}
		return data;
	}
	
	@RequestMapping("/skills/{foo}")
	public Skill getSkill(@PathVariable("foo") int id) {
		value = skillService.getSkill(id);
		if(value == null) {
			throw new ValidationException("The dataBase has a problem");
		}
		return value;
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/skills")
	public void addSkill(@RequestBody Skill skill, BindingResult bindingResults) {
		if(bindingResults.hasErrors()) {
			throw new ValidationException("Puting Skills has error");
		}
		skillService.addSkill(skill);

	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/skills/{id}")
	public void updateSkill(@RequestBody Skill skill,@PathVariable int id, BindingResult bindingResults) {
		if(bindingResults.hasErrors()) {
			throw new ValidationException("Puting Skills has error");
		}
		skillService.updateSkill(id,skill);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/skills/{id}")
	public void deleteSkill(@PathVariable int id) {
		skillService.deleteSkill(id);
	}
}