package com.example.ProjetoJava.NoEndereco;
//exeção para quando não tiver um endereço;
public class EnderecoNotFoundException extends RuntimeException {

    public EnderecoNotFoundException(String message) {
        super(message);
    }

    public EnderecoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
