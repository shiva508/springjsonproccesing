package com.demo.JSONIGNORETYPE;

import java.io.IOException;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmpIGNORETYPEService {
	private ObjectMapper objectMapper;
	public EmpIGNORETYPEService() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(EmpIGNORETYPE jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public EmpIGNORETYPE toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsoncontext, EmpIGNORETYPE.class);
	}
}
