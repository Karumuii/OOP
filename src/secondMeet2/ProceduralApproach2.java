package secondMeet2;
// Study: what is Static
// COursePack Page 14 (Start)
public class ProceduralApproach2 {

    public static void main(String[] args) {

        int sum = add(4, 3, 23);
        average(sum);

    }
    // Modifier : public, private, void, static, etc.
// Does return anything 
    static int add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
        return sum;
    }
//  Void doesnt return anything 
    static void average(int sum) {
        int average = sum / 3;
        System.out.println("Average: " + average);
    }
}
