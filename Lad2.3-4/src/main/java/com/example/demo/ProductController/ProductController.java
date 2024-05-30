package com.example.demo.ProductController;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Product.Product;

@Controller
public class ProductController {
@RequestMapping("/product/form")
public String product( Model model) {
	Product p = new Product();
	p.setName("Quan jean");
	p.setPrice(90.0);
	model.addAttribute("product",p);
	return "/product/form" ;
}


@PostMapping("/product/save")
public String save(@ModelAttribute("product")Product product) {
	
	return "/product/form";
}
@ModelAttribute("items")
public List<Product> getItems (){
	return Arrays.asList(new Product("Quan jean nam " , 10.9),new Product("QUan dui",12.0));
	
}

}