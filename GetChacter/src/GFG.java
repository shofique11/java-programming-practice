public class GFG {
    public static void main(String[] args){
        // Get a string
        String str1 = "Java programming learning";
        int index = 7;
        char ch='S';
        System.out.println("Original String = " + str1);
        str1 = str1.substring(0, index)+ch + str1.substring(index+1);
        System.out.println(str1);

        String str = "Geeks Gor Geeks";
        // Get the index
        int index2 = 4;

        // Get the character
        char ch2 = 'F';
        System.out.println("Original String = " + str);
        StringBuilder string = new StringBuilder(str);
        string.setCharAt(index, ch2);
        System.out.println("replace String = " + string);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.setCharAt(7,'M');
        System.out.println(string);
    }
}
