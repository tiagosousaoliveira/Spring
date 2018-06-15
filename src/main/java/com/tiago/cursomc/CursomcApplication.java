package com.tiago.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tiago.cursomc.Domain.Categoria;
import com.tiago.cursomc.Domain.Produto;
import com.tiago.cursomc.repositories.CategoriaRepositorio;
import com.tiago.cursomc.repositories.ProdutoRepositorio;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		Produto prod1 = new Produto(null,"TV",1000.00);
		Produto prod2 = new Produto(null,"Maquina",1000.00);
		Produto prod3 = new Produto(null,"Notebook",1000.00);
		
		
		cat1.getProdutos().addAll(Arrays.asList(prod1,prod2,prod3));
		cat2.getProdutos().addAll(Arrays.asList(prod1));
		
		prod1.getCategorias().addAll(Arrays.asList(cat1));
		prod2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		prod3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepositorio.save(Arrays.asList(cat1,cat2));
		produtoRepositorio.save(Arrays.asList(prod1,prod2,prod3));
	}
}
