public class Digital extends Equipamento{
  private int ciclo;
  private Analogico analogico;

  public void setCiclo(Analogico ciclo) {
    this.ciclo = ciclo;
  }

  public void setAnalogico(Analogico analogico) {
    this.analogico = analogico;
  }

  public int getCiclo() {
    return ciclo;
  }

  public Analogico getAnalogico() {
    return analogico;
  }
}
