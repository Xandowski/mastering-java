public class Soldado extends Bot{
  private String tropa;

  public double calculaVida() {
    return (1/getSaude()+1/getForca())*12
  };

  public void setTropa(String tropa) {
    this.tropa = tropa;
  }

  public String getTropa() {
    return tropa;
  }
}
