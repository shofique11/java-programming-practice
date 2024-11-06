//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Helper.multiply(30,40));
        System.out.println(Helper.multiply(60.56,45.97));
        System.out.println(Helper.multiply(10,20,30));
        Parent parent = new Parent();
        Subclass1 subclass1 = new Subclass1();
        Subclass2 subclass2 = new Subclass2();
        parent.print();
        subclass1.print();
        subclass2.print();
    }
}