package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 *  Estado PE - População = 9.616.621, Estado AL - População = 3.351.543
 *  Estado CE - População = 9.187.103, Estado RN - População = 3.534.265
 * Crie um dicionário e relacione os estados e suas populações;
 * Substituir a população estado do RN por 3.534.165;
 * Verificar se o estado do PB esta no dicionario, caso não, inserir:
 *  Estado PB - População = 4.039.277
 * Exibir a população do PE
 * Exibir todos os estados e suas populações na ordem que foi informado
 * Exibir os estados e suas populações em ordem alfabética;
 * Exibir o estado com a menor população e sua quantidade;
 * Exibir o estado com a maior população e sua quantidade;
 * Exibir a soma da população desses estados;
 * Exibir a média da população deste dicionário de estados;
 * Remova os estados com a população menor que 4.000.000;
 * Apagar o dicionário e conferir se está vazio.
 */

public class StatePopulation {
  public static void main(String[] args) {
    Map<String, Double> northeasternStates = new HashMap<>() {
      {
        put("PE", 9.616621);
        put("AL", 3.351543);
        put("CE", 9.187103);
        put("RN", 3.534265);
      }
    };
    System.out.println("Dicionario de estados do Nordeste:");
    System.out.println(northeasternStates);

    northeasternStates.replace("RN", 3.534265, 3.534165);
    System.out.println("Alterando valor da população do RN:");
    System.out.println(northeasternStates);

    System.out.println("Verificando se o estado PB existe no dicionário: " + northeasternStates.containsKey("PB"));

    if (!northeasternStates.containsKey("PB")) {
      System.out.println("Inserindo o estado PB: ");
      northeasternStates.put("PB", 4.039277);
      System.out.println(northeasternStates);
    }

    System.out.println("População do PE: " + northeasternStates.get("PE"));

    System.out.println("Exibindo as informações na ordem que foi adicionado:");
    Map<String, Double> northeasternStatesLinked = new LinkedHashMap<>();
    northeasternStatesLinked.put("PE", 9.616621);
    northeasternStatesLinked.put("AL", 3.351543);
    northeasternStatesLinked.put("CE", 9.187103);
    northeasternStatesLinked.put("RN", 3.534265);
    northeasternStatesLinked.put("PB", 4.039277);
    System.out.println(northeasternStatesLinked);

    System.out.println("Eixibindo as informações em ordem alfabética: ");
    Map<String, Double> northeasternStatesTree = new TreeMap<>(northeasternStatesLinked);
    System.out.println(northeasternStatesTree);

    System.out.println("Estado com menor população: ");
    Collection<Double> population = northeasternStatesLinked.values();
    Double smallerPopulation = Collections.min(population);
    Set<Map.Entry<String, Double>> entries = northeasternStatesLinked.entrySet();
    Set<String> stateSmallerPopulation = new HashSet<>();

    System.out.println("População: " + population);
    System.out.println("Menor População: " + smallerPpopulation);

  }
}
