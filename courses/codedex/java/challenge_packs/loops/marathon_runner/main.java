import java.util.Scanner;
public class CodeChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int goal = 1000;
    int donation = 0;

    while (donation < 1000) {
      System.out.println("How much to donate? ");
      donation = scanner.nextInt();

      System.out.println("Total: $" + donation);
    }
    System.out.println("Goal reached!");
  }
}
