package com.demo.JACKSONPROPERTYORDER;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id","name","depot","course"})
public class EmpPROPERTYORDER {
private String name;
private String course;
private String depot;
private Integer id;
public EmpPROPERTYORDER() {
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getDepot() {
	return depot;
}
public void setDepot(String depot) {
	this.depot = depot;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@Override
public String toString() {
	return "EmpPROPERTYORDER {name=" + name + ", course=" + course + ", depot=" + depot + ", id=" + id + "}";
}

}
