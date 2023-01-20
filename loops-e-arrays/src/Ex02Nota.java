import java.util.Scanner;

public class Ex02Nota {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int nota = 0;

    while (true) {
      System.out.println("Digite uma nota de 0 a 10: ");
      nota = scanner.nextInt();
      if (nota > 10 || nota < 0) {
        System.out.println("Digite um valor válido");
      } else {
        break;
      }
    }
  }
}