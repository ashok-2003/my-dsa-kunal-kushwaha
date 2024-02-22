import java.util.Arrays;
import java.util.Scanner;

public class arraychange11 {
    public static void main(String[] args) {
        // so here we gonna to change and swap and all of the array
        Scanner in = new Scanner(System.in);
        int[] arr = {8,9,3,5,6};
        int[] arr2 = {2,5,6,43,2,5,25,3,4,};
        // now swap the 1st index with the  3 th index
        swap(arr,1,3);
        swap(arr2,3,6);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        // so now we can see this function is working
        System.out.println(max(arr, 0, 3));
        System.out.println(max(arr2, 5, 8));

        // now we have to swap the whole array means start wall end se swap ho jaye and aise hi ange badthe jayye apne app
        // so iska logic hoga ki start aur end dono ko le swap then start me ek + and end me - kare then again swap kare jab tak start ka value end se choota ho tab tak hi ye work kare ye merhod
//        System.out.println(reversearr(arr););  this statment does not work as jo data provide kar rahe wo not sufficient
        reversearr(arr);
        System.out.println(Arrays.toString(arr));

        // doen bc


    }
    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;
    }
    static int max(int[] arr ,  int start, int end){  // this will check the array in the some of the range proived
        int maxval = arr[start];
        for (int i = start; i <= end; i++) {  //note conditon me ham start value provide nahi kar sakte hai
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;   //givin error because we have used void so in void no return fumction is required
    }
    static void reversearr(int[] arr){
        int start = 0;
        int end = arr.length-1;  // as ek pahle hi katm ho jata hai so arr length par ye errroe message dega hame ye so
        while (end>start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
