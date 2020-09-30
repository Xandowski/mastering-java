public class Carro extends Veiculo{
  private double potencia;
  private Motor motor;

  public void setPotencia(double potencia) {
    this.potencia = potencia;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public double getPotencia() {
    return potencia;
  }

  public Motor getMotor() {
    return motor;
  }
}
