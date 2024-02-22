import java.util.Arrays;

public class cyclic_sort_21 {
    // so now this is cyclic sort iska complexicity o(n) hota hai
    /*
    isme hame elemnt 1 to n diye rahte hai yahi iski khasiyat hai isme element 1 to n honge so ham guess kar lenge ki
    isme cyclic sort ka use hone walla hai that's how
    now iska working ye hota hai ki ham element ko check karte hai i = 0 se start karke and usko uske sahi index walle
    se swap kar dete hai now jo number swap hua usse again check karte hai hamlog until wo number par uska sahi index
    na aa jaye agar us number par uska sahi index aa jaye to i++ hoga so taht's how it will work
     */
    public static void main(String[] args) {
        int[] arr = {5,2,7,1,4,3,6};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic_sort(int[] arr ){
        // now ham ayya intiger 1 to n le rahe so integer ka index apne value se ek chotta hi rahega
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

    }
    static void swap(int[] arr , int first , int second ){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
