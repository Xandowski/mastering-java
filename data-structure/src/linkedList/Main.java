package linkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> myLinkedList = new LinkedList<>();

    myLinkedList.add("Test 1");
    myLinkedList.add("Test 2");
    myLinkedList.add("Test 3");
    myLinkedList.add("Test 4");

    System.out.println(myLinkedList.get(0));
    System.out.println("Tamanho da lista: " + myLinkedList.size());
    System.out.println(myLinkedList);

    System.out.println(myLinkedList.remove(3) + " removed");
    System.out.println("Tamanho da lista após remoção: " + myLinkedList.size());
  }
}
