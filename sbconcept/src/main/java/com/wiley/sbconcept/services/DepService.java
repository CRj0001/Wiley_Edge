package com.wiley.sbconcept.services;

import java.util.List;

import com.wiley.sbconcept.model.Department;

public interface DepService {
	public Department createDepartment(Department dept);
	
	public List<Department> getAllDepartmentsList();
	
	public Department getDepartmentById(Long id);
	
	public Department updateDepartment(Long id, Department dept);
	
	public void deleteDepartment(Long id);
	
	Department getDeptByName(String name);
}
