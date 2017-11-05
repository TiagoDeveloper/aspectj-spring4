package br.com.tiagodeveloper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class AspectController {

	
	@RequestMapping("")
	public String homePage(){
		return "home";
	}
}
