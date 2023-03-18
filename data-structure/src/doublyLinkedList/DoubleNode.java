package doublyLinkedList;

public class DoubleNode<T> {
  private T content;
  private DoubleNode<T> previusDoubleNode;
  private DoubleNode<T> nextDoubleNode;

  public DoubleNode(T content) {
    this.content = content;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public DoubleNode<T> getPreviusDoubleNode() {
    return previusDoubleNode;
  }

  public void setPreviusDoubleNode(DoubleNode<T> previusDoubleNode) {
    this.previusDoubleNode = previusDoubleNode;
  }

  public DoubleNode<T> getNextDoubleNode() {
    return nextDoubleNode;
  }

  public void setNextDoubleNode(DoubleNode<T> nextDoubleNode) {
    this.nextDoubleNode = nextDoubleNode;
  }

  @Override
  public String toString() {
    return "DoubleNode [Content=" + content + "]";
  }
}
