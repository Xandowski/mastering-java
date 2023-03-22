package circularList;

public class CircularList<T> {
  private CircularNode<T> head;
  private CircularNode<T> tail;
  private int sizeList;

  public CircularList() {
    this.tail = null;
    this.head = null;
    this.sizeList = 0;
  }

  public void add(T content) {
    CircularNode<T> newNode = new CircularNode<>(content);
    if (this.isEmpty()) {
      this.head = newNode;
      this.tail = this.head;
      this.head.setNextNode(tail);
    } else {
      newNode.setNextNode(this.tail);
      this.head.setNextNode(newNode);
      this.tail = newNode;
    }
    this.sizeList++;
  }

  public void remove(int index) {
    if (index >= this.sizeList)
      throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");

    CircularNode<T> nodeAux = this.tail;
    if (index == 0) {
      this.tail = this.tail.getNextNode();
      this.head.setNextNode(this.tail);
    } else if (index == 1) {
      this.tail.setNextNode(this.tail.getNextNode().getNextNode());
    } else {
      for (int i = 0; i < index - 1; i++) {
        nodeAux = nodeAux.getNextNode();
      }
      nodeAux.setNextNode(nodeAux.getNextNode().getNextNode());
    }
    this.sizeList--;
  }

  public T get(int index) {
    return this.getNode(index).getContent();
  }

  private CircularNode<T> getNode(int index) {
    if (this.isEmpty())
      throw new IndexOutOfBoundsException("A lista está vazia");

    if (index == 0) {
      return this.tail;
    }

    CircularNode<T> nodeAux = tail;

    for (int i = 0; i < index; i++) {
      nodeAux = nodeAux.getNextNode();
    }

    return nodeAux;
  }

  public boolean isEmpty() {
    return this.sizeList == 0 ? true : false;
  }

  public int size() {
    return this.sizeList;
  }

  @Override
  public String toString() {
    String returnString = "";
    CircularNode<T> nodeAux = tail;

    for (int i = 0; i < this.size(); i++) {
      returnString += "CircularNode [Content=" + nodeAux.getContent() + "]--->";
      nodeAux = nodeAux.getNextNode();
    }

    returnString += this.isEmpty() == false ? "Retorna ao início" : "[]";
    return returnString;
  }

}