public class Endereco {
  private String rua;
  private int numero;
  private Cidade cidade;

  public void setRua(String rua) {
    this.rua = rua;
  }

  public void setCidade(Cidade cidade) {
    this.cidade = cidade;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getRua() {
    return rua;
  }

  public int getNumero() {
    return numero;
  }

  public Cidade getCidade() {
    return cidade;
  }

}
