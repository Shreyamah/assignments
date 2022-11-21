package com.shrey.rest2;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
private Integer id;
@Size(min=2)
@JsonProperty("user_name")
private String name;
@Past
private LocalDate birth;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getBirth() {
	return birth;
}
public void setBirth(LocalDate birth) {
	this.birth = birth;
}
public User(Integer id, String name, LocalDate birth) {
	super();
	this.id = id;
	this.name = name;
	this.birth = birth;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", birth=" + birth + "]";
}


}
