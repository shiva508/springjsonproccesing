package com.demo.IGNOREUNKNOWN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EmployeeIGNOREUNKNOWN {
	private String name;
	private String depot;
	private String address;
	public EmployeeIGNOREUNKNOWN() {
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
		return "EmployeeIGNOREUNKNOWN {name=" + name + ", depot=" + depot + ", address=" + address + "}";
	}

}
