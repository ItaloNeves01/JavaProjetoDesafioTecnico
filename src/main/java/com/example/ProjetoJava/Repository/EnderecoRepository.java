package com.example.ProjetoJava.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProjetoJava.Endereco.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    List<Endereco> findByPessoaId(Long pessoa);
}
