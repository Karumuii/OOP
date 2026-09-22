package eightdiscusion8;

public class Gcash extends Bank{
   
    Gcash(String name, int balance){
        super(name, balance); // Connects to the Parent Class
    }
    
    @Override
    void ModeOfPayment() {
        System.out.println("Paid through GCASH");
        System.out.println("Information");
        System.out.println("Name: " + name + " Balance: " + balance);
        System.out.println();
    }
    
    
}




