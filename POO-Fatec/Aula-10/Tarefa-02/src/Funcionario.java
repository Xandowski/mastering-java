public abstract class Funcionario {
  private String nome;
  private String ctps;
  private String nascimento;

  public abstract double getVencimento(int mes, int ano);

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCtps(String ctps) {
    this.ctps = ctps;
  }

  public void setNascimento(String nascimento) {
    this.nascimento = nascimento;
  }

  public String getNome() {
    return nome;
  }

  public String getCtps() {
    return ctps;
  }

  public String getNascimento() {
    return nascimento;
  }
}
