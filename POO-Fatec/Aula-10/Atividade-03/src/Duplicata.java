public class Duplicata extends Documento{
  private String vencimento;
  private double juros;

  public double calculaTotal() {
    return getTotal() + juros;
  }

  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  public void setJuros(double juros) {
    this.juros = juros;
  }

  public String getVencimento() {
    return vencimento;
  }

  public double getJuros() {
    return juros;
  }
}
