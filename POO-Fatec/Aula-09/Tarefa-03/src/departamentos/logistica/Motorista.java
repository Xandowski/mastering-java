package departamentos.logistica;

import departamentos.rh.Funcionario;

public class Motorista extends Funcionario{
  private long cnh;

  public void setCnh(long cnh) {
    this.cnh = cnh;
  }

  public long getCnh() {
    return cnh;
  }
}
