package br.com.tiagodeveloper.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tiagodeveloper.interfaces.ContatoCrud;
import br.com.tiagodeveloper.models.Contato;

@Service
public class ContatoService implements ContatoCrud{
	
	final static List<Contato> LISTA = new ArrayList<Contato>();
	
	static{
		LISTA.addAll(Arrays.asList(
			new Contato(1l,"Grupo",99999999),
			new Contato(2l,"Do",99999999),
			new Contato(3l,"Rick",99999999),
			new Contato(4l,"Só",99999999),
			new Contato(5l,"tem",99999999),
			new Contato(6l,"Velho",99999999),
			new Contato(7l,"Doente",99999999),
			new Contato(8l,"Michonne",99999999)
		));
	}
	
	public List<Contato> findAll(){
		return LISTA;
	}
	public Contato findOne(Long id){
		return LISTA.get(id.intValue());
	}
}
