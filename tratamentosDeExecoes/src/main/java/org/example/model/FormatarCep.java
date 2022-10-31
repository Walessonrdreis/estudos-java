package org.example.model;

import org.example.exceptions.CepInvalidoExeption;

public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23795064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {

            System.out.println("O cep não corresponde as regras de negocio ");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeption{
        if (cep.length()!=8)
            throw new CepInvalidoExeption();

        //simulando cep invalido
        return "23.765-064";
    }

}
