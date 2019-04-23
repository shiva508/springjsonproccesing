package com.demo.JSONSETTERandGETTER;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.demo.JSONPROPERTY.EmployeeJSONPROPERTY;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeSETGETService {
	private ObjectMapper objectMapper;
	public EmployeeSETGETService() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(EmployeeSETGET jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public EmployeeSETGET toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsoncontext, EmployeeSETGET.class);
	}
}
