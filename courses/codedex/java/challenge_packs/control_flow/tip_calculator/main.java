public class CodeChallenge {
  public static void main(String[] args) {
    double subtotal = 96.82;
    int option = 15;
    double tip = 0.0;

    if (option == 15) {
      tip = subtotal * 0.15;
      System.out.println("Tip: $" + tip);
    } else if (option == 20) {
      tip = subtotal * 0.20;
      System.out.println("Tip: $" + tip);
    } else if (option == 25) {
      tip = subtotal * 0.25;
      System.out.println("Tip: $" + tip);
    } else {
      System.out.println("Invalid tip percentage");
    }
  }
}
