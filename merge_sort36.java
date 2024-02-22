import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class merge_sort36 {
    /*
    so in the merge sort thier are let say two array then both array get sorted then at last both array get sorted in
    one array so they get merge

    note when we do the merge sort by the recursion then orginal array is not being modifided but new array is
    being created which stores the value of it




    their is also one inplace merge sort which sort the array in the way in which original array is being modifed
     */
    public static void main(String[] args) {
        int[] arr = {6,9,2,5,3,73,7,6,4,8,4,85,7,5,7,57,5,7,67,7,66,666};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] mergesort(int[] arr ){
        /*
        so in this is the recursion call merge sort so now the elment of the arrys are sorted by dived and merge
        techiniques so in this mid se array left and right me diveide ho jata hai and wo recursion call ko exucute
        karta hai until wo single element me change na ho jaye tab tk it will do the same thing so now after that
        wo array singel elemnt me change hokar sorted manner me merge ho  jate hai so now writing the conditon for each
         */
        if(arr.length == 1 ){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid)); // so now these function used to create the copy of
        // the orginal array to the index we want it for
        int [] rigth = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        // so at last after we will merge left and the rigt arrya


        return merge(left,rigth);  // this is the another function created which will merge the array in the sorted aray
    }

    private static int[] merge(int[] first, int[] second) {
        // so in this method thier will be two sorted array and we have to merge them into a single one the sorted
        // manner so for this we will run the two pointer one in one array and compare the elemment in that array
        // to the other element of the other now the elemtn which will be smaller will be stored in the new array and
        // that pointer move ahead by the one again compare the elemnt as previous
        int [] arr = new int[first.length+second.length];
        int i =0;
        int j = 0;
        int k =0;
        // these are the index for the first array and second array and the manin array
        // so now we will compare it only when both of two are in its bound
        while (i<first.length && j<second.length){
            if(first[i]<second[j]){
                // so as the firs is smaller so it should be stored so now taking it
                arr[k] = first[i];
                i++;
            }
            else {
                arr[k]= second[j];
                j++;
            }
            k++; // so in each case k will grow it value
        }
        // now it may be possible that any of array is larger than other so array do not reach it's limit so for
        // if still i<first.length or apply for the second then also
        while (i<first.length){
            arr[k]=first[i];
            i++;k++;
        }
        while (j<second.length){
            arr[k]=second[j];
            j++;k++;
        }
        // so either one of them will exucted if both array are not of the same size

        return arr;

    }
    /*
    so now let's see how over all it worked merge sort on a single array so nwo it take an array and then it divided
    into two parts from the middle and do recursion call until the elment became the single element so now after that
    it call the merge function to merge the two array within it as we can see in its algo so thus how the merge sort give
    the elemnts out of the array in the sorted mannner

    so now the time complexicity of it is
    o(n*logn) and space complexicity is o(n)
     */
}
