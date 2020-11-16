public class Nota {
  private long numero;
  private double valor;
  private Carga carga;

  public void setNumero(long numero) {
    this.numero = numero;
  }

  public void setCarga(Carga carga) {
    this.carga = carga;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public long getNumero() {
    return numero;
  }

  public double getValor() {
    return valor;
  }

  public Carga getCarga() {
    return carga;
  }
}
