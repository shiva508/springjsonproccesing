package com.demo.JSONPROPERTY;

import java.io.IOException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class EmployeeJSONPROPERTYService {
private ObjectMapper objectMapper;

public EmployeeJSONPROPERTYService() {
	objectMapper = new ObjectMapper();
}
public String toJson(EmployeeJSONPROPERTY jsonproperty) throws JsonProcessingException {
	return objectMapper.writeValueAsString(jsonproperty);
}
public EmployeeJSONPROPERTY toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
	return objectMapper.readValue(jsoncontext, EmployeeJSONPROPERTY.class);
}
}
