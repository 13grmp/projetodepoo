package br.gov.cesarschool.poo.fidelidade.geral.entidade;

public class Endereco{

  private String logradouro,complemento,cep,cidade,estado,pais;
  private int numero;

  public Endereco(String logradouro,String complemento,String cep,String cidade,
  String estado,String pais,int numero){
      
      this.logradouro = logradouro;
      this.complemento = complemento;
      this.cep = cep;
      this.cidade = cidade;
      this.estado = estado;
      this.pais = pais;
      this.numero = numero;
  }
  public Endereco(){
      
  }

  public String getLogradouro() {
      return logradouro;
  }
  public void setLogradouro(String logradouro) {
      this.logradouro = logradouro;
  }
  public String getComplemento() {
      return complemento;
  }
  public void setComplemento(String complemento) {
      this.complemento = complemento;
  }
  public String getCep() {
      return cep;
  }
  public void setCep(String cep) {
      this.cep = cep;
  }
  public String getCidade() {
      return cidade;
  }
  public void setCidade(String cidade) {
      this.cidade = cidade;
  }
  public String getEstado() {
      return estado;
  }
  public void setEstado(String estado) {
      this.estado = estado;
  }
  public String getPais() {
      return pais;
  }
  public void setPais(String pais) {
      this.pais = pais;
  }
  public int getNumero() {
      return numero;
  }
  public void setNumero(int numero) {
      this.numero = numero;
  }
}