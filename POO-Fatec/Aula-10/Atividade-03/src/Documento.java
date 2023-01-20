public abstract class Documento {
  private String numero;
  private double total;

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public String getNumero() {
    return numero;
  }

  public double getTotal() {
    return total;
  }
  
  public abstract double calculaTotal();
}