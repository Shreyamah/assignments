package hello;

/**
 * TODO shreyama This type ...
 *
 */
public class armstrong {
  public static void arm(int number) {

    int number1 = 333, originalNumber, remainder, result = 0;

    originalNumber = number1;

    while (originalNumber != 0) {
      remainder = originalNumber % 10;
      result += Math.pow(remainder, 3);
      originalNumber /= 10;
    }

    if (result == number1)
      System.out.println(number1 + " is an Armstrong number.");
    else
      System.out.println(number1 + " is not an Armstrong number.");
  }

  public static void main(String[] args) {

    int n;
    n = 333;
    arm(n);
  }

}
