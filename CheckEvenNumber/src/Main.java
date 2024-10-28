//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String oddEvenNumberChecking(int a)
    {
        String x="";
        if(a !=0){
            if(Integer.toBinaryString(a).endsWith("0"))
            {
               x = "Even";
            }else {
                x = "Odd";
            }
        }else {
            x = "Zero";
        }
        return x;
    }

    public static String checkOddEven(int n)
    {
        if(n != 0){
            if(n%2 == 0)
            {
                return "Even";
            }else{
                return "Odd";
            }
        }
        return "Zero";
    }
    public static void main(String[] args) {
        System.out.println("The number is: "+ oddEvenNumberChecking(15));
        System.out.println("The number is :"+ checkOddEven(24));
    }
}