package com.morais.alexandre.collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
    Map<String, Double> northeasternStates = new HashMap<>();
    northeasternStates.put("PE", 9.616621);
    northeasternStates.put("AL", 3.351543);
    northeasternStates.put("CE", 9.187103);
    northeasternStates.put("RN", 3.534265);
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

    Collection<Double> population = northeasternStatesLinked.values();
    Double smallerPopulation = Collections.min(population);
    Set<Map.Entry<String, Double>> entries = northeasternStatesLinked.entrySet();
    Set<String> stateSmallerPopulation = new HashSet<>();

    for (Map.Entry<String, Double> entry : entries) {
      if (entry.getValue().equals(smallerPopulation)) {
        stateSmallerPopulation.add(entry.getKey());
      }
    }

    if (stateSmallerPopulation.size() > 1) {
      System.out.println("Os estados com a menor população são: ");
    } else {
      System.out.println("O estado com a menor população é: ");
    }

    for (String state : stateSmallerPopulation) {
      System.out.println(state);
    }

    Double largestPopulation = Collections.max(population);
    Set<Map.Entry<String, Double>> entries2 = northeasternStatesLinked.entrySet();
    Set<String> stateLargestPopulation = new HashSet<>();

    for (Map.Entry<String, Double> entry : entries2) {
      if (entry.getValue().equals(largestPopulation)) {
        stateLargestPopulation.add(entry.getKey());
      }
    }

    if (stateLargestPopulation.size() > 1) {
      System.out.println("Os estados com a maior população são: ");
    } else {
      System.out.println("O estado com a maior população é: ");
    }

    for (String state : stateLargestPopulation) {
      System.out.println(state);
    }

    Iterator<Double> iterator = population.iterator();
    Double totalPopulation = 0d;

    while (iterator.hasNext()) {
      totalPopulation += iterator.next();
    }

    System.out.println("Soma da população: " + totalPopulation);
    System.out.println("A media da população desses estados: " + (totalPopulation / population.size()));

    System.out.println("Removendo estados com população abaixo de 4.000.000:");
    Iterator<Double> iterator2 = northeasternStates.values().iterator();
    while (iterator2.hasNext()) {
      if (iterator2.next() < 4.000000) {
        iterator2.remove();
      }
    }
    System.out.println(northeasternStates);

    System.out.println("Deletando todos os valores: ");
    northeasternStates.clear();
    System.out.println(northeasternStates);
  }
}
