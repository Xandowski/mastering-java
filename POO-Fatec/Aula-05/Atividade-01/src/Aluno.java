public class Aluno extends Pessoa{
  private int ciclo;
  private Professor professor;

  public void setCiclo(int ciclo) {
    this.ciclo = ciclo;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public int getCiclo() {
    return ciclo;
  }

  public Professor getProfessor() {
    return professor;
  }
}
