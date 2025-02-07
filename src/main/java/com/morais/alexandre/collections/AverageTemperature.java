import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class AverageTemperature {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    List<String> yearMonths = new ArrayList<>(
        Arrays.asList("January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"));
    List<Double> temperatures = new ArrayList<>();
    Iterator<Double> iterator;
    Double sumTemperature = 0d;
    Double medianTemperature = 0d;

    System.out.println("Average Temperature");

    for (int i = 0; i < 6; i++) {
      System.out.print(yearMonths.get(i) + ": ");
      Double temperature = scanner.nextDouble();

      temperatures.add(temperature);
      sumTemperature += temperature;
    }

    iterator = temperatures.iterator();
    medianTemperature = sumTemperature / 6;

    System.out.println("Months that are above the median temperature: " + medianTemperature);
    while (iterator.hasNext()) {
      Double next = iterator.next();
      if (next > medianTemperature) {
        int index = temperatures.indexOf(next);
        System.out.println(yearMonths.get(index));
      }
    }

    scanner.close();
  }
}
