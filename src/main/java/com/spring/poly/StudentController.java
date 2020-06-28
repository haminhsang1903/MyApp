package com.spring.poly;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping("/")
	public String index( ModelMap model) {
		List<Student> list = studentService.listAll();
		model.addAttribute("listStudent",list);
		return "index";
	}
	@RequestMapping("signUp")
	public String signUp() {	
		return "signUp";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}
