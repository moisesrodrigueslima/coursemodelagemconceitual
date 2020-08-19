package com.moiseslima.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moiseslima.coursemc.domain.Endereco;

@Repository
public interface  EnderecoRepository extends JpaRepository<Endereco, Integer>{

	
	
	
}
