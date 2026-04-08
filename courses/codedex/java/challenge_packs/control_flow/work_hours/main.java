public class CodeChallenge {
  public static void main(String[] args) {
    int hour = 20;
    boolean isWeekend = false;

    if (hour >= 10 && hour <= 18 && !isWeekend) {
      System.out.println("The office is open 🟢");
    } else {
      System.out.println("The office is closed 🔴");
    }
  }
}
