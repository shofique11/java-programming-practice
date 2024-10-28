//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int gcd(int x, int y){
        if( x == 0){
            return y;
        }
        while (y !=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }

    public static int lcd(int a, int b){
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        int a = 15; int b= 25;
        System.out.println("LCD of "+a + " and "+b +" :" + lcd(a,b));
        System.out.println("GCD of "+a + " and "+b + " :"+ gcd(a,b));
    }
}