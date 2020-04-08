package solutions.simplemobile.student.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import solutions.simplemobile.student.model.Student;

@RestController
@RequestMapping(value = "students", produces = "application/json")
public class StudentRestController {

	@GetMapping
	@ResponseBody
	public List<Student> getAll(){
		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "Nikola", "Kovacevski"));
		student.add(new Student(2, "Ivana", "Grujovska"));
		student.add(new Student(3, "Ivana", "Grujovks Kovacevska"));
		return student;
	}
	
}
