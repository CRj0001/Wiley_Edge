package com.wiley.sbconcept.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.repository.DepRepo;

@Service
public class DepServiceImpl implements DepService{

	@Autowired
	private DepRepo depRepo; 
	
	@Override
	public Department createDepartment(Department dept) {
		// TODO Auto-generated method stub
		return depRepo.save(dept);
	}

	@Override
	public List<Department> getAllDepartmentsList() {
		// TODO Auto-generated method stub
		return depRepo.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(Long id, Department dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartment(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department getDeptByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
