//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red",35);
        System.out.println("The area of the circle: "+ circle.area());
        Square square = new Square("Green",12,8);
        System.out.println("The area of the square: "+ square.area());
        Triangle triangle = new Triangle("Black", 40, 30);
        System.out.println("The area of the Triangle: "+triangle.area());
    }
}