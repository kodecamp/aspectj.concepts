package in.kodecamp.services;

public class AccountService {
  private int balance;
  
  public AccountService(int openingBalance) {
    this.balance = openingBalance;
  }
  
  public boolean withdraw(int amount) {
    System.out.println("Account : begin withdraw()");
    if(this.balance < amount) {
      return false;
    }
    this.balance -= this.balance - amount;
    System.out.println("Account : end withdraw()");
    return true;
  }
  
  public int deposit(int amount) {
    System.out.println("Account : current balance : " + this.balance +", depositing : " + amount);
    this.balance += amount;
    return this.balance;
  }
  
  public int balance() {
    return this.balance;
  }

}
