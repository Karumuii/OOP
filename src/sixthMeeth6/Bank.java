package sixthMeeth6;

public class Bank {
   private int accID; // = 123
   private String accName; // = "nigs"
   
   // Constructor:
//   Bank(int id, String name){
//       this.accID = id;
//       this.accName = name;
//   }
   
   void setaccID(int newaccID){ // Write Only
       this.accID = newaccID;
   }
   int getaccID(){ // Read-only
       return accID;
   }
   
}




