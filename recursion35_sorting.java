import java.util.Arrays;

public class recursion35_sorting {
    // so here we will learn different types of the sorting algorithim
    public static void main(String[] args) {
        int[] arr ={1,5,3,8,9,3,0,3,8};
//        bubble(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr , int r, int c){
        // it algrothim just work like the algorithim of the pattern question done earlier
        // int r is the length of the array
        // int c is telling the elment in the array
        /*
        so like row se number of the recursive count hoga ki kitna barr recursion work kare and in the c
        inner loop ki tarh work karega jo har baar sabse bada element ko last me le ayega so that's how its working

         */
        if(r == 0){
            return;
        }
        if(r > c ){
            if(arr[c]>arr[c+1]){  // swap program to swap the number for it
                int temp = arr[c];
                arr[c]= arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);
        }
        else {
            bubble(arr,r-1,0);
        }
    }
    static void selection(int[] arr , int last , int c , int max){
        // so now remember in the recursion we have to always pass in paramenter which vlaue will change
        // so for that in this sorting algo we have to pass and its comapere to the max value index wich get updated
        // in the max index
        if(last==0){
            return;
        }
        if(last>c){  // so this work when last > c when it get out of it then different work out here
            if(arr[c]>arr[c+1]){
                selection(arr,last,c+1,c);
            }
            else {
                selection(arr,last,c+1,max);
            }
        }
        else {// here we have to swap the max value which we get from the above one which exucted by the each loop
            int temp = arr[last-1];
            arr[last-1]= max;
            max= temp;
            selection(arr,last-1,0,0);
        }
    }
}
