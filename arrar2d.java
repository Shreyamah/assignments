package hello;

/**
 * TODO shreyama This type ...
 *
 */
public class arrar2d {

  /**
   * @param args
   */
  public static void main(String[] args) {

    double p, r, t, s_interest, c_interest;
    p = 1000;
    r = 10;
    t = 4;

    s_interest = (p * r * t) / 100;
    c_interest = p * Math.pow(1.0 + r / 100.0, t) - p;
    System.out.println("Simple Interest: " + s_interest);
    System.out.println("Compound Interest: " + c_interest);

  }

}
