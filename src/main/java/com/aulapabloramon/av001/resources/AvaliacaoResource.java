package com.aulapabloramon.av001.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="avaliacao")
public class AvaliacaoResource {

	
@RequestMapping(method=RequestMethod.GET)	
public String listar() {
	return "avaliação Terminada, professor chimpa!";
	
}	
	
	
}
