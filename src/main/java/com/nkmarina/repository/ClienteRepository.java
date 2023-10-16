package com.nkmarina.repository;


import com.nkmarina.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}

