package com.PS23109.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PS23109.Entity.SanphamEntity;
import com.PS23109.dao.SanphamDAO;


@Controller
public class IndexController {
	@Autowired
	SanphamDAO dao ;
@RequestMapping("/index")

public String index (Model model) {
	SanphamEntity item = new SanphamEntity();
	model.addAttribute("item", item);
	List<SanphamEntity> items = dao.findAll();
	model.addAttribute("items", items);  
	
	
	
	return"index";
}
}
