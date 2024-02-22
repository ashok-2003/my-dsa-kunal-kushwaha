import java.util.ArrayList;

public class maze_by_recusion_42 {
    // so in this thier is a problem in which like we have taken the matrix of 3 * 3 so now in that problem
    // so we have to return the way in which we can reach the target if we can move only down and right direction
    // so now we can solve this via recursion also like at each of the step it can move in right or down direction \
    // and when row and colum both equal to 1 we hve found the answer so now doing it
    public static void main(String[] args) {
        System.out.println(maze("",2,3));
        // so this prit out the total ways in which we can find  out way
        boolean[][]  maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeobstacle("",maze,0,0);

    }
    static ArrayList maze(String p , int row , int col){
        // so now the base condition here is the when both equal to one
        // note we forget you to remind that it can also move in digonal directon so make it recursion tree in the
        // copy for the better understanding so now doing it
        if( row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row > 1 && col > 1){
            ans.addAll(maze(p+'D',row-1,col-1));
        }
        if(row > 1){
            ans.addAll(maze(p+'R', row -1 , col));
        }
        if(col>1){
            ans.addAll(maze(p+'d',row , col-1));
        }
        return ans;
    }
    static void mazeobstacle(String p , boolean[][] arr , int row , int col){
        // so here let suppose that their is the obstacle in the path where we can not go if we take path on it so
        // now for this we have to end the recursion call of it when the our code hit at the obstacles
        if( row == arr.length -1 && col == arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(arr[row][col] == false){
                return;
        }
        if(row<arr.length-1){
            mazeobstacle(p+'R',arr,row+1,col);
        }
        if(col<arr[0].length-1){
            mazeobstacle(p+'D',arr,row , col+1);
        }
    }
}




