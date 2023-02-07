package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/*
 * Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
 * Depois, mostre quantas vezes cada valor foi inserido.
 */

public class ThrowDice {
  public static void main(String[] args) {
    Random random = new Random();
    Map<String, Integer> dice = new HashMap<>() {
      {
        put("1", 0);
        put("2", 0);
        put("3", 0);
        put("4", 0);
        put("5", 0);
        put("6", 0);
      }
    };

    for (int i = 0; i < 10; i++) {
      int num = random.nextInt(6) + 1;
      dice.replace(Integer.toString(num), dice.get(Integer.toString(num)) + 1);
    }

    Iterator<Integer> iterator = dice.values().iterator();
    for (int i = 0; iterator.hasNext(); i++) {
      System.out
          .println("O numero " + (i + 1) + " caiu: " + iterator.next() + "x");

    }
  }
}
