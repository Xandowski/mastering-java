package com.morais.alexandre.dsa.nodechaining;

public class Main {
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("My node 1");
    Node<String> node2 = new Node<>("My node 2");
    node1.setNextNode(node2);
    Node<String> node3 = new Node<>("My node 3");
    node2.setNextNode(node3);

    System.out.println(node1);
    System.out.println(node1.getNextNode());
    System.out.println(node1.getNextNode().getNextNode());
    System.out.println(node1.getNextNode().getNextNode().getNextNode());
  }
}
