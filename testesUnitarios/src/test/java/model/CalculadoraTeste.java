package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testeCalcularSoma(){
        Assertions.assertEquals(2, calculadora.soma(1,1));

    }

}
