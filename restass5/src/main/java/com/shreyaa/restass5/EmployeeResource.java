package com.shreyaa.restass5;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	private EmployeeDao service;
	public EmployeeResource(EmployeeDao service) {
		this.service=service;
	}
	@GetMapping("/empp")
public List<Employee> alluser(){
	return service.all();
}
	@PostMapping("/empe")
	public void createuser(Employee emp) {
	service.save(emp);
	}
	                                     
}
