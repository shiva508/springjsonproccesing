package com.demo.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class User {
	@JsonProperty("USERID")
private Integer userId;
	@JsonProperty("USERNAME")
private String userNAme;
	/* @JsonProperty("ROLESLIST") */
private List<Roles> roles;
@JsonIgnore
private String ignoreText;	
public User() {
	super();

}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserNAme() {
	return userNAme;
}
public void setUserNAme(String userNAme) {
	this.userNAme = userNAme;
}
public List<Roles> getRoles() {
	return roles;
}
public void setRoles(List<Roles> roles) {
	this.roles = roles;
}
public String getStrVal() {
    return Integer.toString(userId);
}

public String getIgnoreText() {
	return ignoreText;
}

public void setIgnoreText(String ignoreText) {
	this.ignoreText = ignoreText;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userNAme=" + userNAme + ", ignoreText=" + ignoreText + ", roles=" + roles
			+ "]";
}


}
