package fifthMeet5;
// 08/26/26 : Constructor, Page 32 (Coursepack)

public class f5 {
    
    Binarytree root;
    
    static class Binarytree {
        Binarytree left;
        Binarytree right;
        int data;

        Binarytree(int data) { //Constructor with Parameter
            this.data = data;

        }
    }

    void createBinaryTree() {
        Binarytree one = new Binarytree(1);
        Binarytree two = new Binarytree(2);
        Binarytree three = new Binarytree(3);
        Binarytree four = new Binarytree(4);
        Binarytree five = new Binarytree(5);
        
        root = four;
        four.left = one;
        four.right = three;
        
        one.left = two;
        three.left = five;
    }
    //       New name of Binary Tree
    void display(Binarytree node){
        if(node == null){
            return;
        }
        
        display(node.left); //Recursive, tawgon ang method sa sulod saiyang method
        System.out.println("> " + node.data);
        System.out.println(node.right);
    }

    public static void main(String[] args) {
        f5 tre = new f5();
        tre.createBinaryTree();
        tre.display(tre.root);
    }
}
