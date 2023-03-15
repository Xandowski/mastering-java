package queue;

public class Queue<T> {
  private Node<T> refNodeInputQueue;

  public Queue() {
    this.refNodeInputQueue = null;
  }

  public boolean isEmpty() {
    return refNodeInputQueue == null ? true : false;
  }

  public T first() {
    if (!this.isEmpty()) {
      Node<T> firstNode = refNodeInputQueue;
      while (true) {
        if (firstNode.getRefNode() != null) {
          firstNode = firstNode.getRefNode();
        } else {
          break;
        }
      }
      return (T) firstNode.getObj();
    }
    return null;
  }

  public T dequeue() {
    if (!this.isEmpty()) {
      Node<T> firstNode = refNodeInputQueue;
      Node<T> nodeAux = refNodeInputQueue;
      while (true) {
        if (firstNode.getRefNode() != null) {
          nodeAux = firstNode;
          firstNode = firstNode.getRefNode();
        } else {
          nodeAux.setRefNode(null);
          break;
        }
      }
      return (T) firstNode.getObj();
    }
    return null;
  }

  public void enqueue(T obj) {
    Node<T> newNode = new Node<>(obj);
    newNode.setRefNode(refNodeInputQueue);
    refNodeInputQueue = newNode;
  }

  @Override
  public String toString() {
    String returnString = "";
    Node<T> nodeAux = refNodeInputQueue;

    if (refNodeInputQueue != null) {
      while (true) {
        returnString += "[No{object=" + nodeAux.getObj() + "}]----->";
        if (nodeAux.getRefNode() != null) {
          nodeAux = nodeAux.getRefNode();
        } else {
          returnString += "null";
          break;
        }
      }
    } else {
      returnString = "null";
    }

    return returnString;
  }
}
