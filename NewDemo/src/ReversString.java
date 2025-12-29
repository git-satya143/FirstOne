public class ReversString {

    public static void main(String[] args) {

        String str ="abcd";
        String revStr="";
        char ch;
        for (int i = 0; i<str.length();i++)
        {
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println(revStr);

    }
}
