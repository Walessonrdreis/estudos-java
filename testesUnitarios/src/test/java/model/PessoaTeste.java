package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validaVerificacaoDeMaiorIdade(){
        Pessoa joaozinho = new Pessoa("João", LocalDate.of(2004,1,1));
        Assertions.assertTrue(joaozinho.ehMaiorDeIdade());
    }
}
