import java.util.ArrayList;

public interface Observer {
  ArrayList<Object> receive();
  void send(Object o);
}
