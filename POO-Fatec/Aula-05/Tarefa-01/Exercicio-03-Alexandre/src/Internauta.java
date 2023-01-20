public class Internauta {
  private String nome;
  private Email email;
  private Endereco endereco;
  private Site site;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEmail(Email email) {
    this.email = email;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public String getNome() {
    return nome;
  }

  public Email getEmail() {
    return email;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public Site getSite() {
    return site;
  }
}
