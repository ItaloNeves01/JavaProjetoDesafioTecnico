package com.example.ProjetoJava.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoJava.Pessoa.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
