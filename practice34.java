public class practice34 {
  public static void main(String[] args) {
    int sum = 100;

    for (int i = 0; i < 10; i++) {
      int value = i;

      sum += value;
    }

    System.out.println("平均は" + (sum / 10));
  }
}
