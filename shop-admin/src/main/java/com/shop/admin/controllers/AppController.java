package com.shop.admin.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/login")
	public String loginView() {		
		System.out.println(messageSource.getMessage("login.submit", null, Locale.getDefault()));
		return "login";
	}
}
