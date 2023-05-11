public class Main10 {
  // 5-10 オーバロード(引数の方が異なる場合)
  // 1つ目のメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  // 2つ目のメソッド
  public static double add(double x, double y) {
    return x + y;
  }
  // 3つ目のメソッド
  public static String add(String x, String y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(add(10, 20));
    System.out.println(add(3.5, 2.7));
    System.out.println(add("Hello", "World"));
  }
}
