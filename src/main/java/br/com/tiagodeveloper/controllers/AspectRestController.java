package br.com.tiagodeveloper.controllers;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagodeveloper.interfaces.ContatoCrud;
import br.com.tiagodeveloper.models.Contato;

@RestController
@RequestMapping("/rest")
public class AspectRestController {
	
	@Autowired
	private ContatoCrud contatoService;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public @ResponseBody String home(){
		System.out.println("Estou dentro do método da requisição!");
		return "Hello folks!";
	}
	@RequestMapping(value="/contatos",produces="application/json")
	public @ResponseBody List<Contato> contatos(){
		return this.contatoService.findAll();
	}
	@RequestMapping(value="/contatos/{id}")
	public @ResponseBody Contato contato(@PathVariable("id") Long id){
		return this.contatoService.findOne(id);
	}
}
