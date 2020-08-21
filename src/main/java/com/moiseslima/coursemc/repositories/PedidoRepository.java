package com.moiseslima.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moiseslima.coursemc.domain.Pedido;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer>{

	
	
	
}
