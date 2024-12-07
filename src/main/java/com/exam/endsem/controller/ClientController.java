package com.exam.endsem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("SpringMvc")
public class ClientController {
  //1 question
	@ResponseBody
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome";
	}
	
	
    //2 question
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/display")
	public String displayIdAndName(@RequestParam("id") int id,@RequestParam("name") String name,Model model) {
		int sid = id;
		String sname = name;
		model.addAttribute("id",sid);
		model.addAttribute("name",sname);
		return "display";
	}
	
	@GetMapping("/addNumber")
	public String addTwoNumbers(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model model) {
		int c = num1+num2;
		
		model.addAttribute("sum",c);
		
		return "addNumber";
	}
	
	@GetMapping("/combine")
	public String concate(@RequestParam("str1") String str1,@RequestParam("str2") String str2,Model model) {
	   String con = str1+str2;
		
		model.addAttribute("sum",con);
		
		return "combine";
	}
	
	
	@GetMapping("/calculate")
	public String calculate(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model model) {
		int  c = num1+num2;
		int mul = num1*num2;
		model.addAttribute("sum",c);
		model.addAttribute("Multiplication",mul);
		return "addNumber";
	}
	
	
}
