package org.example.model;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println(saldo);
        }else{
            System.out.println("Saldo insuficiente\n" + "O valor solicitado: " + valorSolicitado +" eh maior que o saldo: "+ saldo);
        }
    }
}
