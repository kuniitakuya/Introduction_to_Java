public class Main8 {
  // 5-8 戻り値をそのまま使う
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(add(add(10, 20), add(30, 40)));
  }
}
