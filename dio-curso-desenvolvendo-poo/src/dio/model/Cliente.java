package dio.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

  private List<Endereco> enderecos;// quando é declarado publico não passa pelo tratamento de erros

  public void adicionaEndereco(Endereco endereco){
    if(endereco == null){
      throw new NullPointerException("Endereço não pode ser nulo");
    }
    if(endereco.cep == null){
      throw new NullPointerException("Cep não pode ser nulo");
    }
    getEnderecos().add(endereco);

  }

 /*  public void setEnderecos(List<Endereco> enderecos) {
    this.enderecos = enderecos;
  }  */

  private List<Endereco> getEnderecos() {
    if(enderecos == null){
      enderecos = new ArrayList<Endereco>();
    }
    return enderecos;
  }
  
}
