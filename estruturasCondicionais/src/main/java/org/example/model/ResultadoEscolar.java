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
        //if ternário
        int nota1 = 7;
        String resultado1 = nota1 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado1);

        int nota2 = 6;
        //if ternário com else if
        String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}
