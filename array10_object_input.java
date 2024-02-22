import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array10_object_input {
    public static void main(String[] args) {
        // so now we have know how to input array of the primitve now we will learn about array of the objects
        Scanner in = new Scanner(System.in); // used to create to take the input

        //initialization of the array
        System.out.println("enter the length of the array you want "); int ip = in.nextInt();

        String[] str = new String[ip]; // str string is created in the object memory and the their value is created heap memory
        //now taking the input in the array
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
            // so it has taken the input of the array
        }
        //modify
        str[1]= "horses";  // now 2nd number will always print this value
        System.out.println(Arrays.toString(str));
        // so now isme jo change hua hai wo direct array me hua hai heap memory me bina koi new copy object creat kiya

        // mutability
        change(str);
        System.out.println(Arrays.toString(str));
        // so now isme jo change hua hai wo ek string ka ek aur object banta hai lekin wo heap memory me same chezz ko
        // point karta hai and uss array ko change kr deta hai isko ham
        // MUTABILITY  kahta hai

        /* so arrays are imutaible in java whereas string are mutaible in the java */

    }
    static void change(String[] str) { //now wo jo bracket me laga hai wo tumhre upar walle calss ko inherit krne ke
        str[1]= "ass";

    }
}
