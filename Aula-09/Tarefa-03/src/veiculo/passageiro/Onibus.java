package veiculo.passageiro;

import departamentos.rh.Funcionario;
import veiculo.transporte.Veiculo;

public class Onibus extends Veiculo{
  private int assentos;
  private Funcionario passageiros[];

  public void setAssentos(int assentos) {
    this.assentos = assentos;
  }

  public void setPassageiros(Funcionario[] passageiros) {
    this.passageiros = passageiros;
  }

  public int getAssentos() {
    return assentos;
  }

  public Funcionario getPassageiros() {
    return passageiros;
  }
}
