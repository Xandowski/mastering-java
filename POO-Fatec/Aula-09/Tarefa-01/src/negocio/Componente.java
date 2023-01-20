package negocio;

import apresentacao.usuario.TelaCliente;

public class Componente {
  private String nome;
  private Componente subComponente;
  private TelaCliente telaCliente[];

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSubComponente(Componente subComponente) {
    this.subComponente = subComponente;
  }

  public void setTelaCliente(TelaCliente[] telaCliente) {
    this.telaCliente = telaCliente;
  }

  public String getNome() {
    return nome;
  }

  public Componente getSubComponente() {
    return subComponente;
  }

  public TelaCliente[] gTelaCliente() {
    return telaCliente;
  }
}
