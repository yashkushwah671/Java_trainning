interface A{
    public static final int rollno =5;
    void show();
    default void present(){
        System.out.println("inside a");
    }
}
interface B{
    default void present1(){
        System.out.println("insisde b");

    }
}
class C implements A,B{
    public void present(){
        B.super.present1();
        A.super.present();

    }
    public void show(){
        System.out.println("showing");
    }
}

public class interface3 {
    public static void main(String[] args) {
        C a=new C();
        a.present1();
        a.present();
    }
    
}
