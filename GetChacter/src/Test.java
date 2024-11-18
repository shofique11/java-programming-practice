import java.util.Scanner;
public class Test {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1;
                int x;
                while (true) {
                    s1 = sc.next();
                    if (s1.length() <= 10) {
                        break; // Valid input
                    } else {
                        System.out.println("String must have at most 10 characters. Please try again:");
                    }
                }
                while (true) {
                    x = sc.nextInt();
                    if (x >= 0 && x <= 999) {
                        break; // Valid input
                    } else {
                        System.out.println("Integer must be in the range 0 to 999. Please try again:");
                    }
                }
                if(i == 2){
                    System.out.printf("%-16s %03d%n", s1, x);
                }else{
                    System.out.printf("%-15s %03d%n", s1, x);
                }
            }
            System.out.println("================================");

        }
}
