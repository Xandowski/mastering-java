# Java 8 questions

1. What is the purpose of the "Optional" class in Java 8, and how is it used?

Let's say we have a class Person which has a name and an age, and we want to find the age of a person given their name. We can use the Optional class to handle the case where the person with the given name does not exist in our list of people.

```java
//creating the Person class. Person.java:
public class Person {
 String name;
 int age;

 public Person(String name, int age) {
   this.name = name;
   this.age = age;
 }

 public String getName() {
   return name;
 }

 public int getAge() {
   return age;
 }
}

//And in the App.java:
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
   public static void main(String[] args) {
       List<Person> people = new ArrayList<>();
       people.add(new Person("Mariana", 31));
       people.add(new Person("Alexandre", 28));
       people.add(new Person("Bob", 30));

       String name = "David";
       Optional<Person> personOptional = people.stream()
               .filter(p -> p.getName().equals(name))
               .findFirst();

       personOptional.ifPresent(
               person -> System.out.println(name + " is " + person.getAge() + " years old"));
       if (!personOptional.isPresent()) {
           System.out.println("No person with the name " + name + " exists");
       }

   }
}


```
