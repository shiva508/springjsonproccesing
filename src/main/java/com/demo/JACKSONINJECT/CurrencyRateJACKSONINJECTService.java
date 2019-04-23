package com.demo.JACKSONINJECT;

import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CurrencyRateJACKSONINJECTService {
	private ObjectMapper objectMapper;
	public CurrencyRateJACKSONINJECTService() {
		objectMapper = new ObjectMapper();
	}
	public String toJson(CurrencyRate jsonproperty) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonproperty);
	}
	public CurrencyRate toObject(String jsoncontext) throws JsonParseException, JsonMappingException, IOException {
		InjectableValues injectableValues=new InjectableValues.Std();
		 ((InjectableValues.Std) injectableValues).addValue("lastUpdated", LocalDateTime.now());
		 objectMapper.setInjectableValues(injectableValues);
		return objectMapper.readValue(jsoncontext, CurrencyRate.class);
	}
	
	/*
	 * Injecting by type In above example we injected 'lastUpdated' field by an id
	 * (via @JacksonInject#value). What if we don't specify the value i.e.
	 * 
	 * @JacksonInject private LocalDateTime lastUpdated; In that case the property
	 * will be injected by type and we have to use another overloaded method of
	 * InjectableValues.Std#addValue() which specifies the target property type
	 * instead of the id:
	 * 
	 * ... InjectableValues iv = new InjectableValues.Std(); ((InjectableValues.Std)
	 * iv).addValue(LocalDateTime.class, LocalDateTime.now());
	 */
}
