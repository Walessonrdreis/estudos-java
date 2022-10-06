package model;

import lombok.Data;

@Data
public class Conta {

    private String nomeConta;
    private int saldo;

    public void lancaCredito(int valor){
        this.saldo += valor;
    }

    public void lancaDebito(int valor){
        this.saldo-= valor;
    }
}

