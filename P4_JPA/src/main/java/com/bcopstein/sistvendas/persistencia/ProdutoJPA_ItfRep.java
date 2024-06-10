package com.bcopstein.sistvendas.persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoJPA_ItfRep extends CrudRepository<Produto, Long>{
    List<Produto> findAll();
    Produto findById(long id);
}
