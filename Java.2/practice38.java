public class practice38 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < 9; i++) {
      if (numbers[i] % 2 == 0) {
        System.out.println("偶数");
      } else if (numbers[i] % 2 == 1) {
        System.out.println("奇数");
      }
    }
  }
}


