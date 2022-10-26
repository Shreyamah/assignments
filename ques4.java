package hello;

/**
 * TODO shreyama This type ...
 *
 */
public class ques4 {

  public static void main(String[] args) {

    int m1 = 70;
    int m2 = 10;
    int m3 = 30;

    if (m1 > 60 & m2 > 60 & m3 > 60) {
      System.out.println("pass");
    } else if ((m1 > 60 & m2 > 60) || (m2 > 60 & m3 > 60) || (m1 > 60 & m2 > 60)) {
      System.out.println("promoted");
    } else if ((m1 > 60 || m2 > 60 || m3 > 60) || (m1 < 60 & m2 < 60 & m3 < 60)) {
      System.out.println("fail");
    }

  }

}
