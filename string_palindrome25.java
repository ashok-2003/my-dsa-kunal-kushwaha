import java.util.Arrays;

public class string_palindrome25 {
    // so how we can check whether the string is palindrome or not ?
    // so palindrome is that is same from front and back like    abcba
    // 1.
    /*
    so two pointer use one from the start and other from end and if start == end then start + and end -
    and thus we can solve it
     */
    /*
    2.
    so in this make a string builder and reverse the string and compare with the orignal string
     */
    public static void main(String[] args) {
        String a = "abcdcba";
        String b = "abcdba";
        String c = "abcdef";
        String d = "abccba";
        ispendlrome(b);
        ispendlrome2(c);

    }
    static boolean ispendlrome (String str){
        String str3 = str.toLowerCase();
        int start = 0;
        int end = str3.length()-1;

        while (end>start){
            if(str3.charAt(start)==str3.charAt(end)){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    static boolean ispendlrome2(String str){
        String str3 = str.toLowerCase();
        StringBuilder string = new StringBuilder(str3);
        string.reverse();
        String str2 = string.toString();
        if(str2==str3){
            return true;
        }



        return false;


    }
}
