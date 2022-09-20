package model;



import java.time.LocalDate;

public class Pessoa {
    private String nome = "joaozinho";
    private LocalDate dataNascimento = LocalDate.of(2004,1,1);
    private int idade = 19;


    public Pessoa(String nome, LocalDate of) {

    }

    public boolean ehMaiorDeIdade() {

        return idade >= 18;
    }
}
