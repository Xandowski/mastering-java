package engine;
import recursos.Arma;

public class Soldado extends Bot{
  private String tropa;
  private Arma armas[];

  public void setTropa(String tropa) {
    this.tropa = tropa;
  }

  public void setArmas(Arma[] armas) {
    this.armas = armas;
  }  

  public String getTropa() {
    return tropa;
  }

  public Arma[] getArmas() {
    return armas;
  }
}
