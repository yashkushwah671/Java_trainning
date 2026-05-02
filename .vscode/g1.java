interface Animal{

    void sound();

    default void eat(){
        System.out.println("eating ");
    }
}

    class Bird implements Animal{

       public void sound(){
            System.out.println("bird CHIRPS" );
        }
        
    }

    

public class g1 {
        public static void main(String[] args) {
            Animal a=new Bird();
            a.eat();
            a.sound();
        
            
        }
    
}

