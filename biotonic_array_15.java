public class biotonic_array_15 {
    // so in the biotonic array the array is arranged in such a way that it first start increasing then it after sudden
    // element it again start decerising so in the middle their is a greatest number which has the so this is how the bi
    // biotonic problem or the mountian arrays problem is i willl give the link of the leetcode of the problem



    //  https://leetcode.com/problems/peak-index-in-a-mountain-array/




    public static void main(String[] args) {
        /*
        Input: arr = [0,2,1,0]    so the greates element is the 2 at index no 1
         so this is how we have to solve the question  so in this problem hame isse
         mid element le lo pahle se then after that hame 2 case bana kar check karna padega as isme ascending and
         decinding order dono ke problem hai and hamre pass koi target element bhi nahi hai so we have to do like
         mid elemnt search kar liya
          now wo mera potential answer bhi ho sakta hai par ham uske annge and piche bhii chekk karna padega so for that
          case 1 :
          mid > mid +1
          so now ham decing part of the array me hai so ye mera potential array bhi ho skata hai so ham
          end = mid par update kar denge takki apne left bhi check kar le
          case 2 ;
          so now if mid < mid +1
          so ham log increasing part of the array me aagaye  so her e
          start = mid +1 as hame upar bas end use kiya hai to last me satart and end same par aayega us chiz ko hone ke
          liye ham log mid +1 liye hai bas

           so at last dono hi return karega same elemnt so kuch bhi return kara do

         */
    }
    static int PeakIndexinMountainArray(int[] arr ){
        int start = 0;
        int end = arr.length-1;
        while (start<end){  // now greater than or equal to as it strictly increasing or decerising
            int mid = start +(end - start)/2;
            if (arr[mid]>arr[mid+1]){
                // so now we can see we are in the decing part of the array so end = mid   and yaha ham greatet than use kiye bas as array
                // strictyly increasing or decering hai
                end = mid;
            }
            else {
                // so now else case me array increasing hua so now
                start = mid+1;  // yaha mid +1 lagega warna code to time complexicity error de raha hai 
            }
        }
        return start;
    }
    /*
    so now in these question if their is a target element we have to search for then we can do that also as we have find
    the peak inndex so now usse compare the target element so agar elemnnt bada ya chota uss hisab se usse the binary
    search so that we can solve it

     */
}
