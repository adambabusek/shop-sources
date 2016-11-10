package com.shop.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.admin.domain.HttpParams;
import com.shop.admin.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String loginView() {
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String doLogin(@RequestParam(name = HttpParams.EMAIL) String email, @RequestParam(name = HttpParams.PASSWORD) String password) {
		if (loginService.isAdmin(email, password)) {
			return "";
		}
		return "Not OK";
	}
}
