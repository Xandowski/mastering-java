package veiculo.transporte;

import departamentos.logistica.Motorista;

public class Veiculo {
  private String placa;
  private Motorista motorista;

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
  }

  public String getPlaca() {
    return placa;
  }

  public Motorista getMotorista() {
    return motorista;
  }
}
