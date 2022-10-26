package hello;

public class overload {
  public void sum(int num1, int num2) {

    System.out.println(num1 + num2);
  }

  public void sum(int num1, int num2, int num3) {

    int result;
    result = num1 + num2 + num3;
    System.out.println("result:" + result);
  }

  public static void main(String args[]) {

    overload s1 = new overload();
    s1.sum(1, 4, 7);
  }
}