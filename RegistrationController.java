package com.bismi.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bismi.lc.api.RegistrationDtoClass;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String homepage(@ModelAttribute("userReg")RegistrationDtoClass dto) {
		
		dto.setName("bismi");
		return "register-page";
	}
	
	@RequestMapping("/Registration-success")
	public String regSuccess(@ModelAttribute("userReg")RegistrationDtoClass dto) {
		return "reg-success";
	}
}
