package eightdiscusion8;

public class BDO extends Bank{

    BDO(String name, int balance){
        super(name, balance); // Connects to the Parent Class
    }
    
    @Override
    void ModeOfPayment() {
        System.out.println("Paid through BDO");
         System.out.println("Information");
        System.out.println("Name: " + name + " Balance: " + balance);
        System.out.println();
    }
    
   
    
    
}




