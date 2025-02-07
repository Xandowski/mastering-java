package com.morais.alexandre.dsa.linkedlist;

public class Node<T> {
  private T content;
  private Node<T> nextNode;

  public Node() {
    this.nextNode = null;
  }

  public Node(T content) {
    this.nextNode = null;
    this.content = content;
  }

  public Node(T content, Node<T> nextNode) {
    this.nextNode = nextNode;
    this.content = content;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public Node<T> getNextNode() {
    return nextNode;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return "Node [Content=" + content + "]";
  }

  public String linkedToString() {
    String str = "Node [Content=" + content + "]";

    if (nextNode != null) {
      str += "->" + nextNode.toString();
    } else {
      str += "->null";
    }

    return str;
  }
}
