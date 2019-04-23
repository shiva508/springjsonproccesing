package com.demo.JSONSETTERandGETTER.NULL;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.demo.JSONPROPERTY.EmployeeJSONPROPERTY;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeSETGETServiceNull {
	private ObjectMapper objectMapper;
	public EmployeeSETGETServiceNull() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(EmployeeSETGETNull jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public EmployeeSETGETNull toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsoncontext, EmployeeSETGETNull.class);
	}
}
