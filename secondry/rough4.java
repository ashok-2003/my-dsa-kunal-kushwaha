package secondry;

import java.util.Arrays;

public class rough4 {
    public static void main(String[] args) {
        int count = 0;
        int[][][] arr = new int[2][2][2];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0][0].length; k++) {
                    arr[i][j][k] = count++;
                }
            }
        }
        System.out.println(count);
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0][0].length; k++) {
                    System.out.println(arr[i][j][k]);;
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    public static String longestCommonPrefix(String[] str) {
        int len = str.length;
        int i = str[0].length()-1;
        // so now here it len has been decided here
        int j = 0;
        while(i >= 0){
            // so now here we have to take the
            String s = str[0].substring(0 , i);
            // so now here we have got the value of the string so now here we have to check
            for(int k = 0; k < str.length; k++){
                if(str[k].contains(s)){
                    j++;
                }
            }
            // so now here after this loop if
            if(j == len){
                return s;
            }
            else{
                j = 0;
                // so we have reset the value of j for the next round
            }
            i--;
        }
        return "";
    }

}




