public class Curso {
  private String nome;
  private Disciplina disciplina[];

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDisciplina(Disciplina[] disciplina) {
    this.disciplina = disciplina;
  }

  public String getNome() {
    return nome;
  }

  public Disciplina[] getDisciplina() {
    return disciplina;
  }
}
