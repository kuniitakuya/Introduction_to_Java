public class Main15 {
  // 4-15 実行結果は？
  public static void main(String[] args) {
    int[] arrayA = { 1, 2, 3 };
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);
  }
}
