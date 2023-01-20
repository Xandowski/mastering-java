import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CrimeScene {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    List<String> questions = new ArrayList<>(Arrays.asList(
        "Did you call to the victim?",
        "Have you been in the crime scene?",
        "Do you live near the victim?",
        "Did you owe the victim money?",
        "Have you worked with the victim?"));
    Iterator<String> iterator = questions.iterator();
    int positiveAnswers = 0;

    while (iterator.hasNext()) {
      String next = iterator.next();
      System.out.println(next);
      System.out.print("R: ");
      char answer = scanner.next().charAt(0);

      if (answer == 'y') {
        positiveAnswers++;
      }
    }

    if (positiveAnswers < 2) {
      System.out.println("You are innocent!");
    } else if (positiveAnswers == 2) {
      System.out.println("You are a suspect!!");
    } else if (positiveAnswers == 3 || positiveAnswers == 4) {
      System.out.println("You are a accomplice!!");
    } else {
      System.out.println("You are a MURDERER!!");
    }
  }
}
