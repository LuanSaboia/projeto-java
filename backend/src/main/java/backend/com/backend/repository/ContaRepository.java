package backend.com.backend.repository;

import org.springframework.stereotype.Repository;

import backend.com.backend.model.Conta;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ContaRepository extends CrudRepository<Conta, Integer> {
    
}
