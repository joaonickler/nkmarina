package com.marina.nkmarina.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marina.nkmarina.domain.CheckList;
import com.marina.nkmarina.repository.CheckListRepository;


@RestController
@RequestMapping(value = "api/checklist")
public class CheckListResource {

	private CheckListRepository  checkListRepository;
	
	public CheckListResource(CheckListRepository checkListRepository) {
        super();
    	this.checkListRepository = checkListRepository;
    }
	
	@GetMapping	
	public List<CheckList> lista() {
		return checkListRepository.findAll();       
    }
	
	
	

	@GetMapping("/{id}")
    public CheckList getCheckListById(@PathVariable Integer id) {
        return checkListRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("CheckList não encontrado"));
    }
	
	@PostMapping
    public CheckList CheckList (@RequestBody CheckList checkList) {
        return checkListRepository.save(checkList);
    }
	
	@DeleteMapping("/{id}")
	public void deleteCheckList(@PathVariable Integer id) {
		checkListRepository.deleteById(id);
	}
	
	
	
	
	
}
