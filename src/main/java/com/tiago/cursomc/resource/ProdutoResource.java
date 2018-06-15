package com.tiago.cursomc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.cursomc.Domain.Produto;
import com.tiago.cursomc.service.ProdutoService;




@RestController
@RequestMapping(value="/produto")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Produto prod = produtoService.LIstarProduto(id);
		return ResponseEntity.ok().body(prod);
				
	}

}
