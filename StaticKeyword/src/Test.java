public class Test {
    static void m1()
    {
        System.out.println("Hi I am static method");
    }
    // static variable
    static int a = 10;
    static int b;
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String[] args){
        m1();
        System.out.println("from main");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
