package com.sunset.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/set")
public class SunsetController {
	
	@GetMapping("/sunset")
	public String sunset() {
		return "in the evening";
	}

}
