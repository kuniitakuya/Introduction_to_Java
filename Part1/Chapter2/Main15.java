public class Main15 {
  // 2-15 キーボードから入力を受け付ける命令
  public static void main(String[] args) {
    System.out.println("あなたの名前を入力をしてください。");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ、" + age + "歳の" + name + "さん");
  }
}
