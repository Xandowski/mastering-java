public class Capelao extends Bot{
  private String religiao;

  public double calculaVida() {
    return (getSaude()/getForca())*1.10;
  };

  public void setReligiao(String religiao) {
    this.religiao = religiao;
  }

  public String getReligiao() {
    return religiao;
  }
}
