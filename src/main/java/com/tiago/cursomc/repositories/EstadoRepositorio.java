package com.tiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.cursomc.Domain.Estado;

@Repository
public interface EstadoRepositorio  extends JpaRepository<Estado, Integer>{

}
