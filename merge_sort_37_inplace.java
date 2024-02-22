import java.util.Arrays;

public class merge_sort_37_inplace {
    /*
    so here we gonna to learn the merge sort inplace form so as like merge sort using the recursion we have seen
    that we are creating the array at each step and we are not modifiying the original array so we have to now
    modify the origina array we can apply the same apporaches by passing the start end value so it don't create the
    new array so now
     */
    public static void main(String[] args) {
        int[] arr = {5,6,5,6,5,3,8,6,866,56,777,85,74,5,};
        meregesortINPLace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void meregesortINPLace(int[] arr , int s, int e){
        // these s and e represent the value of start and end

        if(e-s == 1){
            return;  // ye represent kar raha length of the array
        }
        int mid = (e+s)/2;  // these should be added 
        // so now for the left and right part we have to do thing for it too
        meregesortINPLace(arr,s,mid); // so this represent the left side of the array
        meregesortINPLace(arr,mid,e);  // this represent the right side of the array
        // now we have to merge the both array so in the same array so we take the arrya start mid and end
        mergeInplace(arr ,  s ,mid , e);
    }
    static void mergeInplace(int[] arr , int s , int mid , int e ){
        // so now in this type of the mergeinplace we have to work in same array by assumin them as two different array
        // so one pointer start at index start and other at mid
        int[] mix = new int[e-s];   // so this mix take 0(n)complexicity in the space
        int i = s;
        int j = mid;
        int k = 0;
        while (i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]= arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            mix[k] = arr[i];
            i++;k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;k++;
        }
        // so now these values are get stored in the mix array so now we have to update it in the main array
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];  // s + l because as in the aray we have to update the value not from the starting so that's why
        }
    }
}
