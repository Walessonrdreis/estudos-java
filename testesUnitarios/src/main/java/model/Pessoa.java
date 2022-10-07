package model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Data
public class Pessoa {
    private String nome;
    private LocalDate nascimento;
    private String primeiroNome;
    private String segundoNome;


    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento,LocalDate.now());
    }
    public void setIdade(){
        System.out.println(getIdade() + "Anos de idade");
    }

    public boolean ehMaiorDeIdade() {

        return getIdade() >= 18;
    }
}
