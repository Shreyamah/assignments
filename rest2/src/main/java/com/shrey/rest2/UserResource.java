package com.shrey.rest2;

import java.util.List;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController

public class UserResource {
	private UserDaoService service;
	public UserResource(UserDaoService service) {
		this.service=service;
	}
	@GetMapping("/users")
public List<User> alluser(){
	return service.all();
}
	@PostMapping("/users")
	public void createuser(@Valid @RequestBody User user) {
	service.save(user);
	}
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) {
		User user=service.findOne(id);
		EntityModel<User> entity= EntityModel.of(user);
		WebMvcLinkBuilder link= linkTo(methodOn(this.getClass()).alluser());
		entity.add(link.withRel("all-users"));
		return entity;
	}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteById(id);
	}
}
