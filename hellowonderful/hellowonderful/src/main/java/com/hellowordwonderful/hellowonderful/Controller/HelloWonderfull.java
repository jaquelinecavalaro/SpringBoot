package com.hellowordwonderful.hellowonderful.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/helloatividade1")

public class HelloWonderfull {

	@GetMapping
	public String hello () {
		return "Hello Atividade 01 de Sping boot\nHello wonderful world\nOlá Mundo Maravilhoso\nAs mentalidade e habilidade que utilizamos nesse exercício foi persistencia e orientação ao detalhe.";
	}
	
}
