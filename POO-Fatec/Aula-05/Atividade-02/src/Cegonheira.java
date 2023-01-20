public class Cegonheira extends Veiculo {
  private int tara;
  private Carro carro;
  private Motor motor;

  public void setTara(int tara) {
    this.tara = tara;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  public int getTara() {
    return tara;
  }

  public Carro getCarro() {
    return carro;
  }

  public Motor getMotor() {
    return motor;
  }
}
