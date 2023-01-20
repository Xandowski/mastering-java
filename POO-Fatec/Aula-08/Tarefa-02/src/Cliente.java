public class Cliente {
  private String nome;
  private Banco banco;
  private Endereco endereco;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setBanco(Banco banco) {
    this.banco = banco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public Banco getBanco() {
    return banco;
  }

  public Endereco getEndereco() {
    return endereco;
  }
}
