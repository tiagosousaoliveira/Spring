package com.tiago.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.cursomc.Domain.Categoria;
import com.tiago.cursomc.repositories.CategoriaRepositorio;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepositorio categoriarepositorio;
	
	public Categoria BuscarCategoria(Integer Id) {
		
		Categoria categoria =  categoriarepositorio.findOne(Id);
		
		return categoria;
	}
}
