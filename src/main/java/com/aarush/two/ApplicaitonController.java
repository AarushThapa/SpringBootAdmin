package com.aarush.two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ApplicaitonController {
	
	@GetMapping(value="/index")
	public String homePage() {
		System.out.print("go the req");
		return "index";
	}
}
