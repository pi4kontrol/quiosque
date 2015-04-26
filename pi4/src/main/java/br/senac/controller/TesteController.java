package br.senac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteController {

	@RequestMapping("/olaMundoSpring")
	public String olaMundo(){
		
		System.out.println("Executou controller");
		return "ok";
	}
}
