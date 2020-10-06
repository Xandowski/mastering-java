public class Carro {
  private String placa;
  private Proprietario proprietario;

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void setProprietario(Proprietario proprietario) {
    this.proprietario = proprietario;
  }

  public String getPlaca() {
    return placa;
  }

  public Proprietario gProprietario() {
    return proprietario;
  }
}
