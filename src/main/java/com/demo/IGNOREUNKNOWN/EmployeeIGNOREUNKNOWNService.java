package com.demo.IGNOREUNKNOWN;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.demo.JSONPROPERTY.EmployeeJSONPROPERTY;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeIGNOREUNKNOWNService {
	private ObjectMapper objectMapper;
	public EmployeeIGNOREUNKNOWNService() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(EmployeeIGNOREUNKNOWN jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public EmployeeIGNOREUNKNOWN toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsoncontext, EmployeeIGNOREUNKNOWN.class);
	}
}
