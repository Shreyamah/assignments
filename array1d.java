package hello;

public class array1d {

  public static void main(String[] args) {

    int[] pop = new int[5];
    pop[0] = 300;
    pop[1] = 200;
    pop[2] = 100;
    // for (int i = 0; i < pop.length; i++)
    // System.out.println("population [" + i + "]is " + pop[i]);
    for (int i : pop) {
      System.out.println(i);
    }
  }
}