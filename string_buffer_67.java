import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class string_buffer_67 {
    // so here we are going to learn about the string buffer class a bit so in the string buffer class it is also
    // like the string builder class and it is also immutable like the string builder
    //advantages of the string builder class over the normal string
    // so 1. it is mutaible   2. it is effecient 3. it is thread safe  / thread safe means at one time only one thread
    // can make changes on the one data here so it is little slower out of the string builder
    // so string builder is not thread safe and it is so bit more faster than the strign buffer
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();  // this constructor have initial capacity of 16
        sb.append("i am ashok");
        // now we can insert at the particular index
        sb.insert(9,"  my name  ");
        // we can also use the replace function here
        sb.replace(1,2,"  rahul  ");  // not last index is not inclusive so it goes from the 1 to 1 index
        // only so as how it get
        // se all the function which we can do here
        sb.reverse(); // this function also work here

        String str = sb.toString();  // like we have to defin the two string method here also
        System.out.println(str);
        // now we can initialise the string buffer with some initial value and we can also change it's capacity
        // from 16 to what we want
        StringBuffer sb2 = new StringBuffer("ashok");
        StringBuffer sb3 = new StringBuffer(78);// so we can see that we can change the capacity

    }
}
class randomstring{
    public static void main(String[] args) {
        // so now here i have to crate the ramdom string of the size 20 so for that
        StringBuffer sb = new StringBuffer(20);
        // so now adding in the string
        // so for adding it randomly we have to crate the random string
        Random random = new Random();
        for (int i = 0; i < 21; i++) {
           int randominteger = 97+(int)(26*random.nextFloat()); // so now as the ascy value of a start with 97 so
           // it will add the random flaot which has the value from 0 to 1 so in point so thus how
           sb.append((char)(randominteger));
//           String str = sb.toString();
//            System.out.println(str);
            // so we can see how the ramdom value is being created
        }
        String str = sb.toString();
        System.out.println(str);
        // so now what method which string can use
        // so how can we remove wide spaces from the string so for this their is also an function available so
        String ss = "this   is    nott what    you    think ";
        System.out.println(ss);
        System.out.println(ss.replaceAll("\\s",""));
        // similay we can use the split function like
        String arr = "ashok , siddant , ayush , ritik , harshit";
        // so now if we want to split it
        String[] name = arr.split(","); // so it split when it get , this
        System.out.println(Arrays.toString(name));

        // now we can do the decimal format
        DecimalFormat df = new DecimalFormat("000.00000");
        System.out.println(df.format(7.39)); // so thus how we can do the rounding off
    }
}
