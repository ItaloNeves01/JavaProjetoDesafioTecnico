package com.example.ProjetoJava.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ProjetoJava.Pessoa.Pessoa;
import com.example.ProjetoJava.Service.PessoaService;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    // Criar uma pessoa
    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.criarPessoa(pessoa);
    }

    // Editar uma pessoa
    @PutMapping("/{id}")
    public Pessoa editarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        return pessoaService.editarPessoa(id, pessoa);
    }

    // Consultar pessoa pelo ID
    @GetMapping("/{id}")
    public Pessoa consultarPessoa(@PathVariable Long id) {
        return pessoaService.consultarPessoa(id);
    }

    // Listar todas as pessoas
    @GetMapping
    public List<Pessoa> listarPessoa() {
        return pessoaService.listarPessoas();
    }
}
