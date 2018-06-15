package com.tiago.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.cursomc.Domain.Produto;
import com.tiago.cursomc.repositories.ProdutoRepositorio;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	public Produto LIstarProduto(Integer id) {
		
		Produto prod = produtoRepositorio.findOne(id);
		
		return prod;
		
	}

}
