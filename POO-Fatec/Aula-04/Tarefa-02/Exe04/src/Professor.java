public class Professor extends Funcionario{
  public double getSalarioDo() {
    String s = "Salario do professor: ";
    s += this.getSalario();
    return s;
  }
}
