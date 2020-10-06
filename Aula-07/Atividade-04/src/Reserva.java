public class Reserva extends Soldado{
  private String nome;
  private double preco;
  private Reserva reserva;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(String preco) {
    this.preco = preco;
  }

  public void setReserva(Reserva reserva) {
    this.reserva = reserva;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public Reserva getReserva() {
    return reserva;
  }
}
