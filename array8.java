import java.util.concurrent.LinkedTransferQueue;

public class array8 {
    //here we gonna to learn about the arrays so its syntax is

    //datatype[] variable name =  new datatype [size]
    // one array can store one type of datatype
    public static void main(String[] args) {
        int[] rolls;  // this is declearation of the array and its is gettting created in the stack me define   happen at compile time
        rolls= new int[5];  //here accutually object is being created in the heap memory
        //  acutually creation of storage happens at runtime
        int[] rolls3 = {23,45,78,45};


        //  so dynamic memory allocation is that when storage is gettin defined at the run time that ussi time storage
        // ka space milta hai usse phle nahi milta hai


        // IN C ARRAY AQuire the continious memory where as in java array storage may be or may not be continious tottllay depend on the jvm  as heap momory and stack memory are all the things of the jvm only .
        // arrays objects are in the heap and heap object are not continous  ..
        System.out.println(rolls3[2]);
        System.out.println(rolls[3]); // as in this we have not defined the any value of the array then it will consider by default the 0 value
        // now so what the value of the string by default
        String[] arr = new String[5];
        System.out.println(arr[3]);  // so we can see its by default value is the null
        // if we want to store the value in the arraay then we can do that also for eg.
        rolls[2]= 30;
        System.out.println(rolls[2]);
        System.out.println(rolls[0]); // as we have not provided any input thier then its taking by default 0 by its own
        System.out.println(arr.length);  // so this will tell us the length of the array

        // in java only primitive are stored in stack memory and non- primitve are stored in the heap memory
        // primitive are data type which cannot be get further broken down to the simpler data types 

    }
}
