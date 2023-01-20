public class Diretor extends Funcionario{
  private double totalAcess;
  private double porcentagem;

  public double getVencimento(int mes, int ano) {
    return getTotalAcess()*getPorcentagem();
  }

  public void setTotalAcess(double totalAcess) {
    this.totalAcess = totalAcess;
  }

  public void setPorcentagem(double porcentagem) {
    this.porcentagem = porcentagem;
  }

  public double getTotalAcess() {
    return totalAcess;
  }

  public double getPorcentagem() {
    return porcentagem;
  }
}
