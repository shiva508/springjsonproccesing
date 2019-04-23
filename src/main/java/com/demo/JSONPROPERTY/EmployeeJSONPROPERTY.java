package com.demo.JSONPROPERTY;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeJSONPROPERTY {
	// @JsonProperty annotation to rename properties
	@JsonProperty("cource_name")
	private String name;
	@JsonProperty("deportment_name")
	private String depot;

	public EmployeeJSONPROPERTY() {

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

	@Override
	public String toString() {
		return "EmployeeJSONPROPERTY {name=" + name + ", depot=" + depot + "}";
	}

}
