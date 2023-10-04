package com.example.ProjetoJava.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ProjetoJava.Endereco.Endereco;
import com.example.ProjetoJava.Service.EnderecoService;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas/{pessoaId}/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    // Criar endereço associado a uma pessoa
    @PostMapping
    public Endereco criarEndereco(@PathVariable Long pessoaId, @RequestBody Endereco endereco) {
        return enderecoService.criarEndereco(pessoaId, endereco);
    }

    // Listar todos os endereços de uma pessoa
    @GetMapping
    public List<Endereco> listarEnderecos(@PathVariable Long pessoaId) {
        return enderecoService.listarEnderecos(pessoaId);
    }

    // Definir um endereço como principal
    @PutMapping("/{enderecoId}/principal")
    public Endereco definirEnderecoPrincipal(@PathVariable Long pessoaId, @PathVariable Long enderecoId) {
        return enderecoService.definirEnderecoPrincipal(enderecoId);
    }
}
