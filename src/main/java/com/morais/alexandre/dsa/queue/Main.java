package com.morais.alexandre.dsa.queue;

public class Main {
  public static void main(String[] args) {
    Queue<String> myQueue = new Queue<>();

    myQueue.enqueue(("Primeiro"));
    myQueue.enqueue(("Segundo"));
    myQueue.enqueue(("Terceiro"));
    myQueue.enqueue(("Quarto"));

    System.out.println(myQueue);
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue);
    System.out.println(myQueue.first());
  }
}
