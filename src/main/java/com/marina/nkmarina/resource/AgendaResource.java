package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marina.nkmarina.domain.Agenda;
import com.marina.nkmarina.repository.AgendaRepository;


@RestController
@RequestMapping(value = "/agenda")
public class AgendaResource {

	private AgendaRepository  agendaRepository;
	
	public AgendaResource(AgendaRepository agendaRepository) {
        super();
    	this.agendaRepository = agendaRepository;
    }
	
	@GetMapping	
	public List<Agenda> lista() {
		return agendaRepository.findAll();       
    }
	
	
}