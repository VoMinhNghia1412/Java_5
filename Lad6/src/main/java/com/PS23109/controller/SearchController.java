package com.PS23109.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PS23109.dao.SearchDAO;
import com.PS23109.entity.SearchEntity;


@Controller
public class SearchController {
	@Autowired
	SearchDAO dao ;
@RequestMapping("/search")
public String search(Model model, 
		@RequestParam("min") Optional<Double> min,
		@RequestParam("max") Optional<Double> max) {
	
	double minPrice = min.orElse(Double.MIN_VALUE);
	double maxPrice = max.orElse(Double.MAX_VALUE);
	
	List<SearchEntity> items = dao.findByPrice(minPrice, maxPrice);
	model.addAttribute("items", items);
	return "searchindex";
}
}
