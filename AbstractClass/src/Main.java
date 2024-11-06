//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.printof();
        Subject it = new IT();
        it.sallybus();
        it.learn();
        Base derived = new Derived();
        derived.fun();
        Base2 b = new Derived2();
        b.openNote();
        Base3 b3 = new Derived3();
        b3.laptop();
        D outer = new D();
        D.E inner = outer.new E();
        inner.coding();

    }
}