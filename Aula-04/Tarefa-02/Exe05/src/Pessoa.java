public class Pessoa {
  private String nome;
  private Data data;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setData(Data data) {
      this.data = data;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade(int anoAtual) {
    return anoAtual - data.getAno();
  }
}
