package com.myproject.restapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.restapi.dao.StudentDao;
import com.myproject.restapi.model.Student;

@RestController
@RequestMapping("/api")
public class PostController {

	@Autowired
	StudentDao studentDao;

//  @SuppressWarnings("rawtypes")
//	@PostMapping(value = "/save")
//	public ResponseEntity save(@RequestBody Student student)
//	{
//		studentDao.save(student) ;
//		
//		return new ResponseEntity(HttpStatus.OK);
//	}

	@PostMapping(value = "/save")
	public Student save(@RequestBody Student student) {

		return studentDao.save(student);
	}

}
