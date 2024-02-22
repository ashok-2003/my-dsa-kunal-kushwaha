import java.util.Arrays;

public class countsort_75 {
    // so now here we will learn about the countsort so this is not too good
    // this can apply for the  sorter datatypes here only
    // here in the array we take the max element present in it then we just create a new array of length max +1 size
    // here so now we traverse over the array and count the time they are coming their of their index only
    // so now here is the thing if our array contins the negative element then we just can 't get the proper ans out it
    // so we are just creating the frequency array something like the hash for constant type of time

    public static void countsort(int[] arr){
        // so now it this arr we have to get the max element
        // here is the some of the edge case
        if (arr == null || arr.length<=1){
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt(); // so this will return the max value inside the array
        // so now we have to create the array of the size
        int[] countarray = new int[max+1];
        // so now as the array is being created so now we have to treverse in the main arra
        for (int num : arr){
            countarray[num]++;
            // so as here us index ki value zero se badh jayegi here
        }
        // so now we have stored the value so
        // now we can return new array or we can make changes in the same array so we are making changes in the same
        // array here so for that
        // defing the index which will be used in the arra
        int index = 0;
        for(int i = 0; i < countarray.length; i++){
            // so now here we have to do for the each index
            while(countarray[i] > 0){
                arr[index] = i;
                // so now store that value in the main array
                index++;
                // so main array index increases
                countarray[i]--;
                // so now value of that index decreases here
            }
        }
    }

    public static void main(String[] args) {
        int[] arr  = {1,4,2,3,6,8,4,9,7,0,4,6,3,7,6,11,7,22,9,6,8};
        countsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // similary we can do using the hasmap but i don't want to do that as that is not that useful
    // use tree or something inspite of that like tree or bts tree like that

}

