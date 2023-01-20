public class Cliente extends Pessoa{
  private double saldo;
  private Email email;

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void setEmail(Email email) {
    this.email = email;
  }

  public double getSaldo() {
    return saldo;
  }

  public Email getEmail() {
    return email;
  }
}
