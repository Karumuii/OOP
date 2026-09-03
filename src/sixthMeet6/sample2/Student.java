package sixthMeet6.sample2;

public class Student {
   private int studentID;
   private int grade;
   
   boolean setGrade(int data){
       if (data >= 0 && data <= 100){ // default value 0
           this.grade = data;
           System.out.println("Grade: " + grade);
           return true;
       } else {
          return false;
       }
   }
   
   int getGrade(){
       return grade;
   }
    
    
}




