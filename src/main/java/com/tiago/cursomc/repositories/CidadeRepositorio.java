package com.tiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.cursomc.Domain.Cidade;

@Repository
public interface CidadeRepositorio  extends JpaRepository<Cidade, Integer>{

}
