package com.morais.alexandre.collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
  public static void main(String[] args) throws Exception {
    Set<Double> examNotes = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    Iterator<Double> iterator = examNotes.iterator();
    Double sumExamNotes = 0d;
    System.out.println(examNotes);

    System.out.println("A nota 5.0 está no conjunto?: " + (examNotes.contains(5d) ? "Sim" : "Não"));
    System.out.println("Menor nota: " + Collections.min(examNotes));
    System.out.println("Maior nota: " + Collections.max(examNotes));

    while (iterator.hasNext()) {
      Double next = iterator.next();
      sumExamNotes += next;
    }

    System.out.println("Soma das notas: " + sumExamNotes);
    System.out.println("A media das notas: " + (sumExamNotes / examNotes.size()));

    System.out.println("Removendo a nota 0");
    examNotes.remove(0d);

    System.out.println("Removendo notas menores que 7: ");
    Iterator<Double> iterator1 = examNotes.iterator();

    while (iterator1.hasNext()) {
      if (iterator1.next() < 7) {
        iterator1.remove();
      }
    }

    System.out.println(examNotes);

    System.out.println("Exibir as notas na ordem que foram inseridas: ");
    Set<Double> examNotesLinked = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(examNotesLinked);

    System.out.println("Exibir em ordem crescente: ");
    Set<Double> examNotesTree = new TreeSet<>(examNotesLinked);
    System.out.println(examNotesTree);

    System.out.println("Apagar tudo: ");
    examNotes.clear();
    System.out.println(examNotes);
  }
}
