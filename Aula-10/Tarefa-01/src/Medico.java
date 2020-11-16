import recursos.Remedio;

public class Medico extends Bot{
  private String companhia;
  private Remedio remedio;

  public double calculaVida() {
    return getSaude()*getForca()*0.12;
  };

  public void setCompanhia(String companhia) {
    this.companhia = companhia;
  }

  public void setRemedio(Remedio remedio) {
    this.remedio = remedio;
  }

  public String getCompanhia() {
    return companhia;
  }

  public Remedio getRemedio() {
    return remedio;
  }
}
