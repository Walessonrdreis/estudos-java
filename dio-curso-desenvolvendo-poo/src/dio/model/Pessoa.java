package dio.model;

public class Pessoa {

  private static final int TAMANHO_CPF = 11;
  private static final int TAMANHO_CNPJ = 14;
  public enum TipoPessoa {
    FISICA,
    JURIDICA
    }
  
  public Integer codigo;
  public String nome;
  private String documento;
  public TipoPessoa tipo;

  public void setDocumento(String documento) {

    if(documento ==null || documento.isEmpty()){
      throw new RuntimeException("Documento não pode ser nulo ou vazio");
    }
    //validando qual tipo de pessoa através do tamanho dos números digitados
    if(documento.length() == TAMANHO_CPF){
      setDocumento(documento, tipo = TipoPessoa.FISICA);
    } else if(documento.length() == TAMANHO_CNPJ){
      setDocumento(documento, tipo = TipoPessoa.JURIDICA);
    } else {
      throw new RuntimeException("Documento inválido para pessoa física ou jurídica ");
    }


    this.documento = documento;
  }
  private void setDocumento(String documento, TipoPessoa tipo){
    this.documento = documento;
    this.tipo = tipo;

  }
  public String getDocumento() {
    return documento;
  }
  
    public TipoPessoa getTipo() {
      return tipo;
    }
}
