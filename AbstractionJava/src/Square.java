public class Square extends Shape{
    double length;
    double width;
    public Square(String color, double length, double width)
    {
        super(color);
        System.out.println("Square constructor called");
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
}
