package estoque;

public class Item {
  private long codigo;
  private String nome;
  private double valor;

  public void setCodigo(long codigo){
    this.codigo = codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public long getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getValor() {
    return valor;
  }
}
