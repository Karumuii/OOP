package FinalsSecondMeet2;

public class DeliveryOrder extends WaterOrder{
   
    private double DeliveryDistance;
    private double DeliveryFee;

    DeliveryOrder(String customername, int numberofGallon, double pricePerGallon, double DeliveryDistance, double DeliveryFee) {
        super(customername, numberofGallon, pricePerGallon);
        this.DeliveryDistance = DeliveryDistance;
        this.DeliveryFee = DeliveryFee;
    }
    
    double CalculateDeliveryFee(){
        return DeliveryDistance * DeliveryFee;
    }
    
    double OverallPayment(){
        return CalculatePrice() + CalculateDeliveryFee();
    }
   
    void DisplayAll(){
        DisplayInfo();
        System.out.println("Delivery Distance: " + DeliveryDistance + "KM");
        System.out.println("Delivery Fee: " + DeliveryFee);
        System.out.println("Overall Payment: " + OverallPayment());
        
    }
    
    
}




