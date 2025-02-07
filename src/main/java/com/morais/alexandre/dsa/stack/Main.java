package com.morais.alexandre.dsa.stack;

public class Main {
  public static void main(String[] args) {
    Stack myStack = new Stack();
    myStack.push(new Node(1));
    myStack.push(new Node(2));
    myStack.push(new Node(3));
    myStack.push(new Node(4));
    myStack.push(new Node(5));
    myStack.push(new Node(6));

    System.out.println(myStack);

    myStack.pop();

    System.out.println("Removendo o ultimo elemento:");
    System.out.println(myStack);

    System.out.println("The stack is" + (myStack.isEmpty() == false ? " not " : " ") + "empty.");

  }
}
