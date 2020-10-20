public class Funcionario extends Pessoa{
  private String departamento;
  private Funcionario funcionario;

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

  public String getDepartamento() {
    return departamento;
  }

  public Funcionario getFuncionario() {
    return funcionario;
  }
}
