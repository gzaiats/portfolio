import java.util.Scanner;

public class CodeChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String safeWord = "pineapple";

    System.out.println("What's the safe word? ");
    String response = scanner.nextLine();

    while (!response.equals(safeWord)) {
      System.out.println("What's the safe word?");
      response = scanner.nextLine();
    }

    System.out.println("You got it!");
  }
}
