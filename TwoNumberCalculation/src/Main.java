//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String add_Binary(String x, String y)
    {
        // converting binary string into integer(decimal number)
        int num1 = Integer.parseInt(x,2);
        // converting binary string into integer(decimal number)
        int num2 = Integer.parseInt(y, 2);
        //store two number in sum
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);

    }
    public static void main(String[] args) {
        float f1 = 1.5f;
        float f2 = 2.75f;
        // to store the multiple value
        float p = f1 * f2;
        System.out.println("Multiply two number: "+ p);
        // Two input number
        int number1 = 40;
        int number2 = 60;
        System.out.println("Before swap: "+ number1 + " and "+ number2);
        // swap the number
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("After swap: "+ number1 + " and "+ number2);
        String x = "011011";
        String y = "1010111";
        System.out.print("after adding:"+ x +"+"+ y +" = "+add_Binary(x, y));
    }
}