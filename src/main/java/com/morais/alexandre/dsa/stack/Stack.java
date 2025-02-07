package com.morais.alexandre.dsa.stack;

public class Stack {
  private Node refNodeInputStack;

  public Stack() {
    this.refNodeInputStack = null;
  }

  public boolean isEmpty() {
    return refNodeInputStack == null ? true : false;
  }

  public Node top() {
    return refNodeInputStack;
  }

  public Node pop() {
    if (!this.isEmpty()) {
      Node poppedNode = refNodeInputStack;
      refNodeInputStack = refNodeInputStack.getRefNode();
    }
    return null;
  }

  public void push(Node newnode) {
    Node refAux = refNodeInputStack;
    this.refNodeInputStack = newnode;
    refNodeInputStack.setRefNode(refAux);
  }

  @Override
  public String toString() {
    String returnString = "----------------\n";
    returnString += "     Stack     \n";
    returnString += "----------------\n";

    Node nodeAux = refNodeInputStack;

    while (true) {
      if (nodeAux != null) {
        returnString += "[Node{data=" + nodeAux.getData() + "}]\n";
        nodeAux = nodeAux.getRefNode();
      } else {
        break;
      }
    }

    returnString += "================\n";
    return returnString;
  }
}
