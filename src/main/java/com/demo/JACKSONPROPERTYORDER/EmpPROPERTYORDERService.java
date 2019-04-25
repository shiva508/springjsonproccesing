package com.demo.JACKSONPROPERTYORDER;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class EmpPROPERTYORDERService {
	private ObjectMapper objectMapper;
	public EmpPROPERTYORDERService() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(EmpPROPERTYORDER jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public EmpPROPERTYORDER toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsoncontext, EmpPROPERTYORDER.class);
	}
}
