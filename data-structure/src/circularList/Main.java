package circularList;

class Main {
  public static void main(String[] Args) {
    CircularList<String> myCircularList = new CircularList<>();

    myCircularList.add("C0");
    System.out.println(myCircularList);
    myCircularList.remove(0);
    System.out.println(myCircularList);

    myCircularList.add("C1");
    myCircularList.add("C2");
    myCircularList.add("C3");
    myCircularList.add("C4");
    System.out.println(myCircularList);

    System.out.println(myCircularList.get(0));
  }
}