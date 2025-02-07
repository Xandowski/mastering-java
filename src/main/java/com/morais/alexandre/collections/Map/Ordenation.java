package com.morais.alexandre.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ordenation {
  public static void main(String[] args) {
    System.out.println("Ordem aleátoria.");
    Map<String, Book> myBooks = new HashMap<>();
    myBooks.put("Pushkin Press", new Book("Robert W. Chambers", "The king in yellow", 316));
    myBooks.put("Alma Books", new Book("F Scott Fitzgerald", "The Great Gatsby", 256));
    myBooks.put("Orbit", new Book("Andrzej Sapkowski", "The Last Wish: Introducing the Witcher", 384));

    myBooks.forEach((key, value) -> {
      System.out.println("Publishing : " + key + " - " + value.toString());
    });

    System.out.println("--  Ordem de inserção.  --");

    Map<String, Book> myBooksLinkedMap = new LinkedHashMap<>();
    myBooksLinkedMap.put("Pushkin Press", new Book("Robert W. Chambers", "The king in yellow", 316));
    myBooksLinkedMap.put("Alma Books", new Book("F Scott Fitzgerald", "The Great Gatsby", 256));
    myBooksLinkedMap.put("Orbit", new Book("Andrzej Sapkowski", "The Last Wish: Introducing the Witcher", 384));


    myBooksLinkedMap.forEach((key, value) -> {
      System.out.println("Publishing : " + key + " - " + value.toString());
    });

    System.out.println("--  Ordem Alfabética.  --");

    Map<String, Book> myBooksTreeMap = new TreeMap<>(myBooksLinkedMap);

    myBooksTreeMap.forEach((key, value) -> {
      System.out.println("Publishing : " + key + " - " + value.toString());
    });

    System.out.println("--  Ordem Alfabética (Nome dos Livros).  --");

    Set<Map.Entry<String, Book>> myBooksTreeSet = new TreeSet<>(new BookNameComparator());
    myBooksTreeSet.addAll(myBooks.entrySet());

    for (Map.Entry<String, Book> book : myBooksTreeSet) {
      System.out.println(book.getKey() + " - " + book.getValue().getBookName());
    }

    System.out.println("--  Ordem pelo numero de paginas --");

  }
}
