public class Projeto {
  private String descricao;
  private Avaliacao avaliacao[];

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setAvaliacao(Avaliacao avaliacao) {
    this.avaliacao = avaliacao;
  }

  public String getDescricao() {
    return descricao;
  }

  public Avaliacao[] getAvaliacao() {
    return avaliacao;
  }
}
