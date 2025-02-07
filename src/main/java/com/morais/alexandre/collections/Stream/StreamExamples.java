package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExamples {
  public static void main(String[] args) {
    List<String> randomNumbers = Arrays.asList("1", "20", "6", "15", "98", "10", "2", "57", "15", "1");

    // Imprimindo todos os elementos
    System.out.println("Imprimindo todos os elementos: ");
    randomNumbers.forEach(System.out::println);

    // Pegar os 5 primeiros elementos e colocar dentor de um Set
    System.out.println("Imprimindo apenas os 5 primeiros elementos: ");
    randomNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

    // Transformar a lista de String para int
    System.out.println("Transformando a lista em inteiros: ");
    randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);

    // Retornar uma lista com numeros pares e maiores que 2
    System.out.println("Lista com numeros pares maiores que 2");
    randomNumbers.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList())
        .forEach(System.out::println);

    // Mostrar a média dos numeros
    System.out.println("Média");
    List<Integer> randomNumbersInt = randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());
    randomNumbers.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

    // Remova os valores ímpares
    System.out.println("Sem os numeros impares");
    randomNumbersInt.removeIf(integer -> integer % 2 != 0);
    System.out.println(randomNumbersInt);

    // Imprimir a lista ignorando os 3 primeiros numeros
    System.out.println("Ignorando os 3 primeiros numeros: ");
    randomNumbers.stream().skip(3).collect(Collectors.toSet()).forEach(System.out::println);

    // Mostrar o tamanho da lista removendo os numeros repetidos
    System.out.println("Tamanho da lista sem os numeros repetidos: ");
    Set<Integer> randomNumbersSet = randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toSet());
    System.out.println(randomNumbersSet.size());

    // Mostrar o menor valor:
    System.out.println("Menor valor: ");
    int min = randomNumbersInt.stream().min(Integer::compare).get();
    System.out.println(min);

    // Mostrar o maior valor:
    System.out.println("Maior valor: ");
    int max = randomNumbersInt.stream().max(Integer::compare).get();
    System.out.println(max);

    // Somar os valores ímpares
    System.out.println("Soma dos valores ímpares: ");
    int sum = randomNumbers.stream().mapToInt(Integer::parseInt).filter(i -> i % 2 != 0).sum();
    System.out.println(sum);

    // Mostrar a lista na ordem númerica
    System.out.println("Ordem numerica: ");
    List<Integer> randomNumbersOrdened = randomNumbersInt.stream().sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println(randomNumbersOrdened);

    // Mostrar os numeros multiplos de 2 e 4
    Map<Boolean, List<Integer>> collectNumbersMultiplesOf3And5 = randomNumbersInt.stream()
        .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
    System.out.println(collectNumbersMultiplesOf3And5);
  }
}
