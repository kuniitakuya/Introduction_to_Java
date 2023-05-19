public class Main13 {
  // 5-13 同じ配列を参照していることを確認する
  // int型配列を受け取り、
  // 配列ないの要素全てに１を加えるメソッド
  public static void incArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3 };
    incArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}
