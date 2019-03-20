package com.demo.service;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.demo.modal.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class EmployeeServiceImpl {
	ObjectMapper om;

	public EmployeeServiceImpl() {
		om = new ObjectMapper();
	}

	public void conVersions() {
		Employee employee = new Employee("Shiva", "Development");
	}

	public String toJson(Employee employee) throws IOException {
		return om.writeValueAsString(employee);
	}

	public Employee toEmployee(String jsonData) throws IOException {
		return om.readValue(jsonData, Employee.class);
	}
}
