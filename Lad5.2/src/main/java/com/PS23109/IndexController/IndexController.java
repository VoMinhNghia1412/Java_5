package com.PS23109.IndexController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PS23109.DAO.SanphamDAO;

import com.PS23109.entity.Sanpham;





@Controller
public class IndexController {
@Autowired
SanphamDAO dao;

@GetMapping("/index")
public String index (Model model) {
	Sanpham item = new Sanpham();
	model.addAttribute("item", item);
	List<Sanpham> items = dao.findAll();
	model.addAttribute("items", items);  
	return "index"; 

	
}
	
@RequestMapping("/category/edit/{id}")
public String edit(Model model, @PathVariable("id") String id) {
	Sanpham item = dao.findById(id).get();
	model.addAttribute("item", item);
	List<Sanpham> items = dao.findAll();
	model.addAttribute("items", items);
	return "index";
}
@RequestMapping("/category/create")
public String create(Sanpham item) {
	dao.save(item); // thêm item vào csdl
	return "redirect:/index"; // hiện thị
}

@RequestMapping("/category/update")
public String update(Sanpham item) {
	dao.save(item); // cập nhật
	return "redirect:/category/edit/" + item.getId();
}
@RequestMapping("/category/delete/{id}")
public String create(@PathVariable("id") String id) {
	dao.deleteById(id); // gọi hành động xóa
	return "redirect:/index";  // gọi hàm hiện thị
}

}
