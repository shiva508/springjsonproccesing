package com.demo.modal;

import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
@JsonIgnoreProperties({"roleId"})
public class Roles {
private Integer roleId;
private String roleName;
public Roles() {
}
public Integer getRoleId() {
	return roleId;
}
@JsonSetter(nulls=Nulls.AS_EMPTY)
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
@JsonGetter("ROLENAME")
public String getRoleName() {
	return roleName;
}
@JsonSetter("ROLENAME")
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
@Override
public String toString() {
	return "Roles [roleId=" + roleId + ", roleName=" + roleName + "]";
}

}
