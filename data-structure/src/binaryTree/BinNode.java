package binaryTree;

public class BinNode<T extends Comparable<T>> {
  private T content;
  private BinNode<T> leftBinNode;
  private BinNode<T> rightBinNode;

  public BinNode(T content) {
    this.content = content;
    this.leftBinNode = this.rightBinNode = null;
  }

  public BinNode() {
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public BinNode<T> getLeftBinNode() {
    return leftBinNode;
  }

  public void setLeftBinNode(BinNode<T> leftBinNode) {
    this.leftBinNode = leftBinNode;
  }

  public BinNode<T> getRightBinNode() {
    return rightBinNode;
  }

  public void setRightBinNode(BinNode<T> rightBinNode) {
    this.rightBinNode = rightBinNode;
  }

  @Override
  public String toString() {
    return "BinNode [content=" + content + "]";
  }

}