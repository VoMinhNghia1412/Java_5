package com.PS23109.ShoppingController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PS23109.utils.DB;

@Controller
public class ItemController {
@RequestMapping("/item/index")
public String item (Model model) {
	model.addAttribute("items",DB.items.values());
	return "index";
	
	
	
}


}
