package sixthMeet6.sample2;

public class Main {
    public static void main(String[] args) {
         
         Student grado = new Student();
         
         if(grado.setGrade(12)){
             System.out.println("Valid");
             System.out.println(grado.getGrade());
         } else {
             System.out.println("Invalid");
         }
         
         
    }
}
