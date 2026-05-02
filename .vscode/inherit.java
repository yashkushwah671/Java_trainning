class Car{
    String colour;
    String model;
    String brand;
    int mileage ;
    int no_of_gear;
    Car(String colour,String model,String brand,int mileage,int no_of_gear){
        this.colour =colour;
        this.brand= brand;
        this.mileage= mileage;
        this.no_of_gear = no_of_gear;

    }
    void applyBrake(){
        System.out.println( "braking");
    }
    void speed(){
        System.out.println("speed");
    }
    void shiftgear(){
        System.out.println("gear");
    }
}
class Verna extends Car{
    int capacity;
    Verna(String colour, String model,String brand,int mileage,int no_of_gear,int capacity){
       super(colour,model,brand,mileage,no_of_gear);
        
        this.capacity=capacity;
    }

    void airbag(){
        System.out.println("airbag");
    }
    
    
}


public class inherit {
    public static void main(String[] args) {
        Verna v=new Verna("black","second top","hundai",15,6,5);
        v.airbag();
       v.capacity=10;
       System.out.println(v.capacity);
    }
    
}
