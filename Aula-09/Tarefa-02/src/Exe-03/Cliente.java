import java.util.ArrayList;

public class Cliente {
  private String nome;
  private ArrayList<Pedido> agenda = new ArrayList<Pedido>();

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAgenda(Pedido agenda) {
    this.agenda.add(agenda);
  }

  public String getNome() {
    return nome;
  }

  public Pedido getAgenda() {
    return pedido;
  }
}
