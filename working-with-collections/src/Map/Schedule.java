package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class Schedule {
  public static void main(String[] args) {
    Map<Integer, Contact> schedule = new HashMap<>() {
      {
        put(1, new Contact("Simba", 2222));
        put(4, new Contact("Cami", 5555));
        put(3, new Contact("Jon", 1111));
      }
    };

    System.out.println("Usando HashMap: ");
    schedule.forEach((key, value) -> {
      System.out.println(key + " - " + value.getName());
    });

    Map<Integer, Contact> scheduleLinked = new LinkedHashMap<>();
    scheduleLinked.put(1, new Contact("Simba", 2222));
    scheduleLinked.put(4, new Contact("Cami", 5555));
    scheduleLinked.put(3, new Contact("Jon", 1111));

    System.out.println("Usando LinkedHashMap: ");
    scheduleLinked.forEach((key, value) -> {
      System.out.println(key + " - " + value.getName());
    });

    System.out.println("Usando TreeMap: ");
    Map<Integer, Contact> scheduleTreeMap = new TreeMap<>(schedule);
    scheduleTreeMap.forEach((key, value) -> {
      System.out.println(key + " - " + value.getName());
    });

    System.out.println("Utilizando TreeSet - Ordenando pelo telefone: ");
    Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new ComparatorPhoneOrder());
    set.addAll(schedule.entrySet());
    for (Map.Entry<Integer, Contact> entry : set) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + ": " + entry.getValue().getName());
    }

    System.out.println("Utilizando TreeSet - Ordenando pelo nome, telefone: ");
    Set<Map.Entry<Integer, Contact>> set2 = new TreeSet<>(new ComparatorNamePhoneOrder());
    set2.addAll(schedule.entrySet());
    for (Map.Entry<Integer, Contact> entry : set2) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getName() + ": " + entry.getValue().getNumber());
    }
  }

}

class ComparatorPhoneOrder implements Comparator<Map.Entry<Integer, Contact>> {
  @Override
  public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
    return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
  }
}

class ComparatorNamePhoneOrder implements Comparator<Map.Entry<Integer, Contact>> {
  @Override
  public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
    return cont1.getValue().getName().compareToIgnoreCase(cont2.getValue().getName());
  }
}