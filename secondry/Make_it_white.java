package secondry;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Make_it_white {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(nextGreaterElement(n));
    }
    public static int nextGreaterElement(int n) {
        // so now here it should have the same digit in teh exting integer so now here if it should have no
        // digit left then we have to return the
        // so now here
        if(n < 10) return -1;
        // so now here we have to check if all of the number are in the good order so we have to return
        // the -1 again here
        String str = String.valueOf(n);
        // so now here we have taken the value so nwo
        // here
        int count = -1;
        for(int i = 1; i < str.length(); i++){
            if((int)str.charAt(i)-'0' > (int) str.charAt(i-1)-'0'){
                count = i;
                break;
            }
        }
        // so now here we have get the first index here so now
        if(count == -1){
            // so it means we can not retransfrom the string here so now
            return -1;
        }
        // so now in the other case we have to swap the value of that index in the string here
        // so now swap in the given index here
        String ans = swap(str , count , count -1);
        // so now we have got the desired string which will be my answer here

        return Integer.valueOf(str);
    }
    static String swap (String str , int a , int b){
        // so now here in the swappin it is not easy to swap with the character you think so nwo
        char[] ss = str.toCharArray();
        char temp = ss[a];
        ss[a] = ss[b];
        ss[b] = temp;
        return new String(ss);
    }
}
class k {
    boolean iscontain(int k , int[] arr1 , int[] arr2){
        int want = k/2;
        if(arr1.length < want || arr2.length < k){
            return false;
        }
        // so now other wise we have to add the element in the set here
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // so now here we have to add the element in the set if it is less than k
        for(int i : arr1){
            if( i <= k){
                set1.add(i);
            }
        }
        for(int i : arr2){
            if(i <= k){
                set2.add(i);
            }
        }
        // so now here checking the size of the set in this
        if(set1.size() < want || set2.size() < want){
            return false;
        }
        // so now combining both of the set in one set here
        // or we can add the all element of set 2 in the set 1 here
        for(Integer i : set1){
            set2.add(i);
        }
        // so now here all the element are added in the set 2 so now getting the sum of the all element here
        int sum = 0;
        for(Integer i : set2){
            sum += i;
        }
        // so now here we get the sum so now compare the sum with the original sum value
        int target = k*(k+1)/2;
        return sum == target;
    }
}