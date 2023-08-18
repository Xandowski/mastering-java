import java.util.InputMismatchException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parametro: ");
            int firstParameter = scanner.nextInt();

            System.out.println("Digite o segundo parametro: ");
            int secondParameter = scanner.nextInt();

            handleCount(firstParameter, secondParameter);
        }catch (InputMismatchException e){
            System.out.println("\nDigite somente números inteiros");
        }catch (InvalidParameterException e){
            System.out.println("\nO segundo parametro deve ser maior que o primeiro");
        }

        scanner.close();
    }
    static void handleCount(int firstParameter, int secondParameter ) throws InvalidParameterException {
        if(firstParameter > secondParameter){
            throw new InvalidParameterException();
        }

        int count = secondParameter - firstParameter;

        for (int i = 1; i <= count; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}