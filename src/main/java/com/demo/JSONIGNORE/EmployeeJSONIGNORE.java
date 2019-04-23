package com.demo.JSONIGNORE;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EmployeeJSONIGNORE {
	/*
	 * @JsonIgnore can be used on fields or getters or setters to ignore individual
	 * properties.
	 */
private String name;
private String depot;
@JsonIgnore
private String address;
public EmployeeJSONIGNORE() {
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepot() {
	return depot;
}
public void setDepot(String depot) {
	this.depot = depot;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "EmployeeJSONIGNORE {name=" + name + ", depot=" + depot + ", address=" + address + "}";
}

}
