import java.util.Arrays;

public class insertion_sort_20 {
    // so in the insertion sort
    /*
    so in the insertion sort ham pahle ham 2 element ko lete hai usse sort karte hai
    then ab 3rd elemtn ko last index se compare karge then agar wo chotta hai to usse uske sahi position
    par insert kar denge ham log so ab 3 elemnt sort ho gaya so aise hi ham karte rahe increse kar ke
    4 elemtn sort honge then 5 element sort honge then so on and so on aise hi
     */
    public static void main(String[] args) {
        /*
        now its complexicity varies from o(n) to o(n*N) good to worse
        so iske and bubble me farak kya hai so isme no of swap kam karna padtahia as
        ham element jo compare kiya agar wo already sort ho sakta hai
        like hamne array me 1 2 3 ko sort kar rakha hai now 4th element hi 4 hai
        so 1234 direct ho jayega bina kisi swap ke hi
         */
        int [] arr = {1,4,7,4,8,49,-1,-34,-657,4,7,0};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr ){
        for (int i = 0; i < arr.length-1; i++) {  // yaha arr.length out of bound chala jayega so -2 toatal karna padega as ham j+1 kar rahe taht's why
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;  // coz hame uske andar check karne ki jarurat hi nahi hai wo pahle se hi apne right
                    // jagah par hai as ham usko apane sorted se last se to comapre kar liye wo usse bada hai so
                    // rest se bhi to bada hi hoga wo definitely that'why this happens
                }
            }

        }
    }
    static void swap(int[] arr , int start , int end ){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]= temp;
    }
    // so this sorting method is also stable and good better than bubble sort as requrie less no of the steps than that
    // and works very well on samll list and when packet of arrays is sorted works well 
}
