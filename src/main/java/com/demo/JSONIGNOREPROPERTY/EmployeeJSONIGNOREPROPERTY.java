package com.demo.JSONIGNOREPROPERTY;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"depot","address"})
public class EmployeeJSONIGNOREPROPERTY {
	/*
	 * @JsonIgnoreProperties can be used to ignore multiple properties with one
	 * declaration:
	 */
private String name;
private String depot;
private String address;
public EmployeeJSONIGNOREPROPERTY() {
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
	return "EmployeeJSONIGNOREPROPERTY {name=" + name + ", depot=" + depot + ", address=" + address + "}";
}

}
