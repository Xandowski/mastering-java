public class Cliente {
  private String nome;
  private Endereco endereco;
  private Loja loja;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public void setLoja(Loja loja) {
    this.loja = loja;
  }

  public String getNome() {
    return nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public Loja getLoja() {
    return loja;
  }
}
