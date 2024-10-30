public class Derived extends Base{
    Derived(){
        System.out.println("Derived constructor called");
    }
    @Override
    void fun() {
        System.out.println("Derived fun called");
    }
}
