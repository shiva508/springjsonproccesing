package com.demo.JSONIGNOREPROPERTY;

import java.io.IOException;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeJSONIGNOREPROPERTYService {
	private ObjectMapper objectMapper;
	public EmployeeJSONIGNOREPROPERTYService() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(EmployeeJSONIGNOREPROPERTY jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public EmployeeJSONIGNOREPROPERTY toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsoncontext, EmployeeJSONIGNOREPROPERTY.class);
	}
}
