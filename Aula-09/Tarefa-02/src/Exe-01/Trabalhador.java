public class Trabalhador {
  private String nome;
  private Departamento departamento;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }
    
  public String getNome() {
    return nome;
  }

  public Departamento getDepartamento() {
    return departamento;
  }
}