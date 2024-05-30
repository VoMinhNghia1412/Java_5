package com.example.demo.ResultController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResultController {
@RequestMapping("/a")
public String m1() {
	return"a";
}
@RequestMapping("/b")
public String m2(Model model) {
	model.addAttribute("message","Xin chao day la b ne");
	return"a";
}

@RequestMapping("c")
public String m3(RedirectAttributes param) {
	param.addAttribute("message","Xin chao day la c ne");
	return"redirect:/a";
}
@RequestMapping("d")
public String m4() {
	return"Xin chao day la d ne " ;
}
}
