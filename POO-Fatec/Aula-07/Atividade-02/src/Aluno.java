public class Aluno {
  private long ra;
  private String nome;
  private Curso curso;

  public void setRa(long ra) {
    this.ra = ra;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public long getRa() {
    return ra;
  }

  public String getNome() {
    return nome;
  }

  public Curso getCurso() {
    return curso;
  }
}
