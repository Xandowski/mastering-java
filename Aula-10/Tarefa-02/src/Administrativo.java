public class Administrativo extends Funcionario{
  private double salario;

  public double getVencimento(int mes, int ano) {
    private double imposto;
    if (getSalario() < 1000) {
      this.imposto = 0.2*getSalario();
    }
    else if(1000 <= getSalario() <= 5000) {
      this.imposto = 0.3*getSalario();
    }
    else {
      this.imposto = 0.4*getSalario();
    }

    return getSalario()-imposto;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }
}
