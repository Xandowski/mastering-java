package linkedList;

public class LinkedList<T> {
  Node<T> inputReference;

  public LinkedList() {
    this.inputReference = null;
  }

  public void add(T content) {
    Node<T> newNode = new Node<>(content);

    if (this.isEmpyt()) {
      inputReference = newNode;
      return;
    }

    Node<T> nodeAux = inputReference;
    for (int i = 0; i < this.size() - 1; i++) {
      nodeAux = nodeAux.getNextNode();
    }

    nodeAux.setNextNode(newNode);
  }

  public T get(int index) {
    return getNode(index).getContent();
  }

  private Node<T> getNode(int index) {
    validateIndex(index);
    Node<T> nodeAux = inputReference;
    Node<T> returnedNode = null;

    for (int i = 0; i <= index; i++) {
      returnedNode = nodeAux;
      nodeAux = nodeAux.getNextNode();
    }
    return returnedNode;
  }

  public T remove(int index) {
    validateIndex(2);
    Node<T> nodeToRemove = this.getNode(index);
    if (index == 0) {
      inputReference = nodeToRemove.getNextNode();
      return nodeToRemove.getContent();
    }

    Node<T> previuosNode = getNode(index - 1);
    previuosNode.setNextNode(nodeToRemove.getNextNode());
    return nodeToRemove.getContent();
  }

  public int size() {
    int listSize = 0;

    Node<T> referenceAux = inputReference;
    while (true) {
      if (referenceAux != null) {
        listSize++;
        if (referenceAux.getNextNode() != null) {
          referenceAux = referenceAux.getNextNode();
        } else {
          break;
        }
      } else {
        break;
      }
    }

    return listSize;
  }

  private void validateIndex(int index) {
    if (index >= size()) {
      throw new IndexOutOfBoundsException("Indice " + index + " é maior do que a lista = " + (size()));
    }
  }

  public boolean isEmpyt() {
    return inputReference == null ? true : false;
  }

  @Override
  public String toString() {
    String returnString = "";
    Node<T> nodeAux = inputReference;

    for (int i = 0; i < this.size(); i++) {
      returnString += "Node [Content=" + nodeAux.getContent() + "]--->";
      nodeAux = nodeAux.getNextNode();
    }

    returnString += "null";
    return returnString;
  }
}
