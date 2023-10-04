package com.example.ProjetoJava.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjetoJava.Endereco.Endereco;
import com.example.ProjetoJava.NoEndereco.EnderecoNotFoundException;
import com.example.ProjetoJava.Repository.EnderecoRepository;
import java.util.List;
import java.util.Optional;



@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    // Criar um endereço e relacionar com uma pessoa
    public Endereco criarEndereco(Long pessoaId, Endereco endereco) {

        return enderecoRepository.save(endereco);
    }

    // Listar todos os endereços de uma pessoa
    public List<Endereco> listarEnderecos(Long pessoaId) {
        return enderecoRepository.findByPessoaId(pessoaId);
    }

    // Definir um endereço como principal
    public Endereco definirEnderecoPrincipal(Long enderecoId) {
        Optional<Endereco> enderecoOptional = enderecoRepository.findById(enderecoId);
        if (enderecoOptional.isPresent()) {
            Endereco endereco = enderecoOptional.get();
            endereco.setPrincipal(true);
            return enderecoRepository.save(endereco);
        } else {
            throw new EnderecoNotFoundException("Endereço não encontrado com o ID: " + enderecoId);
        }
}

}
