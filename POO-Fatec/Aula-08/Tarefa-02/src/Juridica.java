public class Juridica extends Cliente{
  private String cnpj;
  private Fisica fisica[];

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public void setFisica(Fisica[] fisica) {
    this.fisica = fisica;
  }

  public String getCnpj() {
    return cnpj;
  }

  public Fisica[] getFisica() {
    return fisica;
  }
}
