package com.spring.security.prueba.prueba_primaveral_segura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@RequestMapping("home")
public class TestController {
	
	@GetMapping()
	public String test() {
		return "bienvenido";
	}

}
