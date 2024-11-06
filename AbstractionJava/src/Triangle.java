public class Triangle extends Shape{
    double height;
    double base;
    public Triangle(String color, double height, double base){
        super(color);
        System.out.println("Triangle constructor called");
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return (height * base)/2;
    }
}
