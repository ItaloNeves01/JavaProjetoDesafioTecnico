package com.example.ProjetoJava.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjetoJava.NoEndereco.PessoaNotFoundException;
import com.example.ProjetoJava.Pessoa.Pessoa;
import com.example.ProjetoJava.Repository.PessoaRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa criarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa editarPessoa(Long id, Pessoa pessoa) {
        Optional<Pessoa> pessoaExistente = pessoaRepository.findById(id);
        if (pessoaExistente.isPresent()) {
            Pessoa pessoaAtualizada = pessoaExistente.get();
            pessoaAtualizada.setNome(pessoa.getNome());
            pessoaAtualizada.setDataNascimento(pessoa.getDataNascimento());
            return pessoaRepository.save(pessoaAtualizada);
        } else {
            throw new PessoaNotFoundException("Pessoa não encontrada com o ID: " + id);
        }
    }

    public Pessoa consultarPessoa(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new PessoaNotFoundException("Pessoa não encontrada com o ID: " + id));
    }

    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }
}
