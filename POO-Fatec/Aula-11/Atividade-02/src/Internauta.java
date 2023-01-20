public abstract class Internauta extends Usuario{
  private String email;
  private String site;

  public Internauta(String email, String site) {
    super(email, site);
    this.email = email;
    this.site = site;
  }

  public abstract void validaSenha();

  public void setEmail(String email) {
    this.email = email;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public String getEmail() {
    return email;
  }

  public String getSite() {
    return site;
  }
}
