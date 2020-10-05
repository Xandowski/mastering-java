public class Boletim {
  private String disciplina;
  private double notaProva;
  private double notaTrabalho;

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public void setNotaProva(double notaP) {
    this.notaProva = notaP;
  }

  public void setNotaTrabalho(double notaT) {
    this.notaTrabalho = notaT;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public double getNotaProva() {
    return notaProva;
  }

  public double getNotaTrabalho() {
    return notaTrabalho;
  }

  public double getMedia() {
    return (0.7 * this.notaProva) + (0.3 * this.notaTrabalho);
  }
}
