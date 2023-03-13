package backend.com.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backend.com.backend.model.Movimentacao;

@Repository
public interface MovimentacaoRepository extends CrudRepository<Movimentacao, Integer> {
    
}
