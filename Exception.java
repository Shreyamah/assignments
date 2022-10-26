package hello;

public class Exception {

  public static void main(String[] args) {

    try {
      int num1 = 0;
      int num2 = 20;
      int result = num2 / num1;
    } catch (ArithmeticException e) {
      System.out.println("dividing by zero");
    }
  }

}
