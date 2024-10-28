import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Integer largestNumber(int x, int y, int z)
    {

        return  z > (x>y ? x : y) ? z : ((x > y) ? x: y);
    }
    public static Integer biggestNumber(int x, int y, int z){
        if(x > y && x > z){
            return x;
        } else if (y > z) {
            return y;
        }else {
            return z;
        }
    }
    public static void main(String[] args) {
      System.out.println("The largest number: "+largestNumber(70,50,90));
      System.out.println("The biggest number: "+ biggestNumber(40,50,30));
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(56);
      numbers.add(65);
      numbers.add(50);
      System.out.println("The maximum number: "+ Collections.max(numbers));
    }
}