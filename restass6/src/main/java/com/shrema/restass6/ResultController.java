package com.shrema.restass6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
	@GetMapping(path="/add/path-variable/{num1},{num2}")
	public int Add(@PathVariable int num1,@PathVariable int num2) {
		return num1+num2;
	}
	@GetMapping(path="/minus/path-variable/{num1},{num2}")
	public int Minus(@PathVariable int num1,@PathVariable int num2) {
		return num1-num2;
	}
	@GetMapping(path="/mul/path-variable/{num1},{num2}")
	public int Mul(@PathVariable int num1,@PathVariable int num2) {
		return num1*num2;
	}
	@GetMapping(path="/mul/path-variable/{num1},{num2}")
	public int Div(@PathVariable int num1,@PathVariable int num2) {
		return num1/num2;
	}
	@GetMapping(path="/mul/path-variable/{num1},{num2}")
	public int Sqr(@PathVariable int num1,@PathVariable int num2) {
		return num1/num2;
	}
}
