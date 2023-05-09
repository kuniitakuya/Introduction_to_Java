public class Main_q3 {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "りんご";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("腹ペコです");
    }
    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}