package secondry;

import java.util.*;

public class rough6 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,1,4};
        System.out.println(subsetsWithDup(arr));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        // so now befor doing this first chekc the solution of the subset 1 question which i have well explained that
        // https://leetcode.com/problems/subsets/solutions/4776985/well-explained-recursion-and-backtrakign-appprach/

        // so now hrere is the solution we will add all of the elmnet in the set for this
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        // so now calling heper which will store all of my value here
        helper(0 , nums , res , curr);
        // so now here we have to return in the list here
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> temp : res){
            ans.add(temp);
        }
        return ans;

    }
    static void helper(int i , int[] arr , Set<List<Integer>> res , List<Integer> curr){
        // so now here the base case
        if(i == arr.length){
            List<Integer> temp = new ArrayList<>(curr);
            // so now here we have to sort the temp
            Collections.sort(temp);
            res.add(temp);
            return;
        }
        // so now here for the other case here
        curr.add(arr[i]);
        // so helpere which include the function
        helper(i+1 , arr , res , curr);
        // so now backtraking here which remove the case here
        curr.remove(curr.size()-1); //so removing each element from the back here
        // so now here the case without including that value here
        helper(i+1 , arr , res , curr);

    }

}
