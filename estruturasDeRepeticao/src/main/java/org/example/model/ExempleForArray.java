package org.example.model;

public class ExempleForArray {

    public static void main(String[] args) {
        String alunos [] = {"FElIPE", "JOÃO", "MARIA", "JOAQUIM"};
        //FOR Normal:
        for (int x = 0; x < alunos.length; x++){

            System.out.println("O aluno no indice x: "+ x + " eh " + alunos[x]);
        }
    }
}
