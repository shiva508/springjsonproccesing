package com.demo.JSONSETTERandGETTER.NULL;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class EmployeeSETGETNull {
	/*
	 * the annotation @JsonSetter can be used to specify how 'null' values in JSON
	 * should be mapped to Java properties
	 */
private String name;
private String dept;
public EmployeeSETGETNull() {

}
@JsonGetter("emp_name")
public String getName() {
	return name;
}
@JsonSetter(value="emp_name",nulls=Nulls.AS_EMPTY)
public void setName(String name) {
	this.name = name;
}
@JsonGetter("emp_depot")
public String getDept() {
	return dept;
}
@JsonSetter(value="emp_depot",nulls=Nulls.AS_EMPTY)
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "EmployeeSETGETNull {name=" + name + ", dept=" + dept + "}";
}
}
