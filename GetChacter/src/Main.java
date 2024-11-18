//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static char
    getCharFromString(String str, int index)
    {
        return str.toCharArray()[index];
    }
    public static void main(String[] args) {
        String str = "Welcome to java programming";
        int index = 5;
        char ch = str.charAt(index);
        System.out.println(index + " index character "+ ch);
        char ch2 = getCharFromString(str, index);
        System.out.println(index + " index character "+ ch2);
    }
}