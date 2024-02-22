package secondry;
import java.util.*;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Stack;

public class rough5 {
    public static void main(String[] args) {
        int[] arr = {4,12,2,7,3,18,20,3,19};
        int ladders = 2;
        int brick = 10;
        System.out.println(furthestBuilding(arr , brick , ladders));
        String s = "-0.1";
        System.out.println(Integer.valueOf(s));
    }
    public static int furthestBuilding(int[] arr, int bricks, int ladders) {
        // so now the apporache we have f ound in the descrption is that
        // we maintain a priority ques in which we will write the gap into that and then we will
        // be the greedy to apply ladder always then when we find out that we will out of the ladder
        // then we will use the bricks instead of the ladder and thus the algo is
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // so now here we have to take the diffrence always here in the the array
        int count = 0;
        int i = 1;
        while(i < arr.length){
            int gap = arr[i] - arr[i-1];
            // so now here if the gap is negative then we can just move without any issue here
            if(gap <= 0){
                count++;
                i++;
            }else{
                // so now gap is positive so now here we will use the ladder first
                if(ladders != 0){
                    ladders--;
                    count++;
                    i++;
                    // now we have to store the gap value in the heap also for the track
                    pq.offer(gap);
                }else{
                    // so now it means the ladder is empty so now here we have to to take out from the
                    // bricks here
                    if(bricks != 0){
                        // so now here we have to increase the ladder and takeout and fill the sortes gap here
                        if(!pq.isEmpty()){
                            int val = pq.poll();
                            // so now here we have to check if this value is smaller than the bricks or not
                            if(bricks >= val){
                                ladders++;
                                bricks -= val;
                            }else{
                                i++;
                            }
                            // other wise do the nothing here
                        }
                        // so now it means that the ladder are already the zero so we need to directy take
                        // care of the value here
                        else {
                            if (bricks >= gap) {
                                bricks -= gap;
                                count++;
                            }
                            i++;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        // so now here we have out i so now
        while(i < arr.length-1 && arr[i+1] < arr[i]){
            count++;
            i++;
            // so now here so we have
        }
        return count;

    }
}

