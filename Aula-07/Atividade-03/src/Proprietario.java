public class Proprietario {
  private String nome;
  private Proprietario proprietario;
  private Endereco endereco;

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setProprietario(Proprietario proprietario) {
    this.proprietario = proprietario;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public Proprietario getProprietario() {
    return proprietario;
  }

  public Endereco getEndereco() {
    return endereco;
  }


}
