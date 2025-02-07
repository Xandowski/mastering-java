package com.morais.alexandre.dsa.doublylinkedlist;

public class DoublyLinkedList<T> {
  private DoubleNode<T> firstNode;
  private DoubleNode<T> lastNode;
  private int size;

  public DoublyLinkedList() {
    this.firstNode = null;
    this.lastNode = null;
    this.size = 0;
  }

  public void add(T element) {
    DoubleNode<T> newNode = new DoubleNode<T>(element);
    newNode.setNextDoubleNode(null);
    newNode.setPreviusDoubleNode(lastNode);
    if (firstNode == null) {
      firstNode = newNode;
    }
    if (lastNode != null) {
      lastNode.setNextDoubleNode(newNode);
    }
    lastNode = newNode;
    size++;
  }

  public void add(T element, int index) {
    DoubleNode<T> nodeAux = getNode(index);
    DoubleNode<T> newNode = new DoubleNode<T>(element);
    newNode.setNextDoubleNode(nodeAux);

    if (newNode.getNextDoubleNode() != null) {
      newNode.setPreviusDoubleNode(nodeAux.getPreviusDoubleNode());
      newNode.getNextDoubleNode().setPreviusDoubleNode(newNode);
    } else {
      newNode.setPreviusDoubleNode(lastNode);
      lastNode = newNode;
    }

    if (index == 0) {
      firstNode = newNode;
    } else {
      newNode.getPreviusDoubleNode().setNextDoubleNode(newNode);
    }

    size++;
  }

  public void remove(int index) {
    if (index == 0) {
      firstNode = firstNode.getNextDoubleNode();
      if (firstNode != null) {
        firstNode.setPreviusDoubleNode(null);
      }
    } else {
      DoubleNode<T> nodeAux = getNode(index);
      nodeAux.getPreviusDoubleNode().setNextDoubleNode(nodeAux.getNextDoubleNode());
      if (nodeAux != lastNode) {
        nodeAux.getNextDoubleNode().setPreviusDoubleNode(nodeAux.getPreviusDoubleNode());
      } else {
        lastNode = nodeAux;
      }
    }

    this.size--;
  }

  private T get(int index) {
    return this.getNode(index).getContent();
  }

  private DoubleNode<T> getNode(int index) {
    DoubleNode<T> nodeAux = firstNode;
    for (int i = 0; (i < index) && (nodeAux != null); i++) {
      nodeAux = nodeAux.getNextDoubleNode();
    }
    return nodeAux;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public String toString() {
    String returnString = "";
    DoubleNode<T> nodeAux = firstNode;

    for (int i = 0; i < size; i++) {
      returnString += "[Node{Content=" + nodeAux.getContent() + "}]--->";
      nodeAux = nodeAux.getNextDoubleNode();
    }

    returnString += "null";
    return returnString;
  }

}
