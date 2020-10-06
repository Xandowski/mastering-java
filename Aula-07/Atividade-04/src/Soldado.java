public class Soldado {
  private String nome;
  private Reserva reserva;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setReserva(Reserva reserva) {
    this.reserva = reserva;
  }

  public String getNome() {
    return nome;
  }

  public Reserva getReserva() {
    return reserva;
  }
}
