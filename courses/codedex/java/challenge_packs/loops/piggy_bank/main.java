public class CodeChallenge {
  public static void main(String[] args) {
    double weeklyDeposit = 15;
    double balance = 0.0;

    for (int i = 1; i <= 52; i ++) {
      balance += weeklyDeposit;
    }

    System.out.println("Total: $" + balance);

    if (balance > 100) {
        System.out.println("You saved enough money");
    } else {
        System.out.println("Keep Saving");
      }
  }
}
