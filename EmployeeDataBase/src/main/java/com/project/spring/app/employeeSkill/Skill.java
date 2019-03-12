package com.project.spring.app.employeeSkill;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "skill")
public class Skill {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	
	@Column(name = "skillName")
	private String skillName;
	@NotNull
	@Column(name = "description")
	private String description;


	public Skill() {
		
	}
	
	public Skill(String skillName, String description) {
		super();
		this.skillName = skillName;
		this.description = description;
		
	}
	
	public Skill(int id,String skillName, String description) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.description = description;
		
	}
	
	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}
	@Override
	 public String toString() {
		String result = String.format("Skill[id=%d, skillName='%s', description='%s']", id, skillName, description);
	 	return result;
	 }
}

