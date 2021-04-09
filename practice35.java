public class practice35 {
  public static void main(String[] args) {
    int wins = 0;

    for (int i = 0; i < 10; i++) {
      int result = i;

      if (result == 1)
        wins += 1;
    }

    System.out.println("勝ち" + wins + "回、負け" + (10 - wins) + "回");
  }
}
