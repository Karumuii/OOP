package FinalsFirstMeet1;

public class Student extends Persons{

    int StudentID;
    
    Student(String name, int age, int StudentID){
        super(name, age); // refers to the Persons class
        this.StudentID = StudentID;
    }
    
   void display(){
       super.display(); 
       System.out.println("StudentID: " + StudentID);
   }
    
    
}




