import java.util.Arrays;

public class bublle_sort_18 {
    // so now we are learing about the sorting algorithim so in it we have to sort the array now how it works ?
    /*
    so in this hame for loop me for loop chalte hai ye har baar me ho bada element hoga usko right side shift
    karta jayega so in this ham swap ka use karnge agar number bada hai to right me swap kar denge
    nahi to same as it si chood denge so now ye n times chalega like har baar isko work karna padega
    isme ek cheez hai ki har baar last me elemnt sort hokar jata rahega so ham andar walle for loop ka no of steps kam
     kar sakte hai  so that how bubble sort algo works so now we have to write code for this
     */
    public static void main(String[] args) {
        /*
        now iski complexicity kya hai so for the complexicity time and space dono dekhna hai so in
        space complexicity wo yaha 0(1) hai as ham yaha koi extra space nahi use kar rahe nahi koi extra cheez create
        kar rahe hai so space 1 hua now about the time complexicity so
        good case me o(n) ho raha and worst case me o(n*n) hoga
        now good case me array already sorted hoga so ham chate hai usme function ek barr se jayda na chale so uske
        liye ham use karnge break statment ka
         */
        int[] arr ={3,1,5,7,4,7,4,57,98,4,7};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void bubblesort(int[] arr ){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            // so ye external loop hua jo ki n times chalega now iska andar walla loop bhi cahalne hai yaha swap flase hog
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    // so now hame inhe swap karna hai j-1 greater hai
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }

            }
            // so now agar wo loop me koi change nahi hua to arrya already sorted hai so ham break kar denge
            if(swapped == false){
                break;
                // so now wajah se best case me complexicity o(n) hogi nahi to loop har barr run karta
            }

        }
    }
    // bubble sort is stable sort as the position remains same mann lo ek elemtnt treated as ball and
    // uska diffret  clolor hai so jis color me wo arranged the ussi me rahenge waps
}
