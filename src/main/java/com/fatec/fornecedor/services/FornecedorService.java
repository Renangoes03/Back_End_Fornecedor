package com.fatec.fornecedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.fornecedor.entities.Fornecedor;
import com.fatec.fornecedor.repositories.FornecedorRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FornecedorService {

@Autowired
private FornecedorRepository fornecedorRepository;

 public Fornecedor getFornecedorById(int id) {
        return fornecedorRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("cliente não encontrado"));
    }


    public List<Fornecedor> getFornecedor(){
        return fornecedorRepository.findAll();
    }


   public void deleteById(int id){
        Fornecedor fornecedor = getFornecedorById(id);
        fornecedorRepository.delete(fornecedor);
    }


public Fornecedor salvar(Fornecedor fornecedor) {
    return fornecedorRepository.save(fornecedor);
}


public void update(int id, Fornecedor fornecedor) {
   getFornecedorById(id);
   fornecedorRepository.save(fornecedor);
}

}
