import java.util.Arrays;
import java.util.Scanner;

public class multidimension_arr10 {
    public static void main(String[] args) {
        // so now we gonna to know about the 2-D arrays so iske arrays ke representation me ham [][] aise use karnge
        // as 2d hai array now learing about it how it stores

        Scanner in = new Scanner(System.in);
        // a simple 2-D arrays
        int[][] marr = {
                {1,2,3}, //0th index
                {4,5},// 1st index
                {6,7,8,9}//2nd index
        };//so now this is the arrays and we going to learn how this stores in the java
        /*

        so now thier is object memory where arr is created and now their is in heap memory that how it gets stored
        so in thhat

        [ [1st array }, {2nd array 4 5 } , {3rd arrays }]
        so thus how it stored if we call arr[1]  so it will print out the second arrays {4,5}

        */

        //now taking input in the arrays using the for loop 
        int[][] marr2 = new int[3][3];  //now in this array its neceassary to pass the vlaue of number of the row  not necessary to pass the value of the number of the coloumn as it is not fixed as we have seen above
        // so now when we fill according to the for loop then it fill horizantaly the matrix

        //input
        for (int row = 0; row < marr2.length; row++) {  // as array ka length  row ka length hi hota hai so ham uska use kr liye hai nothing else
            //so now this is for the row of the array which is 3 here 
            for (int col = 0; col < marr2[row].length; col++) {  // so here ham row ka indiviual limit lenge isi liye aise selected hai takki colum diffrent size ka  bhi ho sakta hai isliye
                marr2[row][col]= in.nextInt();  //so this will fill my array horizontally
            }
        }

        //output

        // now thier are various method to print this array out
        for (int row = 0; row < marr2.length; row++) {
            for (int col = 0; col < marr2[row].length; col++) {
                System.out.print(marr2[row][col]+" ");

            }
            System.out.println();// this so print in the new line
        }// have to give value to the row column coz uska length le raha wo error de raha hai

        // now we can also print it out with the help of the array string method also
        for (int row = 0; row < marr.length; row++) {
            System.out.println(Arrays.toString(marr2[row]));

        }
        /*
        so now if we want to create an array which have different coloumn list so now for that we have to use
        Arraylist for that which we learn later in the details as in that thier we set an intial limit set ho gaya
        but we can input more than its limit
        */


    }
}
