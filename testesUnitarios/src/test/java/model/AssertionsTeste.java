package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    void validarLancamento(){
        int[]primeiroLancamento = {10,20,30,40,50};
        int[]segundoLancamento = {10,20,30,40,50,};
        //usado para verificar se o conteúdo de arrays diferentes
        Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);
    } @Test
    void validarLancamento2(){
        int[]primeiroLancamento = {10,20,30,40,50};
        int[]segundoLancamento = {1,0,300,20,-1,};
        //usado para verificar se o conteúdo de arrays diferentes
        Assertions.assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
    }
}
