public abstract class Bot {
  private String nome;
  private int saude;
  private double forca;

  public abstract double calculaVida();

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSaude(int saude) {
    this.saude = saude;
  }

  public void setForca(double forca) {
    this.forca = forca;
  }

  public String getNome() {
    return nome;
  }

  public int getSaude() {
    return saude;
  }

  public double getForca() {
    return forca;
  }
}
