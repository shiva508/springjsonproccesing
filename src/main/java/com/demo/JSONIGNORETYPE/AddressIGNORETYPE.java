package com.demo.JSONIGNORETYPE;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class AddressIGNORETYPE {
private String street;
private String city;
public AddressIGNORETYPE() {

}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "AddressIGNORETYPE {street=" + street + ", city=" + city + "}";
}

}
