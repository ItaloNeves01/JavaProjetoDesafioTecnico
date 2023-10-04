package com.example.ProjetoJava.Pessoa;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.ProjetoJava.Repository.PessoaRepository;
import com.example.ProjetoJava.Service.PessoaService;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class PessoaServiceTest {

    @InjectMocks
    private PessoaService pessoaService;

    @Mock
    private PessoaRepository pessoaRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCriarPessoa() {
        // Criação de uma pessoa de exemplo
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setDataNascimento("1990-01-01");

        // Mock do comportamento do repository
        when(pessoaRepository.save(any(Pessoa.class))).thenReturn(pessoa);

        // Chama o serviço para criar uma pessoa
        Pessoa pessoaCriada = pessoaService.criarPessoa(pessoa);

        // Verifica se o objeto retornado não é nulo
        assertNotNull(pessoaCriada);
        // Verifica se o nome da pessoa criada é igual ao nome definido anteriormente
        assertEquals("João", pessoaCriada.getNome());
    }

    // Adicione mais testes para os outros métodos do PessoaService aqui
}
