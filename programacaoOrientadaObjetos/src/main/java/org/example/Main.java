package org.example;

import org.example.heranca.subclasses.Aluno;
import org.example.heranca.subclasses.Funcionario;
import org.example.heranca.subclasses.Professor;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Aluno primeiroAluno = new Aluno("Walesson", "07248177512", new Date());
        System.out.println("\n\nNome: " + primeiroAluno.nome);
        System.out.println("CPF: " + primeiroAluno.cpf);
        System.out.println("Data de nascimeto: " + primeiroAluno.data_nascimento.toString());

        Funcionario primeroFuncionario = new Funcionario("Walas", "89232165728", new Date());
        System.out.println("Nome: " + primeroFuncionario.nome);
        System.out.println("CPF: " + primeroFuncionario.cpf);
        System.out.println("Data de Nascimento: " + primeroFuncionario.data_nascimento.toString());

        Professor primeiroProfessor = new Professor("walase", "9028456628", new Date(30,11,1996));
        System.out.println("Nome: " + primeiroProfessor.nome+"\nCPF: " + primeiroProfessor.cpf + "\nData: " + primeiroProfessor.data_nascimento);
    }
}