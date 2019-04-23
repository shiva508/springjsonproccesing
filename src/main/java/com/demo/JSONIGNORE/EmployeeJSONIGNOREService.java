package com.demo.JSONIGNORE;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.demo.JSONPROPERTY.EmployeeJSONPROPERTY;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeJSONIGNOREService {
	private ObjectMapper objectMapper;
	public EmployeeJSONIGNOREService() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(EmployeeJSONIGNORE jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public EmployeeJSONIGNORE toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsoncontext, EmployeeJSONIGNORE.class);
	}
}
