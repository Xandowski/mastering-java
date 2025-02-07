import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Rainbow {
  public static void main(String[] args) {
    Set<String> rainbow = new HashSet<>() {
      {
        add("Vermelho");
        add("Laranja");
        add("Amarelo");
        add("Verde");
        add("Azul");
        add("Anil");
        add("Violeta");
      }
    };

    Set<String> rainbowTree = new TreeSet<>(rainbow);
    Set<String> rainbowLinked = new LinkedHashSet<>(
        Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
    List<String> rainbowList = new ArrayList<>(rainbowLinked);
    Iterator<String> iterator = rainbow.iterator();

    System.out.println("Cores do arco-íris: ");

    for (String color : rainbow) {
      System.out.println(color);
    }

    System.out.println("Quantidade de cores: " + rainbow.size());
    System.out.println("Ordem alfabetica: " + rainbowTree);
    Collections.reverse(rainbowList);
    System.out.println("Ordem inversa: " + rainbowList);

    System.out.println("Cores que começam com 'V': ");

    for (String color : rainbow) {
      if (color.startsWith("V"))
        System.out.println(color);
    }

    System.out.println("Removendo as cores que não começam com a letra 'V': ");

    while (iterator.hasNext()) {
      if (!iterator.next().startsWith("V"))
        iterator.remove();
    }

    System.out.println(rainbow);
    System.out.println("Limpando o set: ");
    rainbow.clear();
    System.out.println("O set está vazio?: " + (rainbow.isEmpty() ? "Sim: " : "Não: ") + rainbow);
  }

}
