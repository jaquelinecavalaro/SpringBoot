package com.minha2aplicacao.atividade2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")

public class exercicio2 {

	@GetMapping
	
	public String Exercicio2() {
	return "Meu objetivo para essa semana é focar na orientação ao detalhe e persistência.";
	}
}
