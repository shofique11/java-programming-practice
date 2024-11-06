//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Implenet1 implenet1 = new Implenet1();
            implenet1.display();
            System.out.println(implenet1.a);
            ByCycle byCycle = new ByCycle();
            byCycle.changeGear(2);
            byCycle.speedUp(20);
            byCycle.applyBreak(10);
            byCycle.printStates();
            MultIInterfaceIncrement mlt = new MultIInterfaceIncrement();
            mlt.show();
            mlt.display();
            mlt.printShow();
    }
}