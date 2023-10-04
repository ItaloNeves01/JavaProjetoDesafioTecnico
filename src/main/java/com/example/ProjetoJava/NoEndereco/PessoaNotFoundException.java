package com.example.ProjetoJava.NoEndereco;
//exeção para quando não tiver uma pessoa
public class PessoaNotFoundException extends RuntimeException {

    public PessoaNotFoundException(String message) {
        super(message);
    }

    public PessoaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
