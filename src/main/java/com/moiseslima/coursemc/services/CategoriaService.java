package com.moiseslima.coursemc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moiseslima.coursemc.domain.Categoria;
import com.moiseslima.coursemc.repositories.CategoriaRepository;
import com.moiseslima.coursemc.services.exceptions.ObjectNotFoundException;



@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	 
	public Categoria buscar(Integer id) {
	
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	

	
	
			
	}


