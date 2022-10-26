package oops3;

public class SavingAccount extends Bankdemo {
  public void deposite(int amount) {

    this.balance += amount;
    System.out.println("cash:" + this.balance);
    ;
  }
}
