package binaryTree.model;

public abstract class TreeObj<T> implements Comparable<T> {
  public abstract boolean equals(Object obj);

  public abstract int hashCode();

  public abstract int compareTo(T other);

  public abstract String toString();
}
