import system.Move;

public abstract interface Engine extends Move{
  public char power;

  public abstract void run();
}
