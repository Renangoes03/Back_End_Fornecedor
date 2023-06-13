package com.fatec.fornecedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.fornecedor.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository <Fornecedor,Integer> {
    
}
