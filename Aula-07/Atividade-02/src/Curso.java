public class Curso {
  private String nome;
  private double preco;
  private Curso curso;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public Curso getCurso() {
    return curso;
  }
}
