import java.util.Arrays;

public class quick_sort_38 {
    /*
    so in the quick sort we have doing it as it is better in some case so in this
    their we can take a piviot  that is we take a elemnet somewhere in the array so
    now all the element smaller than that is now go toward left of the piviot  and the all bigger element
    go to the right side of the piviot so now that 's how we piviot is at the right place as we can see that
    so now we will call the recursion call for that
     */
    public static void main(String[] args) {
        int[] arr = {3,5,6,3,6,3,6,4};
        quicksort(arr,0,arr.length-1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void quicksort(int[] arr , int low , int high){
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int piviot = arr[mid]; // so here we are taking the mid as the piviot
        if(low>=high){
            return;  // as low ka value greater that high ho gaya that's why
        }
        while (s<=e){
            while (arr[s]<piviot){
                s++;  // so as the left elment is less than the piviot so it is good so s++
            }
            while (arr[e]>piviot){
                e--;  // so as the right element is greated than go as usual e--
            }
            // so as if these not satsify any of the above case then we have to take tha other case in it
            // so we wil swap the number both of it
            while (s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
                // so both number are being swapped
                // now we have to do the redursion call
                // these are the two half of the array as the start will come to the mid se annge so start and high with
                // the first part of the array  and the left side is tha e and low as tha e comes the left side of the mid
            }
        }


        quicksort(arr,low,e);
        quicksort(arr,s,high);
    }
}
