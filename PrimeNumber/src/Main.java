import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean checkPrimeNumber(int n)
    {
        for(int i= 2; i<n/2; i++)
        {
            if(n%i == 0){
                return true;
            }
        }
        return false;
    }
   static void prime_N(int N)
   {
       int x, y, flag;
       // Printing display message
       System.out.println("All the Prime numbers within 1 and " + N + " are:");
       for( x =1; x<=N; x++){
           if(x == 1 || x == 0)
               continue;
           flag = 1;
           for(y=2; y<= x/2; y++)
           {
               if(x%y == 0)
               {
                   flag = 0;
                   break;
               }
           }
           if(flag == 1)
           {
               System.out.print(x+" ");
           }

       }
   }
    public static void main(String[] args) {
        int number;
        int N = 45;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();

        if(checkPrimeNumber(number)){
            System.out.println(number + " is not a prime number");
        }else {
            System.out.println(number + " is a prime number");
        }
       prime_N(N);

    }
}