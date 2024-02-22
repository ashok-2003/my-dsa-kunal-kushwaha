import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class tree_dfs_71 {
    // so now we have done the many question of the  depth first serach question just go and watch
    // the leetcode striver sheet most of the question are done thier
    // so now we will do a question of the
    // dfs


    // so now as we have done the dfs using the reucrsion now we will do the using the iterative program
    // that is using the stack in dfs here

    // so now we add the root node first then after that as we are using the stack add the right element and
    // left child as right and left child has been added so now remove the left child and take it then print it
    // now again add the right and left element of it so do the same apporach so thus how we can do this all here
    static void sttak(TreeNode node){
        // so if node is null return null
        if(node == null) return;
        // so now here creating the stack here
        Stack<TreeNode> stk = new Stack<>();
        // so now we have to add the the value here
        stk.push(node);
        // so now
        while (!stk.isEmpty()){
            // so now here
            TreeNode removed = stk.pop();
            // so now we have to print this node
            System.out.println(removed.val + " ");
            // so now we have to add the right value
            if(removed.right != null){
                // so now we have to add the right node as this is stack so to make the left above we have to add
                stk.push(removed.right);
            }
            if(removed.left != null){
                stk.push(removed.left);
            }

        }
    }
}



//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
// dont 't need this as we have already in the bfs

class question1 {
    // so now here
    // the question is we have to find whether path exits or not  form the root to the leaf here
    // we have given it in the array so now that's the question
    public boolean ispath(TreeNode root , int[] arr){
        // so now here is the main soultuion that we have to compare
        if(root == null){
            return arr.length == 0;
        }
        return helper(root , arr , 0);

    }
    public boolean helper(TreeNode node , int[] arr , int level){
        // so now here we have definded the level here
        //now the main case if it is the last elment of the array and it is the leaf node then reuturn true
        if(level == arr.length-1 && node.left == null && node.right == null){  // so now here if level ka value hi
            // array ka last index tk hua hai so wo to true hi rahega
            // as niche walle case me ham dikha hi rahe hai array ka index == node value ho raha hai ki nahi
            return true;
        }
        // so now in the other case
        if( level >= arr.length ||arr[level] != node.val){
            return false;
        }
        // so now we have to return the both left and right side of the case here
        return helper(node.left , arr , level+1) || helper(node.right , arr , level+1);
    }






    // so now here is one another question that i dont't
    // understand properly so now do it agian vro
    // please revise it 

    int countPaths(TreeNode node, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }
    int helper(TreeNode node, int sum, List<Integer> path) {
        if(node == null) {
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int s = 0;
        // how many paths I can make
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            s += itr.previous();

            if (s == sum) {
                count++;
            }
        }

        count += helper(node.left, s, path) + helper(node.right, sum, path);

        // backtrack
        path.remove(path.size() - 1);
        return count;

    }

    // put in a list
    List<List<Integer>> findPaths(TreeNode node, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(node, sum, path);
        return paths;
    }
    void helper(TreeNode node, int sum, List<Integer> path, List<List<Integer>> paths) {
        if(node == null) {
            return;
        }

        path.add(node.val);

        if (node.val == sum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            helper(node.left, sum-node.val, path, paths);
            helper(node.right, sum-node.val, path, paths);
        }

        // backtrack
        path.remove(path.size() - 1);
    }
}
