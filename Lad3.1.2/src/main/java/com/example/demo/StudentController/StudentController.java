package com.example.demo.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Student.Student;

@Controller
public class StudentController {
@RequestMapping("/student/form")
public String student(@ModelAttribute("sv") Student sv) {
	sv.setName("Vo Minh Nghia");
	sv.setEmail("Nghia@");
	sv.setMarks(90.0);
	sv.setFaculty("true");
	sv.setGender(true);
	return "form";
}
	
@RequestMapping("/student/save")
public String save(@ModelAttribute("sv") Student sv) {
	
	System.out.println("name : " + sv.getName());
	System.out.println("mark : " + sv.getMarks());
	return "student/form"; 
}
	
}
