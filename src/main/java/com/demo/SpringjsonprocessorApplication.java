package com.demo;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.form.EmptyObject;
import com.demo.modal.Roles;
import com.demo.modal.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootApplication
public class SpringjsonprocessorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringjsonprocessorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* To Json: */
		ObjectMapper om = new ObjectMapper();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Satish", 508);
		map.put("Shiva", 408);
		// to ENABLE IBNDENTED OUTPUT
		om.enable(SerializationFeature.INDENT_OUTPUT);
		// UNKNOWN VALUE
		om.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		String s = om.writeValueAsString(map);
		System.out.println(s);
		/* To Java Object: */
		String jsonString = "{\"bananas\":2,\"apple\":5}";
		Map<String, Integer> map2 = om.readValue(jsonString, Map.class);
		System.out.println(map2);
		System.out.println(map2.getClass());

		User user = new User();
		user.setUserId(408);
		user.setUserNAme("Shiva");
		Roles roles = new Roles();
		roles.setRoleId(208);
		/* roles.setRoleName("EMPLOYEE"); */
		Roles roles1 = new Roles();
		roles1.setRoleId(308);
		roles1.setRoleName("ADMIN");
		user.setRoles(Arrays.asList(roles, roles1));
		String userJson = om.writeValueAsString(user);
		System.out.println(userJson);

		User userre = om.readValue(userJson, User.class);
		System.out.println(userre);
		File file = File.createTempFile("jackson-", ".txt");
		System.out.println("------Saving to file");
		System.out.println(file);

		om.writeValue(file, user);

		System.out.println("0-----Reading from text box");
		String text = new String(Files.readAllBytes(file.toPath()));
		System.out.println("-- reading as Object from file --");
		System.out.println(text);
		User userfile = om.readValue(text, User.class);
		System.out.println(userfile);
		/* REading from URL */
		URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
		Object ob = om.readValue(url, Object.class);
		System.out.println(ob);
		System.out.println(ob.getClass());
		System.out.println("======================================");
		System.out.println("Empty Object serialization");
		EmptyObject emptyObject = new EmptyObject();
		om.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		String emptyText = om.writeValueAsString(emptyObject);
		System.out.println("EMPTY BEAN=" + emptyText);
		System.out.println("======================================");
		System.out.println("Assigning JSON empty string to null POJO");
		String input = "{\"myObjKey\":\"\"}";
		System.out.println("MY INPYT=" + input);
		om.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		Map<String, User> emptyMap = om.readValue(input, new TypeReference<Map<String, User>>() {
		});
		System.out.println("MAPOBJECT=" + emptyMap);
		System.out.println("======================================");
		System.out.println("Serialize java.util.Date as formatted String");
		Date date = new Date();
		om.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		String textDate = om.writeValueAsString(date);
		System.out.println("Date:" + textDate);
		System.out.println("======================================");
		System.out.println("Ignoring Unknown Properties");
		String dup = "{\"roles\" : [ {\"ROLENAME\" : null}, { \"ROLENAME\" : \"ADMIN\"} ],\"strVal\" : \"408\",\"USERID\" : 408,\"USERNAME\" : \"Shiva\",\"PHONE\":\"9493366706\"}";
System.out.println(dup);
User userTde=om.readValue(dup, User.class);
System.out.println(userTde);
	}

}
