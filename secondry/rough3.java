package secondry;

import java.util.ArrayList;
import java.util.List;

public class rough3 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,1},{1,0,0,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numSpecial(arr));
    }

    public static int srch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        // so now doing the binary search here
        while(end >= start){   // should  be equal to also as both can came at same index what if
            // ans at the first index here
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]> target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int numSpecial(int[][] mat) {
        //  so this question can be solved if we get the sum of it == 1 then count ++ \
        int count = 0;
        for(int row = 0; row < mat.length; row++){
            int sum1 = 0;
            int sum2 = 0;
            for(int col = 0; col < mat[row].length; col++){
                sum1 += mat[col][row];
                sum2 += mat[row][col];
            }
            if(sum1 == 1 && sum2 ==1) {
                count++;
            }
        }
        return count;
    }
    public String destCity(List<List<String>> paths) {
        //solve this
//        https://leetcode.com/problems/destination-city/?envType=daily-question&envId=2023-12-15
        // so here it contains two list here
        String ans = paths.get(0).get(1);  // so that's how we get the value of it

        return ans;
    }
    public boolean isAnagram(String s, String t) {
        // so for this we have to store all of the caracter of s and t in one
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> t1 = new ArrayList<>();
        // so now adding the elment
        while (!s.isEmpty()){
            s1.add(s.substring(0,1));
            s =s.substring(0);
        }
        while (!t.isEmpty()){
            t1.add(t.substring(0,1));
            t = t.substring(0);
        }
        // so now how we can compare these two strign
        return false;
    }

}


