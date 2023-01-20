public class Funcionario {
  private String nome;
  private Terceirizado terceirizado;
  private Contratado contratado;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTerceirizado(Terceirizado terceirizado) {
    this.terceirizado = terceirizado;
  }

  public void setContratado(Contratado contratado) {
    this.contratado = contratado;
  }

  public String getNome() {
    return nome;
  }

  public Terceirizado getTerceirizado() {
    return terceirizado;
  }

  public Contratado getContratado() {
    return contratado;
  }
}