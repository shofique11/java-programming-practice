public class MultIInterfaceIncrement implements InterfaceOne, InterfaceTwo{
    @Override
    public void display() {
        System.out.println("I am from interface one");
    }

    @Override
    public void printShow() {
        System.out.println("I am from interface two");
    }
}
