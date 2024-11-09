//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void check(int[] arr, int value){
        boolean test = false;
        for(int element:arr){
            if(element == value){
                test = true;
                break;
            }
        }
        if(test){
            System.out.println("The element is found in array");
        }else {
            System.out.println("No found in array");
        }

    }
    public static void main(String[] args) {
        int[] arr = { 5, 1, 1, 9, 7, 2, 6, 10 };
        int search = 9;
        check(arr, search);
        BinarySearch.checkValue(arr, search);
        int search2 = 7;
        ArrayContain.check(arr, search2);
    }
}