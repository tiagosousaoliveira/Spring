package com.tiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.cursomc.Domain.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{

}
