package com.shop.admin.service.impl;

import org.springframework.stereotype.Service;

import com.shop.admin.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isAdmin(String email, String password) {
		if ("admin@shop.com".equals(email) && "admin".equals(password)) {
			return true;
		}
		return false;
	}

}
