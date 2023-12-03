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
//import com.marina.nkmarina.domain.CheckList;
import com.marina.nkmarina.repository.AgendaRepository;
///import com.marina.nkmarina.repository.CheckListRepository;


@RestController
@RequestMapping(value = "api/agenda")
public class AgendaResource {

	private AgendaRepository  agendaRepository;
	///private CheckListRepository  checkListRepository;
	
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

		/*
		if (agenda.getId_agenda()==0){	
			for (int i=1; i<=6; i++) {
				var checkList1 = new CheckList();
				checkList1.setEmbarcacao(agenda.getEmbarcacao());
				checkList1.setSituacao_check("1");
				checkList1.setTipo_check(i);
				checkListRepository.save(checkList1);
			}
		}
		*/
		return agendaRepository.save(agenda);
		
    }
	
	@DeleteMapping("/{id}")
	public void deleteAgenda(@PathVariable Integer id) {
		agendaRepository.deleteById(id);
	}
	
	
	
	
}

