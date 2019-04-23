package com.demo.JSONSETTERandGETTER;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EmployeeSETGET {
	/* @JsonGetter and @JsonSetter are old alternatives to @JsonProperty. */
private String name;
private String dept;
public EmployeeSETGET() {

}
@JsonGetter("emp_name")
public String getName() {
	return name;
}
@JsonSetter("emp_name")
public void setName(String name) {
	this.name = name;
}
@JsonGetter("emp_depot")
public String getDept() {
	return dept;
}
@JsonSetter("emp_depot")
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "EmployeeSETGET {name=" + name + ", dept=" + dept + "}";
}
}
