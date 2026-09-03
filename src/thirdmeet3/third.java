package thirdmeet3;
// Page: 18 - 24 (Programming errors) in the Coursepack
// 08/20/26
public class third {
    public static void main(String[] args) {
         
        int x = 0;
        System.out.println();
        System.out.println("For Loop:");
    // Flow condition then statement then update
        for(x = 50; x >= 1; x-=10){
            System.out.println(x);
        }
        System.out.println();
        System.out.println("While:");
    // While Sample:
        int y = 0;
        
        while(y<=20){
            System.out.println(y + " ");
            y+=5;
        }
        System.out.println();
        System.out.println("Do While:");
     // Do while:
        int i = 65;
        do{
            System.out.println(i + " ");
            i++;
        } while (i < 5);
        
        
        // First Topic next: Encapsulation
         
    }
}
