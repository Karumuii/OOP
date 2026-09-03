package sixthMeeth6;
// Page 38 in Coursepack, 9/3/26
public class Main {

    public static void main(String[] args) {
//          Using the Constructor one:
//        Bank bdo = new Bank(23, "Wenomichiinasama"); 

        Bank bdo = new Bank();
        bdo.setaccID(23);
        System.out.println(bdo.getaccID()); // or int id = bdo.getaccID();
        

    }
}
