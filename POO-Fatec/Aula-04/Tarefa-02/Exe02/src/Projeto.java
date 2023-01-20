public class Projeto {
  private String nome;
  private Teorico teorico;
  private Pratico pratico;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTeorico(Teorico teorico) {
    this.teorico = teorico;
  }

  public void setPratico(String pratico) {
    this.pratico = pratico;
  }

  public String getNome() {
    return nome;
  }

  public Teorico getTeorico() {
    return teorico;
  }

  public Pratico getPratico() {
    return pratico;
  }
}
