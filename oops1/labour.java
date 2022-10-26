package oops1;

public class labour extends employee {
  int over = 100;

  @Override
  public void cal() {

    int result = this.basic + this.over;

    System.out.println("salary:" + result);
  }

}
