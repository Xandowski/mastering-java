package apresentacao.usuario;

import apresentacao.logica.Validacao;
import negocio.Constante;

public class TelaCliente extends Tela {
  private String titulo;
  private Validacao validacao;
  private Constante constante;

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setValidacao(Validacao validacao) {
    this.validacao = validacao;
  }

  public void setConstante(Constante constante) {
    this.constante = constante;
  }

  public String getTtiulo() {
    return titulo;
  }

  public Validacao getValidacao() {
    return validacao;
  }

  public Constante gConstante() {
    return constante;
  }
}
