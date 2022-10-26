package oops1;

/**
 * TODO shreyama This type ...
 *
 */
public class manager extends employee {
  int incentive = 200;

  @Override
  public void cal() {

    int result = this.basic + this.incentive;
    System.out.println("salary" + result);
  }

}
