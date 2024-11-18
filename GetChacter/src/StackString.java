import java.util.Stack;

public class StackString {
    public static String ReverseString(String str){
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            // push the character into the Stack
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()) { 
            // get the character from the top of the stack
            reverseString[i++] = stack.pop();
        }
        // return string object
        return new String(reverseString);
    }
    public static void main(String[] args)
    {
        String str1 = "GeeksForGeeks";
        System.out.println(str1 + " <- Reverse -> "
                + ReverseString(str1));
    }
}
