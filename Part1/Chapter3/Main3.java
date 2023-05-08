public class Main3 {
  // 3-3 波括弧を省略した記述
  public static void main(String[] args) {
    boolean weather = true;
    if (weather == true) { // 内容が2行なので波括弧は省略不可能
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else // 1行しかないので波括弧は省略可能
      System.out.println("DVDを見ます");
  }
}
