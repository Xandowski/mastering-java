public class Veiculo {
  private String placa;
  private Multa multa[];

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void setMulta(Multa[] multa) {
    this.multa = multa;
  }

  public String getPlaca() {
    return placa;
  }

  public Multa[] getMulta() {
    return multa;
  }
}
