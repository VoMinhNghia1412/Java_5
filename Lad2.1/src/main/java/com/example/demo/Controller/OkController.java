package com.example.demo.Controller;

import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class OkController {
@RequestMapping("/ctrl/ok")
public String Ok() {
	
	return "ok";
}
@PostMapping("/ctrl/ok")
public String m1(Model model) {
	model.addAttribute("message", "Cam on ban ham 1");
	return "ok";
}
@RequestMapping(value = {"/ctrl/ok"}, method = RequestMethod.GET)
	public String ok(Model model) {
	model.addAttribute("message", "Cam on ban ham 2");
	return "ok";
}
	
}

