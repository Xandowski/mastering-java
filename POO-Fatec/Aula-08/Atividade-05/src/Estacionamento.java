public class Estacionamento {
  private String nome;
  private Veiculo veiculo[];
  private Endereco endereco;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setVeiculo(Veiculo[] veiculo) {
    this.veiculo = veiculo;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public Veiculo[] getVeiculo() {
    return veiculo;
  }

  public Endereco getEndereco() {
    return endereco;
  }
}
