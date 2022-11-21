package com.erestass3;

public class EmployeeController {
	private EmployeeDataStore service;
	  public EmployeeController(EmployeeDataStore service)
	  {
	      this.service=service;
	  }
	  @GetMapping("/employees")
	  public List<EmployeeDetails> retrieveEmployees()
	  {
	      return service.findAll();
	  }
	  @GetMapping("/employee/{id}")
	  public EmployeeDetails retriveOfSpecific(@PathVariable int id)
	  {
	      return service.findOneEmp(id);
	  }
	  @DeleteMapping("/employee/{id}")
	  public void deleteOfSpecific(@PathVariable int id)
	  {
	       service.deleteOneEmp(id);
	  }
	  @PostMapping("/employee")
	  public EmployeeDetails createUser(@RequestBody EmployeeDetails user)
	    {
	        return service.save(user);
	    }
}
