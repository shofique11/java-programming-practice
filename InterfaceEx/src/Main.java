//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(30);
        System.out.println("The circle area: "+ circle.calculateArea());

        Square square = new Square(30,20);
        System.out.println("The area of square: "+ square.calculateArea());
        Square square1 = new Square(50, 35);
        System.out.println("The square are: "+ square1.calculateArea());
    }
}