package org.example.heranca.subclasses;

import org.example.heranca.Pessoa;

import java.util.Date;

public class Aluno extends Pessoa {
    public Aluno(String _nome, String _cpf, Date _data){
        super(_nome, _cpf, _data);
    }

    public String matricula;

    @Override
    public double tirarCopias(int qtd) {
        return 0.07 * (double) qtd;
    }
}
