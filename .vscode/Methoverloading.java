public class Methoverloading {
    static int add(int a,int b){
        return a+b;

    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static int add(double a,double b )
    {
        return (int )(a+b);

    }
     public static void main(String[] args){
        System.out.println(10,20);
        System.out.println(10,20.2);
     }
    
}
