package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	
	@GetMapping("/{id}")
    public Agenda getAgendaById(@PathVariable Integer id) {
        return agendaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Agenda não encontrado"));
    }
	
	@PostMapping
    public Agenda Agenda (@RequestBody Agenda agenda) {
        return agendaRepository.save(agenda);
    }
	
	@DeleteMapping("/{id}")
	public void deleteAgenda(@PathVariable Integer id) {
		agendaRepository.deleteById(id);
	}
	
	
	
	
}