package com.hqv.studentmgmt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.studentmgmt.entity.Department;
import com.hqv.studentmgmt.repository.DepartmentRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class DepatmentApi {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@PostMapping("/department")
	public Department saveDepartment(
			@RequestBody Department department)
	{
		departmentRepository.save(department);
		return department;
	}
}
