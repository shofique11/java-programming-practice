import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //declare the number
        int userNumber;
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number:");
        //Read the next integer from the screen
        userNumber = scanner.nextInt();
        // display the number
        System.out.println("User input number: "+userNumber);
        // declare the string
        String name;
        // Enter data using BufferReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // reading data using readline
        System.out.println("Input your string from screen:");
        name = bufferedReader.readLine();
        System.out.println("User input string: "+ name);
    }
}