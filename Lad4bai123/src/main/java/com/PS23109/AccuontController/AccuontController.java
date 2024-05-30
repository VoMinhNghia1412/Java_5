package com.PS23109.AccuontController;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.PS23109.service.CookieService;
import com.PS23109.service.ParamService;
import com.PS23109.service.SessionService;

@Controller
public class AccuontController {
@Autowired
CookieService cookieService;
@Autowired
ParamService paramService;
@Autowired
SessionService sessionService;
	
	
	
	@RequestMapping("/accuont/login")
	public String accuont () {
		return "login";
		
		
	}
	
	@PostMapping("/accuont/login")
	public String accuont2 (@RequestParam("photo_file") MultipartFile file) {
		String un = paramService.getString("username", "");
		String pw = paramService.getString("password", "");
		boolean rm = paramService.getBoolean("remember", false);
		if((un.equals("admin"))&&(pw.equals("123"))) {
			
			
			sessionService.set("username", un);
			if(rm) {
				
				cookieService.add("user", un, 10);
				cookieService.add("pass", pw, 10);
				System.out.print("Luu cookie thanh cong");
			}
			else {
				cookieService.remove("user");
				cookieService.remove("pass");
				
			}
			System.out.print("Dang nhap thanh cong");
			
		}
		else {
			System.out.print("Dang nhap that bai ");
		}
		
		
	java.io.File savedFile = paramService.save(file, "photo") ;
		
		
		return "login";
		
		
		
		
		
	}
	
}
