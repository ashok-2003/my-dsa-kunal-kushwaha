import java.util.Arrays;

public class bublle_sort_18_recursion {
    // so now here we will look at the bubble sort in the recrusive manner here so it basically the same but never the
    // lees we can look onto it here so now here
    public static void main(String[] args) {
//        int[] arr = {2,4,2,53,3,7,4,7,3,6,345,2,6,36,36,4,6,36,3,6,65,6,56,4};
//        insertionSortRecursive(arr , arr.length);
//        System.out.println(Arrays.toString(arr));
        int x = 4; int y = 5;

    }
    public static void bubble(int[] arr , int n){
        // so now here the base case of the n which is the length of the array her
        if(n == 0){
            return;
        }
        // so now here otherwise we have to initialzied a count variable here
        int count = 0;
        // so now here in the array we have to check if it is sorted or not here so now here
        for(int i = 0; i < n-1; i++){
            // as we have to compare so the last elment goes here so for that n-1
            if(arr[i] > arr[i+1]){
                // so we need to swap here
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                // so now here we are increase the count variable here
                count++;
            }
        }
        // so now here after the loop if nothing happens so it means our array is already sorted so now here
        if(count == 0) return;
        // so now other wise we have to repeate the same process for the other also here
        bubble(arr , n-1);
    }
    static void insertionSortRecursive(int arr[], int n)
    {
        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );

        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
    static int product(int x, int y)
            // so basically the concept is 5 ka guda hame 5 barr karna hai to so ham 5 ko 4 barr add bhi kar skate hai
            // so that's the instution here but the better algo of this is in the copy and in the leetcode
    {
        // if x is less than
        // y swap the numbers
        if (x < y)
            return product(y, x);

            // iteratively calculate
            // y times sum of x
        else if (y != 0)
            return (x + product(x, y - 1));

            // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }


}
