package com.example.demo.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	String name;
	String email;
	Double marks;
	Boolean gender;
	String faculty;
}
