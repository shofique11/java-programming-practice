import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void isLeapYear(double year)
    {
        boolean is_leap_year = false;
        if(year%4 == 0){
            is_leap_year = true;
            if(year %100 == 0){
                if(year%400 == 0){
                    is_leap_year = true;
                }else {
                    is_leap_year = false;
                }

            }
        }
        if(!is_leap_year){
            System.out.println(year + " is not leap year");
        }else{
            System.out.println(year + " is leap year");
        }
    }
    public static void main(String[] args) {
        double year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = scanner.nextDouble();
        isLeapYear(year);
    }
}