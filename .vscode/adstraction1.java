abstract class Animal{
    int no_of_legs;
    String name ;

    abstract void sound();//static method

    void eat(){//non static method
        System.out.println("do not disturb ia am eating");

    }
}

    abstract class Bird extends Animal{
        abstract void colour();

        void sound(){
            System.out.println("CHIRPS" );
        }
        void fly(){
            System.out.println("pachi udta fhire");
        }
    }

class koyal extends Bird{
    void sound(){
        System.out.println("KOO K OOO ");
    }
    void colour(){
        System.out.println("black beauty");
    }
}

    

public class adstraction1 {
        public static void main(String[] args) {
            Animal a=new koyal();
            a.eat();
            a.sound();
            a.fly();
            a.no_of_legs =2;
            System.out.println();
            
        }
    
}

