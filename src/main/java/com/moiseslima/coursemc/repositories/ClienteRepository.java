package com.moiseslima.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moiseslima.coursemc.domain.Cliente;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Integer>{

	
	
	
}
