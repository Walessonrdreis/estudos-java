package model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    void validarLancamento(){
        int[]primeiroLancamento = {10,20,30,40,50};
        int[]segundoLancamento = {10,20,30,40,50,};
        //usado para verificar se o conteúdo de arrays diferentes
        assertArrayEquals(primeiroLancamento,segundoLancamento);
    } @Test
    void validarLancamento2(){
        int[]primeiroLancamento = {10,20,30,40,50};
        int[]segundoLancamento = {1,0,300,20,-1,};
        //usado para verificar se o conteúdo de arrays diferentes
        assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);
    }

    @Test
    void validaValorBoleano1(){
        int numero1 = 10;
        int numero2 = 11;

        boolean teste = numero1 != numero2;
        assertTrue(teste, "Sao iguais");
    }
    @Test
    void validaValorBoleano2(){
        int[] alunoNota = {7, 6, 8,9};
        assertTrue(alunoNota.length == 4,"Nao possui o tamanho indicado, tamanho esperado: "+alunoNota.length);

    }

}
