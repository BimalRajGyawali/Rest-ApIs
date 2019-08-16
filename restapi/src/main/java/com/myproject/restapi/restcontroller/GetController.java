package com.myproject.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.restapi.dao.StudentDao;
import com.myproject.restapi.model.Student;

@RestController
@RequestMapping("/api")
public class GetController {

	@Autowired
	StudentDao studentDao;

	@GetMapping(value = "/list")
	public List<Student> getAllStudents() {
		List<Student> students = studentDao.findAll();
		return students;
	}
	
	@GetMapping(value="/show/{roll}")
	public Student getStudentByRoll(@PathVariable("roll") int roll)
	{
		return studentDao.findById(roll).orElse(null);
	}

}
