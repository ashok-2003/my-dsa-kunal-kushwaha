import java.util.Arrays;

public class backtracking_43 {
    /* so now in  the previous problem we have seen that we are only moving in the right and down direction
     not all direction this becuase it will do the stack overflow as it will move out in the loop of some
      like it will go down then up the go down and up so this is how it will stuck in the loop that will
      result in the stack overflow so for this thier is a way whihch is know the backtraking */


    // so now discussing the solution in this case

    /*
    so now for this not happen we have to do one thing jab ham jis path se ham gaye ham uss path ko false karte
    jaynge so this will not go in that path  so now thier is a problem in like for tht other run what will happen
    as it is mark as false so for this when we are returing back to the recusion call so we have to revert the
    change so this will not interefer with the other call
     */
    public static void main(String[] args) {
        boolean[][]  arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        maze("",arr,0,0);
        int[][] path = new int[arr.length][arr[0].length];
        mazepathcount("",arr,0,0,path,1); // taking intial step as 1
        // so is this best exmaple of the bactraking here

    }
    static void maze(String p , boolean[][] arr , int row , int col){
        // so now if have to run the case
        if(row == arr.length-1 && col == arr[0].length-1){
            System.out.println(p);
            return;
        }
        // so now for if it is false then we have to skip the path
        if(arr[row][col] == false){
            return;
        }

        // now here making the backtraking call here so making the false the pevious one when we are entering the
        // the recusion call here so we are making the false case to each
        arr[row][col] = false;
        // now for the row
        if(row<arr.length-1){
            // so as the row changes then it will give the answer to down
            maze(p+'D',arr,row+1,col);
        }
        if(col<arr[0].length-1){
            maze(p+"R",arr,row,col+1);
            // this is making the right call
        }
        if(row > 0){
            // so this will make the up call as the row ko > 0 hona hai iss case me
            maze(p+'U',arr,row -1 , col);
        }
        if(col> 0){
            // so this will make the left call as here col will be limit
            maze(p+'L',arr, row , col-1);
        }

        // now when we are execting the recusrsion so we are reverting our changes
        arr[row][col] = true;
        // so this is how it is working in it
    }
    // so now what we want to return the path it want to follow so  for that we will make the count and int arr in 2d
    static void mazepathcount(String p , boolean[][] arr , int row , int col,int[][] mat , int step){
        // so now in this we have to make the run with the step count in the arr and step
        if(row == arr.length-1 && col == arr[0].length-1){
            // so now reutring the 2 d arr
            mat[row][col]= step;
            for(int[] out : mat){  // so now this is the best way to print the 2 d matrix as
                // this line means that for single array out in the mat 2d matrix we have to print it
                System.out.println(Arrays.toString(out));
            }
            System.out.println(p);
            System.out.println();// for the extra line when each exucted
            return;
        }
        // so now for if it is false then we have to skip the path
        if(arr[row][col] == false){
            return;
        }

        // now here making the backtraking call here so making the false the pevious one when we are entering the
        // the recusion call here so we are making the false case to each

        arr[row][col] = false;
        mat[row][col] = step;   // so we are updating the value of step in the array
        // now for the row
        if(row<arr.length-1){
            // so as the row changes then it will give the answer to down
            mazepathcount(p+'D',arr,row+1,col,mat, step+1);
        }
        if(col<arr[0].length-1){
            mazepathcount(p+"R",arr,row,col+1,mat, step+1);
            // this is making the right call
        }
        if(row > 0){
            // so this will make the up call as the row ko > 0 hona hai iss case me
            mazepathcount(p+'U',arr,row -1 , col,mat, step+1);
        }
        if(col> 0){
            // so this will make the left call as here col will be limit
            mazepathcount(p+'L',arr, row , col-1,mat, step+1);
        }

        // now when we are execting the recusrsion so we are reverting our changes
        arr[row][col] = true;
        mat[row][col]= 1; // so making it to the reset with the one as when the recusrion will return the end
        // so this is how it is working in it
    }
}
