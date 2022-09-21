package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {


    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000,1,1));
        Assertions.assertEquals(22, jessica.getIdade());
    }
    @Test
    void validaVerificacaoDeMaiorIdade1(){
        Pessoa joaozinho = new Pessoa("João", LocalDate.of(2004,1,1));
        Assertions.assertTrue(joaozinho.ehMaiorDeIdade());
    }@Test
    void validaVerificacaoDeMaiorIdade2(){
        Pessoa Mari = new Pessoa("Maria", LocalDate.of(2010,1,1));
        Assertions.assertFalse(Mari.ehMaiorDeIdade());
    }


}
