package org.example.model;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        if (nota >= 7) {
            System.out.println("Aluno Aprovado");
        }else if (nota >= 5 &&  nota < 7){
            System.out.println("Recuperação");
            } else{
            System.out.println("Aluno Reprovado");
        }
    }
}
