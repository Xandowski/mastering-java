package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
  public static void main(String[] args) {
    Map<String, Double> cars = new HashMap<>() {
      {
        // chaves tem valores unicos
        put("gol", 14.4);
        put("golf", 15.6);
        put("civic", 16.1);
        put("hb20", 14.2);
        put("hrv", 16.1);
        put("bmw", 11.3);
      }
    };
    // A ordem mostrada não é a mesma da inserida, por se tratar de um HashMap
    System.out.println(cars);

    /*
     * Para sobrescrever o valor da chave "gol", basta usar o put, como a chave
     * ja existe so ira alterar o valor:
     */
    cars.put("gol", 14.9);
    System.out.println("Trocando o consumo do gol para 14.9:");
    System.out.println(cars);

    // Verificar se determinada chave existe:
    System.out.println("O modelo tucson esta no dicionário?: " + cars.containsKey("tucson"));

    // Mostrar o valor de uma chave:
    System.out.println("O consumo do golf é de: " + cars.get("golf"));

    // Pegar as chaves:
    Set<String> carsModels = cars.keySet();
    System.out.println(carsModels);

    // Pegando apenas os valores das chaves:
    Collection<Double> carsConsumption = cars.values();
    System.out.println(carsConsumption);

    // Mais economico:
    Double efficientConsumption = Collections.max(carsConsumption);
    Set<Map.Entry<String, Double>> entries = cars.entrySet();
    Set<String> efficientConsumptionModels = new HashSet<>();

    for (Map.Entry<String, Double> entry : entries) {
      if (entry.getValue().equals(efficientConsumption)) {
        efficientConsumptionModels.add(entry.getKey());
      }
    }

    if (efficientConsumptionModels.size() > 1) {
      System.out.println("Os carros com os menores consumos são: ");
    } else {
      System.out.println("O carro com menor consumo é: ");
    }

    for (String carModel : efficientConsumptionModels) {
      System.out.println(carModel);
    }

    // Soma dos consumos:
    Iterator<Double> iterator = carsConsumption.iterator();
    Double sum = 0d;

    while (iterator.hasNext()) {
      sum += iterator.next();
    }

    System.out.println("Soma dos consumos: " + sum);
    System.out.println("A media de consumo é de " + (sum / carsConsumption.size()));

    // remover os modelos com consumo igual a 11.3:
    Iterator<Double> iterator2 = cars.values().iterator();
    while (iterator2.hasNext()) {
      if (iterator2.next().equals(11.3))
        iterator2.remove();
    }

    System.out.println("Removido carro com consumo igual a 11.1:");
    System.out.println(cars);

    // ordem de isnerção
    Map<String, Double> carsInsertOrdened = new LinkedHashMap<>();
    carsInsertOrdened.put("Cruze", 13.2);
    carsInsertOrdened.put("Vectra", 10.2);
    carsInsertOrdened.put("Megane", 11.7);

    System.out.println("Listando por ordem de inserção");
    System.out.println(carsInsertOrdened);

    // ordenar pelo modelo
    Map<String, Double> carsTreeMap = new TreeMap<>(cars);
    System.out.println(carsTreeMap);

    cars.clear();
    System.out.println(cars);
  }

}
