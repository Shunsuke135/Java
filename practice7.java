public class practice7{
  public static void main(String[] args){
    int x,y,z;
    x = 5;
    y = 10;

    z = x;
    x = y;
    y = z;

    System.out.println("x=" + x + ",y=" + y);
  }
}