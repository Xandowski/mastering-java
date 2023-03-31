package com.alexandre;

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
