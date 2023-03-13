package backend.com.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import backend.com.backend.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
    
}
