public class Gamer extends Internauta{
  private String nick;
  private long pontuacao;

  public Gamer(String nick, long pontuacao) {
    super(nick, nick);
    this.nick = nick;
    this.pontuacao = pontuacao;
  }

  public void validaSenha() {

  };

  public boolean conecta() {
    return false;
  };

  public void desconecta() {

  };

  public void comprime() {

  };

  public void descomprime() {

  };

  public void setNick(String nick) {
    this.nick = nick;
  }

  public void setSite(long pontuacao) {
    this.pontuacao = pontuacao;
  }

  public String getNick() {
    return nick;
  }

  public long getPontuacao() {
    return pontuacao;
  }

  public boolean criptografa() {
    return false;
  }
}
