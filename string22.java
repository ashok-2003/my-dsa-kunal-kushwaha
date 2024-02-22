import java.lang.reflect.Array;
import java.util.Arrays;

public class string22 {
    /*
    so now we will learn about the internal working of all like in java every object at time of the printing
    it converted to the to string like
    like array and digits all are working with to string method
    note it converting object to the to string object and now object can be of the many type as we know we can create
    our own object in java later on so by default it convert to the to string unless its value is null if it value is
    null it will not convert to the to string
     */
    public static void main(String[] args) {
        System.out.println(56);// so now here .to string is silent it is converting it into to string object
        int[] a = {3,5,7,8,5,8,9,2,7};
        System.out.println(a);  // so now we can say it is printing the value of the array becuase  arrays is diffrent
        // object for it so now we have to tell it its array and convert to the string
        System.out.println(Arrays.toString(a));
        // so now we can see its working prefectly as we told it expectially to convert array to string as we can see in its code

    }
}
