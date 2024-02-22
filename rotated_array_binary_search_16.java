public class rotated_array_binary_search_16 {
    // so in the rotated array earlier arrays was arranged sorted but then is get rotated like
    // { 1,2,3,4,5,6,7,8,9} gets rotated to the {7,8,9,1,2,3,4,5,6}  so this is rotated three times in the clockwise
    // direction that's how it works




    // so in this type of 2 apporaches works one to find the piviot which is the largetst elemnt in the arrays now one is the normal another one is the recurssion
    public static void main(String[] args) {
        /*
         now here how to find the piviot in the array of {7,8,9,1,2,3,4,5,6} so here the piviot is the 9 so we have to
         search it down so it will require the cases of many so like
         now the mid element is defind then now as this ararya contain 2 asecending array elemnts and at piviot only
         their is decening order of the element so now as at 9 and 1 its only decindinng onnly so thats how we can
         return that
         case 1 :   mdi < end ( ye lagna padega as kya pata mid hi last element ho array ka )mid element > mid +1 elemtn  so now this refers the decending order so retrun the mid element
         case 2 : if  mid element < mid -1  then return the mid -1 elemtnt the same thing kind of from the opposite side
         dono side se check karna pd raha as 2 arrays include ho gaye n
         case 3 :
         if start >= mid so now end = mid -1 kar denge ham
         case 4 :
         if start < mid element so now is range me nahi hai piviot nahi to wo hame pahel hi mil gaya hota upar walle case
         me so now return start = mid +1

         so now this will let us find the piviot index of the rotaoted array we have doen so


         */
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(piviotFind(arr));
        int [] arr2 = {1,2,3,5,6,7,8,9,10,23};
        System.out.println(piviotFind(arr2));
        // so ye normal array sorted me -1 de raha hai

        // so it returning the answer of the two  which is our answers
    }
    static int piviotFind(int[] arr ){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start/2);
            if( mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid -1;
            }
            else { // so it means start > mid so we are in the noramally sorted arrays where we can just ignore it
                start = mid +1;

            }
        }
        return -1;  // other wise return -1 which means jiska ham talsh kaar rahe wo nahi hai
    }
    // have doen the question of the leet code of this type in the question section of this
}
