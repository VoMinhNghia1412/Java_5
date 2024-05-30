package com.PS23109.Controller;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PS23109.dao.PhanTrangDAO1;
import com.PS23109.entity.Phantrang;


@Controller
public class IndexController {
@Autowired 
PhanTrangDAO1 dao;
@GetMapping("/index")
public String index (Model model) {
	
	Phantrang item = new Phantrang();
	model.addAttribute("item",item);
	List<Phantrang> items = dao.findAll();
	model.addAttribute("items",items);
	
	return "index";
	
	
}

@RequestMapping("/product/sort")
public String sort(Model model , @RequestParam("field") Optional <String> field ) {
org.springframework.data.domain.Sort sort = org.springframework.data.domain.Sort.by(Direction.DESC , field.orElse("price")) ;
model.addAttribute(" field",field.orElse("price").toUpperCase());
List<Phantrang> items = dao.findAll(sort);
model.addAttribute("items",items);
	
	
	
	return"index";
}

@RequestMapping("/page")
public String page (Model model) {
	org.springframework.data.domain.Pageable pageable = PageRequest.of(1, 3);
	Page<Phantrang> page = dao.findAll(pageable);
	model.addAttribute("page", page);
	return "index1";
	
}

@RequestMapping("/product/page")
public String paginate(Model model,
		@RequestParam("p") Optional<Integer> p) {
	org.springframework.data.domain.Pageable pageable = PageRequest.of(p.orElse(0), 2);
	Page<Phantrang> page = dao.findAll(pageable);
	model.addAttribute("page", page);
	return "index1";
}

@RequestMapping("/product/search")
public String saerch(Model model, @RequestParam("min") Optional<Double> min ,
		@RequestParam("min") Optional<Double> max )  

{
	double minPrice = min.orElse(Double.MIN_VALUE);
	double maxPrice = max.orElse(Double.MAX_VALUE);
	List<Phantrang> items = dao.findByPrice(minPrice, maxPrice);
	model.addAttribute("items",items);
	
	
	
	return"index3";
	
	
}


}


