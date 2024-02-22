public class linearsearch12 {
    public static void main(String[] args) {
        //in linear search it finds linarly array from the 0 index and goes on ... till the index it find out that
        int[] arr = {23,56,75,7,5,4,6,46,45,675,75,56,75,7,5,75,};
        int target = 75;
        int ans = linearsearch(arr,target,4,9);
        System.out.println(ans);
        String str = "Ashok";
        char target2 = 'k';
        System.out.println(stingserch(str,target2));
        // for the max value
        System.out.println(minvalue(arr));

    }
    static int linearsearch(int[] arr , int target ,int start , int end ){  // so this for searching in the range we want
        if(arr.length==0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            if(arr[index]== target){
                return index;
            }
            //yaha ham retrun -1 kar rahe hai kyuki index kabhi -1 nahi ho sakta hai agar wahi ham elment ko return
            // krate to ham -1 ki jagah Intiger.MAXVALUE  return kar sakte hai
        }
        return -1;

        // smilary we can make that for the string me like ashok me o hai ya nahi ye pata karne ke liye so
        // string banane ke liye use string  and chartacter ke liye use char  and  sting me bs char ke liye use charAt
    }
    static boolean stingserch(String str , char target2){
        if(str.length()==0){
            return false;}
        for (int i = 0; i < str.length(); i++) {
            if(target2==str.charAt(i)){
                return true;
            }

        }

        return false;
    }
    static int minvalue(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }// on similar concept we can make for the max value also like that
}
