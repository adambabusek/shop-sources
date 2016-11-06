package com.shop.admin.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.admin.domain.BaseResponse;

@RestController
@RequestMapping("/data")
public class RestDataController {

	@RequestMapping("")	
	public BaseResponse baseResponse(@RequestParam(value="number", defaultValue="0") String number) {
		return new BaseResponse(System.currentTimeMillis(), number);
	}
	
	@RequestMapping("/{pathNumber}")	
	public BaseResponse pathNumberResponse(@PathVariable(value="pathNumber") int pathNumber) {
		return new BaseResponse(System.currentTimeMillis(), String.valueOf(pathNumber));
	}
}
