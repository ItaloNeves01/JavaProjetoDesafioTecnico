package com.example.ProjetoJava.Pessoa;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.example.ProjetoJava.Endereco.Endereco; 
//pessoas
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;

    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "pessoa")
    private List<Endereco> enderecos;

//gerando os getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEndereços() {
        return enderecos;
    }

    public void setEndereços(List<Endereco> endereços) {
        this.enderecos = endereços;
    }


}