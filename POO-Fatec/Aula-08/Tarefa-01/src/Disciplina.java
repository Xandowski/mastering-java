public class Disciplina {
  private String descricao;
  private Professor professor;

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public String getDescricao() {
    return descricao;
  }

  public Professor getProfessor() {
    return professor;
  }
}
