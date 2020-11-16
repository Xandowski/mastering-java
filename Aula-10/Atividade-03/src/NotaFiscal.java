public class NotaFiscal extends Documento{
  private String serie;
  private double desconto;
  
  public double calculaTotal() {
    return getTotal() - desconto;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public void setDesconto(double desconto) {
    this.desconto = desconto;
  }

  public String getSerie() {
    return serie;
  }

  public double getDesconto() {
    return desconto;
  }

}
