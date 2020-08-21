package com.moiseslima.coursemc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moiseslima.coursemc.domain.Pedido;
import com.moiseslima.coursemc.repositories.PedidoRepository;
import com.moiseslima.coursemc.services.exceptions.ObjectNotFoundException;



@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	 
	public Pedido find(Integer id) {
	
		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	

	
	
			
	}


