package eightdiscusion8;

public class CreditCard extends Bank{
   
    CreditCard(String name, int balance){
        super(name, balance); // Connects to the Parent Class
    }
     
    @Override
    void ModeOfPayment() {
        System.out.println("Paid through Credit Card");
    }
    
}




