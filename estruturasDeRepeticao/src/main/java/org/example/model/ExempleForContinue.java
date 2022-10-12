package org.example.model;

public class ExempleForContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){
            if (numero == 3)
                continue;
            System.out.println("Numero : "+ numero);
        }
    }
}
