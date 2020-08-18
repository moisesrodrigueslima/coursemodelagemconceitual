package com.moiseslima.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moiseslima.coursemc.domain.Cidade;

@Repository
public interface  CidadeRepository extends JpaRepository<Cidade, Integer>{

	
	
	
}
