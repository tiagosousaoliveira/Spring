package com.tiago.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.cursomc.Domain.Categoria;
import com.tiago.cursomc.Exception.ObjNotFoundException;
import com.tiago.cursomc.repositories.CategoriaRepositorio;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepositorio categoriarepositorio;
	
	public Categoria BuscarCategoria(Integer Id) {
		
		Categoria categoria =  categoriarepositorio.findOne(Id);
		
		if(categoria == null){

				throw new ObjNotFoundException("Objeto não encontrado Id = "+ Id 
						+ "Tipo: " + Categoria.class.getName());
		}
		
		return categoria;
	}
}
