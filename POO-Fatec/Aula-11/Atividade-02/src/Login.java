public interface Login {
  public final int TIMEOUT = 100;

  public abstract boolean conecta();
  public abstract void desconecta();
}
