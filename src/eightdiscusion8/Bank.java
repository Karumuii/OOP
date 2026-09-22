package eightdiscusion8;

public abstract class Bank {
    
    String name;
    int balance;
    
    
    Bank(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    
  abstract void ModeOfPayment();
    
}




