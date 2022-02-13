package com.crudvue.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.crudvue.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    List<Cliente> findByIdade(int idade);    
}
