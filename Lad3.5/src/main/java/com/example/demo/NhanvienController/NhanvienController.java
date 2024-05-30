package com.example.demo.NhanvienController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.NhanvienEntity.NhanvienEntity;

@Controller
public class NhanvienController {
@RequestMapping("/student/form")
public String student( @ModelAttribute("sv") NhanvienEntity sv) 
{
	sv.setName("Vo MInh Nghia");
	sv.setEmail("VoMinhNghia@gmail.com");
	sv.setMarks(10.0);	
	
return "form";	

}
@RequestMapping("/student/save")
public String save(@Validated  @ModelAttribute("sv")NhanvienEntity sv, Errors errors , Model model) {
	if (errors.hasErrors())
	{
		model.addAttribute("message", "Vui long sua cac loi : ");
	}
	else {
		model.addAttribute( "message" ,"Luu thong tin thanh cong !");
		
	}
	
	return"form";
}

@ModelAttribute("genders")
public Map<Boolean, String> getGender(){
	Map<Boolean, String> map = new HashMap<>();
	map.put(true, "Male");
	map.put(false, "Female");
	return map;
}

@ModelAttribute("faculties")
public List<String> getFaculties(){
	return Arrays.asList("QTM","CNTT","TKDH");
	
}
@ModelAttribute("hobbies")
public Map<String, String> getHobbies(){
	Map<String, String> map = new HashMap<>();
	map.put("T", "Travelling");
	map.put("M", "Music");
	map.put("F", "Food");
	map.put("O", "Other");
	return map;
}




}
