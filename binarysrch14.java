import javax.swing.table.JTableHeader;

public class binarysrch14 {
    public static void main(String[] args) {
        // now we will learn about the binary search so in this  we work with the middle element
        // so in this middle walle element se ham log ka har kaam hota hai
        // so notes for this is in
        // "C:\Users\ashoka\Desktop\JAVA kunal kushwaha\photo_2023-06-18_02-23-19.jpg"

        // now lets check the program on the different arrays
        int [] ar1 = { 3,3,3,3,3,3,3,3,3,3,};

        int [] ar3 = {1,2,4,5,7,8,9,13,15,17,18,19};
        int [] ar4 = {19 ,18,17,15,13,9,8,7,5,4,2,1};
        int target = 15;
        int ans = orderAgonisticBS(ar3,target);
        int ans2 = orderAgonisticBS(ar4,target);
        System.out.println(ans);
        System.out.println(ans2);

        System.out.println(binary(ar1,target));

        System.out.println(binary(ar3,target));
        System.out.println(binary(ar4,target));

    }
    static int binary(int[] arr ,int target){
      // so now in this we are writing the code for the arrray searchin algorithim
        // so now first we have to check the whether the array is of the ascending or desecnding order so for that
        // comapere the first element with the last elemnt so now
        int start = 0;
        int end = arr.length -1;
//        int mid = (start) + (end - start)/2;   // andar llikh ise lawde bc

        if (arr[start] < arr[end]) {
            // so the array of the ascending order so now doing the algorithim
            while(start<=end){
                int mid =  start + (end- start)/2;

                if (arr[mid]<target){
                    start = mid+1;
                }
                else if (arr[mid]>target) {
                    end = mid -1;

                }
                else{
                    return mid;
                }
            }

        }
        else if  (arr[start]>arr[end]){
            // so it means the array is of the desecnding order so now it means the greatest elemtn on the starting siede
            // so now it works opposite to the above so in this
            while (start<=end){  // this conditon as wo tab tak hi chek karega jab tak start end tak na pauche agar start hi end se greater
                // ho jayega to wo bich me milkar ek dusrne ko overlaaap kar lenge
                int mid = start+ (end - start)/2;

                if(arr[mid]> target){
                    start = mid +1;
                }
                else if (arr[mid]<target){
                    end = mid -1 ;
                }
                else{
                    return mid ;
                }


            }
        }

        return -1;

    }
    // writing the more precise and better short code for the program
    static int orderAgonisticBS(int[] arr , int target ){
        int s = 0 ;
        int e = arr.length-1;
//        int mid = s + (e-s)/2;   //  bsdk ye chezz to tune bhar likh kar fix kar diya tha lawde
        // nwo if we have to check the order
        boolean isAsec = arr[s]<arr[e]; // so ye ascending order ke liye true return karga and desecding ke liye false

        while (s<=e){
            // now common case bhar hi likh dete hai so in that
            int mid = s + (e-s)/2;
            if(arr[mid]== target){
                return mid;
            }
            if(isAsec){
                if(target>arr[mid]){
                    s = mid +1;
                } else {
                    e = mid-1;
                }
            }
            else {
                if(target<arr[mid]){
                    s = mid +1;
                } else  {
                    e = mid-1;
                }
            }
        }
        return -1;

    }

}
