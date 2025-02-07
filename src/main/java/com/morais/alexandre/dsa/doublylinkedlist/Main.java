package com.morais.alexandre.dsa.doublylinkedlist;

public class Main {
  public static void main(String[] args) {
    DoublyLinkedList<String> myDoublyLinkedList = new DoublyLinkedList<>();

    myDoublyLinkedList.add("c1");
    myDoublyLinkedList.add("c2");
    myDoublyLinkedList.add("c3");
    myDoublyLinkedList.add("c4");
    myDoublyLinkedList.add("c5");
    myDoublyLinkedList.add("c6");
    myDoublyLinkedList.add("c7");

    System.out.println(myDoublyLinkedList);

    myDoublyLinkedList.remove(2);
    System.out.println("Removido");
    System.out.println(myDoublyLinkedList);
    System.out.println("Adicionando novamente");
    myDoublyLinkedList.add("c3", 2);
    System.out.println(myDoublyLinkedList);
  }
}
