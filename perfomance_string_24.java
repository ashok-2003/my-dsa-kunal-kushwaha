import java.util.Arrays;

public class perfomance_string_24 {
    // now we have to talk about the prfomance of the string that is how much string is efficient for the use
    public static void main(String[] args) {
        String serise = "";
        for (int i = 0; i < 26; i++){
            char ch = (char)( 'a' + i);
            serise = serise+ch;
        }
        System.out.println(serise);
        // so it is printing upto the z value
        /*
        so now how much is its complexicity is so now as we know that we can not change the string it is immutiable
        here above its working like a then b is added but we can not add in string so new object ab is created
        then next simliary ab + c then new object abc is created so thus how each time new object is being craeted
        and as no one pointing to the previous object so it is completely waste of the space so it is tollay wasitng
        many space
        so now what about its runtime so the runtime of it is
        0(n2) as here it is like 1+2+3+4+5+6+7...n so as less dominating term negelectated so n2 is the complexicity
        so now waht is the solution how can we reduce the time complexicity

         */

        // so for that we usages the string builder for that as in the string builder it act like arrays here
        // new string is added to the previous object here  no new object is being created for that
        StringBuilder build = new StringBuilder();
        for (int i = 0; i<26; i++){
            char ch = (char)('a'+i);
            build.append(ch);
        }
        System.out.println(build);
        // so now it have the time complexicity to log 0(n) and the space complexicity is also very less as no new
        // object is being created so thats why

        // now we can use different types of method a/c to our own
        String names = "ashok kumar ";
        System.out.println(Arrays.toString(names.toCharArray()));
        // so here their is new object is being created
        System.out.println(names.indexOf('h'));// so it print the index at which first time h will come out

        // so we can check various method on the names.
        // like strip it romoves the extra spaces from the string
        // split   it make the string split where it find the spaces at that place   and retutrn as the array we can
        // check its inner working of it if we want
    }
}
