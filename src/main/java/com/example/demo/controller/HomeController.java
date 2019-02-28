package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {

	
	@GetMapping (value="/")
	public String getHour() {
		return "Milton Camara - Deploy on Azure with Jenkins at " + new Date() ;
	}
	
}
