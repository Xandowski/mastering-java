public class Vendedor extends Funcionario{
  private double comissao;
  private double totalVendas;

  public double getVencimento(int mes, int ano) {
    return getComissao()*getTotalVendas();
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public void setTotalVendas(double totalVendas) {
    this.totalVendas = totalVendas;
  }

  public double getComissao() {
    return comissao;
  }

  public double getTotalVendas() {
    return totalVendas;
  }
}
