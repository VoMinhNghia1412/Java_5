package com.PS23109.IndexController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PS23109.DAO.CategoryDAO;
import com.PS23109.entity.Category;

@Controller
public class IndexController {
	@Autowired 
	CategoryDAO dao ;
	
	@GetMapping("/index")
	public String indexcontroller(Model model) {
		Category item = new Category();
		model.addAttribute("item",item);
		List<Category> items = dao.findAll();
		model.addAttribute("item",item);
		return "category/index";
	}

}
