import java.util.Arrays;

public class selection_sort_19 {
    /*
    so now in selection sort isme ham sabse bade element ko lete hai and usse ham last index par swap kar dete hai
    so now iski complexicity o(n*n) hota hai har case me as ye elemnt utta kar dall raha hai
    now ye unstable bhi hai isme order bhi change ho saktea hai
    ye good hai bas choote wallle list of element par
     */
    public static void main(String[] args) {
        int[] arr = {2,1,4,7,5,2,6,3,75,-1,5,8,9};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection_sort(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int max = maxiumelmt(arr,0,last);
            swap(arr,max,last);

        }

    }
    static void swap(int[] arr , int first , int second ){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
    static int maxiumelmt(int[] arr,int start,int end  ){
        int max = start;
        for (int i = start; i < end; i++) {
            if(arr[i]>max){
                max= i;
            }

        }
        return max;
    }

}