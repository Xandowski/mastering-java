package com.morais.alexandre.collections.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

import com.morais.alexandre.collections.map.Contact;

public class ScheduleRefactor {
  public static void main(String[] args) {
    Map<Integer, Contact> schedule = new HashMap<>();
    schedule.put(1, new Contact("Simba", 2222));
    schedule.put(4, new Contact("Cami", 5555));
    schedule.put(3, new Contact("Jon", 1111));

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

    // Refatorando utilizando classe anonima
    System.out.println("Utilizando TreeSet - Ordenando pelo telefone: ");
    Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
      @Override
      public int compare(Entry<Integer, Contact> cont1, Entry<Integer, Contact> cont2) {
        return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
      }
    });
    set.addAll(schedule.entrySet());
    for (Map.Entry<Integer, Contact> entry : set) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + ": " + entry.getValue().getName());
    }

    System.out.println("Utilizando TreeSet - Ordenando pelo nome, telefone: ");
    Set<Map.Entry<Integer, Contact>> set2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
      public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return cont1.getValue().getName().compareToIgnoreCase(cont2.getValue().getName());
      }
    });
    set2.addAll(schedule.entrySet());
    for (Map.Entry<Integer, Contact> entry : set2) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getName() + ": " + entry.getValue().getNumber());
    }

    // Utilizando o método estatic comparing() do Comparator
    System.out.println("Utilizando TreeSet com comparing - Ordenando pelo telefone:");
    Set<Map.Entry<Integer, Contact>> setWithComparing = new TreeSet<>(
        Comparator.comparing(new Function<Map.Entry<Integer, Contact>, Integer>() {
          @Override
          public Integer apply(Map.Entry<Integer, Contact> contact) {
            return contact.getValue().getNumber();
          }
        }));

    setWithComparing.addAll(schedule.entrySet());
    for (Map.Entry<Integer, Contact> entry : set) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + ": " + entry.getValue().getName());
    }

    // Utilizando lambda
    System.out.println("Utilizando TreeSet com Lambda - Ordenando pelo telefone:");
    Set<Map.Entry<Integer, Contact>> setWithLambda = new TreeSet<>(
        Comparator.comparing(contact -> contact.getValue().getName()));

    setWithComparing.addAll(schedule.entrySet());
    for (Map.Entry<Integer, Contact> entry : set) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + ": " + entry.getValue().getName());
    }
  }
}
