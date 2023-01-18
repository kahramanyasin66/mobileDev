package com.mobilDev.libraryAutomation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

}
