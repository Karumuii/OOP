package firstmeet1;
class Business {
    String name, prod, cusType,prodtype;
    int cusID, price;
    
    void displayed(){ // Method
        System.out.println("Name: " + name);
        System.out.println("Product: " + prod);
        System.out.println("Customer ID: " + cusID);
        System.out.println("Customer Type: " + cusType);
        System.out.println("Product Type: " + prodtype);
        System.out.println("Price: " + price);
        
    }
}
public class Main {
    public static void main(String[] args) {
         Business c1 = new Business();
         Business c2 = new Business();
         Business c3 = new Business();
         
         c1.name ="Rem";
         c1.prod = "Laptop";
         c1.cusID = 9987;
         c1.cusType = "Consumer";
         c1.prodtype = "Gadget";
         c1.price = 54000;
         c1.displayed();
         System.out.println("");
         
         c2.name ="Cy";
         c2.prod = "Headset";
         c2.cusID = 99878;
         c2.cusType = "Consumer";
         c2.prodtype = "Gadget";
         c2.price = 1500;
         c2.displayed();
         System.out.println("");
         
         c3.name ="kerk";
         c3.prod = "Cellphone";
         c3.cusID = 99879;
         c3.cusType = "Consumer";
         c3.prodtype = "Gadget";
         c3.price = 10000;
         c3.displayed();
         System.out.println("");
         
         int total = c1.price + c2.price + c3.price;
         
         System.out.println("Total Price of all products: " + total);
         
         
    }
}
