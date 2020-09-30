public class Funcionario {
  private String nome;
  private double salario;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }

  public double getSalarioDo() {
    String s = "Salario do funcionário: ";
    s += this.getSalario();
    return s ;
  }
}
