package logistica;

import estoque.Item;
import logistica.frota.Caminhao;

public class Entrega {
  private long numero;
  private double valor;
  private Item item[];
  private Caminhao caminhao;

  public void setNumero(long numero) {
    this.numero = numero;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void setItem(Item[] item) {
    this.item = item;
  }

  public void setCaminhao(Caminhao caminhao) {
    this.caminhao = caminhao;
  }

  public long getNumero() {
    return numero;
  }

  public double getValor() {
    return valor;
  }

  public Item[] getItem() {
    return item;
  }

  public Caminhao getCaminhao() {
    return caminhao;
  }
}
