public class Square implements Shape{
    private final   double length;
    private final double width;
    Square(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return  length * width;
    }
}
