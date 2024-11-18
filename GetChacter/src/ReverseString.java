public class ReverseString {

    public  static void main(String[] args){
        String str = "Geeks", nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('p');
        stringBuilder.reverse();
        System.out.println(str);
        String myName = "Shofique";
        char[] arr = myName.toCharArray();
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();

        String str3 = "FakrulIslam";

        // Conversion from String object
        // To StringBuffer
        StringBuffer sbr = new StringBuffer(str3);

        // Reverse String
        sbr.reverse();

        System.out.println(sbr);
    }

}
