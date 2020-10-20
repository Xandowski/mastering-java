public class Aluno extends Pessoa{
  private long ra;
  private Curso curso;

  public void setRa(long ra) {
    this.ra = ra;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public long getRa() {
    return ra;
  }

  public Curso getCurso() {
    return curso;
  }
}
