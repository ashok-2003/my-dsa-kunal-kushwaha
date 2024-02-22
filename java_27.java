public class java_27 {
    /*
    so we have have doen the time and space complexicity in the copy and now we are doing the bitwise opereator
     */
    public static void main(String[] args) {
        //left shift   it doubles the number out their
        System.out.println(20<<1);
        // right shift half the number
        System.out.println(23>>1);  // it baiscally half the number
        // so this program will return true for the even number and false for the odd number
        System.out.println(odd_even(679989808));
        // so this program will tell us the unique element of the duplicate array
        int[] arr = {3,4,2,6,3,2,4};
        System.out.println(duplicate_arr(arr));
        // so if the number is repated 3 times the we will use this


        // this is not giving the answer don't know why  because we have to convert it into binary and see the number of
        // repetation thier which we are not able to see it so we can't do that
        int[] nums ={4,4,4,5,3,3,3,2,2,2,7,7,7,6,6,6};
        System.out.println(triplet_elemnt(nums));

        // this run the program for the magic number as we have seen here binary relate to to the 5 base 
        System.out.println(magicnumber(6));




    }
    static boolean odd_even(int n){
        return (n & 1) != 1;  // simplified the if else statment
    }
    static int duplicate_arr(int[] arr){
        // so here we have have the array in which element has its duplicate except the one number  so we use xor
        // operator so that we know a^a will  be zero so we can use it
        int input = 0;
        for (int i = 0; i < arr.length; i++) {
            input^=arr[i];
        }
        return input;
    }
    static int triplet_elemnt(int[] arr ){
        // so now that xor can be used for the when the number are reapated by even number only but what if the number
        // is repeted by the odd number like here if the number is reapted 3 time so we will use this method
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum % 3;
    }
    static int magicnumber(int n ){
        /*
        so this question has been asked in the amazon interview question the question is that
        ek number jo hai uska binary form 5 ke form se replace kar do
        like 1 == 5  yaha 5^ 1 se hi start ho raha hai
        2 == 25  as 2^1 in binary  so ye 5^2 ho gaya similary
        3 == 30 as of 25 + 5



        so for this like we can use the and operator like 2 ka & 1 0 hua so now 2 ka & 10 1 hua so we 5^2 se multiplie
        denge ans thus how it will total work
         */
        int ans = 0;
        int base = 5;
        while (n>0){
            int last = n & 1;
            n = n>>1;
            ans+= last * base;
            base = base*5;

        }
        return ans;
    }
}
