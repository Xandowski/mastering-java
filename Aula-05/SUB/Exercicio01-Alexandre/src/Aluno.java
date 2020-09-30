public class Aluno {
  private String nome;
  private Email email;
  private Curso curso;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEmail(Email email) {
    this.email = email;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public String getNome() {
    return nome;
  }

  public Email getEmail() {
    return email;
  }

  public Curso getCurso() {
    return curso;
  }
}
