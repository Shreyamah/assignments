package com.shreyaa.restass5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class EmployeeDao {
	 private static List<Employee> emps= new ArrayList<>();
	  private static int count=0;
	  static {
		  emps.add(new Employee(1,"jon","math","consultant",12000));
		  emps.add(new Employee(2,"janvi","math","consultant",10000));
		  emps.add(new Employee(3,"juhi","eng","consultant",16000));
	  }
	  public List<Employee> all()
	  {
		  return emps;
	  }
	  public Employee save(Employee emp) {
			 emp.setEid(++count);
			  emps.add(emp);
			  return emp;
		  }
}
