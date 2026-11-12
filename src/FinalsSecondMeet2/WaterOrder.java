package FinalsSecondMeet2;

public class WaterOrder {

    private String customername;
    private int numberofGallon;
    private double pricePerGallon;

    WaterOrder(String customername, int numberofGallon, double pricePerGallon) {
        this.customername = customername;
        this.numberofGallon = numberofGallon;
        this.pricePerGallon = pricePerGallon;
    }

    public void setCustomerName(String customername) {
        this.customername = customername;
    }

    public String getCustomerName() {
        return customername;
    }

    public void setNumberofGallon(int numberofGallon) {
        this.numberofGallon = numberofGallon;
    }

    public int getNumberofGallon() {
        return numberofGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }

    public double getpricePerGallon() {
        return pricePerGallon;
    }

    double CalculatePrice(){
        return numberofGallon * pricePerGallon;
    }
    
    void DisplayInfo(){
        System.out.println("Customer: " + customername);
        System.out.println("Number of Gallon: " + numberofGallon);
        System.out.println("Price Per Gallon: " + pricePerGallon);
    }
}
