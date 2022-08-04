package com.livro.projeto.model;

public class Conta {
  int numero;
  String titular;
  double saldo;

  //verifica se tem saldo o suficiente para realizar a operação 
  public boolean saca(double valor){
    if(this.saldo < valor){
      return false;
    }else{
      this.saldo = this.saldo -valor;
      return true;
    }
  }

  public void deposita(double quantidade){
    this.saldo += quantidade;
  }

  
}
