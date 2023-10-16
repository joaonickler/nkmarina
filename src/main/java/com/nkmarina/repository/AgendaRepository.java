package com.nkmarina.repository;


import com.nkmarina.domain.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AgendaRepository extends JpaRepository <Agenda, Integer> {

}

