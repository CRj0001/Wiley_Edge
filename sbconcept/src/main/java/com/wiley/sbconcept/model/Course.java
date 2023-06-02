package com.wiley.sbconcept.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Course_TBL")
public class Course {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String abbr;
	private int modules;
	private double fees;
	
	@ManyToMany(mappedBy = "courses", fetch =FetchType.LAZY)
	@JsonBackReference
	private Set<Student> students;
	
}
