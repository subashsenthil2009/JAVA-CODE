public class FoodOrderSystem {
    public static void main(String[] args) {
        
    }
    
}

abstract class food{
    private String foodName;
    private double price;
    
    public void setfoodName(String foodName){
        this.foodName=foodName;
    }

    public String getfoodName(){
        return foodName;
    }

    public void setprice(double price){
        this.price=price;
    }

    public double getprice(){
        return price;
    }
    
    abstract double calcualtePrice(double price);    

    public void displayDetails(){
        System.out.println("Display Details Executed : ");
    }

    public void food(){

    }

    public void food(String name, double price){

    }

}

class VegFood extends food {

    @Override
     double calcualtePrice(double price){
       price=price+(price*5/100);
        return price;
    }
}

class NonVegFood extends food {

    @Override
    double calcualtePrice(double price){
       price=price+(price*12/100);
        return price;
    }
}

interface payment{
    public void makePayment();
}

class UPI implements payment{
    
    @Override
    public void makePayment(){
    System.out.println("pay used in UPI");
    }
}

class CardPayment implements payment{

    @Override
    public void makePayment(){
        System.out.println("pay used in Card");
    }
}