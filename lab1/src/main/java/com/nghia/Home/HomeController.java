package com.nghia.Home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("index")
public String nghia (Model model) {
	model.addAttribute("message","Xinchao");
	return "index";
	
	}
}
