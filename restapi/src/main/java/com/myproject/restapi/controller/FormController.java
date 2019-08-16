package com.myproject.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.myproject.restapi.model.Student;

@Controller
public class FormController {

	@GetMapping(value = "/")
	public String getForm() {
		return "form.jsp";
	}

	@PostMapping(value = "/data")
	public String getData(@ModelAttribute Student student) {

		RestTemplate restTemplate = new RestTemplate();

		restTemplate.postForObject("http://localhost:8080/api/save", student,Student.class);
       
		// postForObject(url,value to be carried, return type of api method
		
		// api method generally doesnot return void .
		// if api method doesnot return anything it should return ResponseEntity
		 
		// ResponseEntity entity = restTemplate.postForObject("http://localhost:8080/api/save", student,ResponseEntity.class);

		
		return "form.jsp";
	}

}
