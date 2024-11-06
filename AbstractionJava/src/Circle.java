public class Circle extends Shape{
    double redious;
    public Circle(String color, double redious)
    {
        super(color);
        System.out.println("Circle constructor called");
        this.redious = redious;
    }
    @Override
    public double area() {

        return Math.PI* Math.pow(redious,2);
    }
}
