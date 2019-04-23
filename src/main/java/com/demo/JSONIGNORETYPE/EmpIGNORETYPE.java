package com.demo.JSONIGNORETYPE;

import com.fasterxml.jackson.annotation.JsonProperty;
public class EmpIGNORETYPE {
	/*
	 * The annotation @JsonIgnoreType can be used to ignore the whole class, i.e. to
	 * ignore all properties of that class.
	 */
private String name;
private String depot;
@JsonProperty("address")
private AddressIGNORETYPE address;
public EmpIGNORETYPE() {
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
public AddressIGNORETYPE getIgnoretype() {
	return address;
}
public void setIgnoretype(AddressIGNORETYPE address) {
	this.address = address;
}
@Override
public String toString() {
	return "EmpIGNORETYPE {name=" + name + ", depot=" + depot + ", address=" + address + "}";
}

}
