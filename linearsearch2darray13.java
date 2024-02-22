import java.io.InterruptedIOException;
import java.util.Arrays;

public class linearsearch2darray13 {
    public static void main(String[] args) {
        //now here we will learn linear search in the 2-d arrays so its simple pahle go in the row then in for loop
        // another for loop so for the coloumn so that it will run
        int[][] arr = { // agar ham yah bracket ke bhar new int use kar lete to niche karne ka jarurat nahi padta so abhi isliye nich pada hai
                {23,1  ,5,46,46,46},
                {5,6,3,6,46,-7},
                {2,6,46,7,8,5,47,4}
        };
        int[] ans = search2d(arr,-7); // ise bhi hame array banana pada hai coz ham 2 values return kara rahe row and coloumn ka so
        System.out.println(Arrays.toString(ans));
        int max = maxvalue(arr);
        System.out.println(max);
    }
    static int[] search2d(int[][] arr , int target) {  // int[][] karna jarruru hai coz ham ye 2d array par kar rahe hai kaam so
        if(arr.length==0){
            return new int[]{-1,-1};}

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {  // ye line arr[row].length error de raha rha coz upar maine bas int [] likha tha
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // so row and coloumn print karne ke liye hame ise bhi new int[] se initlize karna pada hai
                    // as now static ko bhi hame as a arrays convert karna pada hai takki ham kar sake array retrurn so that how its work
                    // so thats how 2d array ham value return karnge usko bhi array banna padega 1d ka pahle tabhi row and coloumn ka value
                    // return hoga


                }

            }
        }
        return new int[]{-1,-1};
    }
    //for the max value return in the function
    static int maxvalue(int[][] arr ){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }

            }

        }
        return max;
    }
}
