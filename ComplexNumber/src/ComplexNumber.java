public class ComplexNumber {
    int real, image;
    public ComplexNumber(int real, int image)
    {
        this.real = real;
        this.image = image;
    }
    public void showC()
    {
        System.out.println(this.real+"+i"+this.image);
    }

// Adding two complex number // function for addition
    public static ComplexNumber add(ComplexNumber complexNumber1, ComplexNumber complexNumber2)
    {
        // create a blank complexNumber
        ComplexNumber res = new ComplexNumber(0,0);
        // adding the real part
        res.real = complexNumber1.real + complexNumber2.real;
        // adding the imagine part
        res.image = complexNumber1.image + complexNumber2.image;
        return  res;

    }
}
