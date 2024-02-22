import java.util.Arrays;
import java.util.Scanner;

public class array9input {
    public static void main(String[] args) {
        //so here we are going to learn that how we are going to take input from the array using the loop
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array u wnat to print out ");
        int len = in.nextInt();
        int arr[] = new int[len];
        // so now if u want to take the input to array using loop as how many time we individual enter the data of the array
        for(int i = 0; i<arr.length; i++){
            System.out.println("enter the "+ i +"array input ");
            arr[i]= in.nextInt();
        }
        // so here we goona to take input for the array
        System.out.print(arr[2]); // so it works kind of
        // now how can we print all of the item of the array we want the we can do that also



        //don't know why this is working in worng way so commneted it out
//        for (int i=0; i < arr.length;i++){
//            System.out.print(" "+arr[i]+" ");
//        }




        // i don't know what the fucking error is but it's not showing any  1st digit incorrectly

        // now thier are 3 ways to print out the array all elments so 1st one is as shown above using the for loop so now
        // we can print out that using the enhanced for loop so for enhanced for loop we have to use like
        for (int j  : arr) {
            System.out.print( j +  "  ");
        }
        // so this also print out the result
        System.out.println((Arrays.toString(arr)));

    }
}
