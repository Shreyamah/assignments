package oops3;

public class CurrentAccount extends Bankdemo {
  public void deposite(int amount) {

    this.balance -= amount;
    System.out.println("cash:" + this.balance);
  }
}
