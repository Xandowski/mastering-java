import engine.Soldado;

public class Arma {
  private String nome;
  private double potencia;
  private Soldado soldado;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPotencia(double potencia) {
    this.potencia = potencia;
  }

  public void setSoldado(Soldado soldado) {
    this.soldado = soldado;
  }

  public String getNome() {
    return nome;
  }

  public double getPotencia() {
    return potencia;
  }

  public Soldado getSoldado() {
    return soldado;
  }
}
