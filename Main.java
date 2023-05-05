public class Main {
  public static void main(String[] args) {
    // 1-1 ソースコードの基本構造
    System.out.println("おはよう");
    System.out.println("こんにちは");
    System.out.println("こんばんは");
    System.out.println("ありがとう");

    // 1-2 変数宣言の文
    int age;
    age = 30;
    System.out.println(age);

    // 1-3 変数の再代入
    int age2 = 20;
    System.out.println("私の年齢は" + age2);
    age2 = 31;
    System.out.println("いや、本当の年齢は" + age2);
  }
}