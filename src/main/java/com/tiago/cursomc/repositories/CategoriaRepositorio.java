package com.tiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.cursomc.Domain.Categoria;

@Repository
public interface CategoriaRepositorio  extends JpaRepository<Categoria, Integer>{

}
