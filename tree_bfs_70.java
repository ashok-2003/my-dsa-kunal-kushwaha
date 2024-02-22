import java.util.LinkedList;
import java.util.ArrayList;
import java.util.*;
public class tree_bfs_70 {
    // so here we are learnign about the breadth first search which is also called as the search by the level here so
    // in this we have to do it by the leavel this is explained in the kunal kushwaha tree question video and written
    // on the copy so check that out
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // so this is the quesion of the breadth first apporach so we have to do
        // we have to store the data in the ques like it have first in first out
        // creatating the list
        List<List<Integer>> out = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();   // as we have to make the que of of the node
        // type so we made the tree node type so now
        // base case
        if(root == null) return out; // so it reutrn out when the root is nulll
        // so now here is the main part
        que.add(root); // so now root is added now
        while(!que.isEmpty()){
            // so now here create a list which will store the value of the current level
            List<Integer> list = new ArrayList<>();
            // so now we have to run a for loop which will acculumante the value of node that ques have for
            // taht level
            int len = que.size();
            // so now ruuning the loop
            for(int i = 0; i < len; i++){
                TreeNode currnode = que.remove();
                list.add(currnode.val);
                // so now we have to add the element inside of it of the down level of the que
                if(currnode.left != null) {
                    que.add(currnode.left);
                }
                if(currnode.right != null){
                    que.add(currnode.right);
                }
                // so this is how we have added the next node here
            }
            out.add(list); // so we have added the list in the main list here
        }
        return out;
    }
}
class google{
    // so here was the question asked in the google in which we have
    // level order successor question in which question is that at that level we have to return the next righ node
    // like as we do in bfs so we have to return the next right node of it and if it is at the end then
    // we have to return the one below level node at that point
    public static int  levelorder(TreeNode root , int target){
        // so now here we have to do the same thing but we have to add the
        Queue<TreeNode> que = new LinkedList<>();
        int ans = 0;
        if(root == null) return ans;
        // so now
        que.add(root);
        while(!que.isEmpty()){
            // so now again doing the for loop

            // we acutually don't need the for loop here also as like here we don't have to print the level and not
            // also we have to gave the sum
//            int len = que.size();
//            for (int i = 0; i < len; i++) {
                TreeNode node = que.remove(); // so now this taking the
                // now adding the child before cheking it
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                if(node.val == target){
                    // so now we have to reutrn the next node value as the answer
                    TreeNode curr = que.remove();
                    ans = curr.val;  // so now givign the value
                    break; // and break the loop here
                }
//            }
        }
        return ans;
    }
    // space complexicity of this question is o(n/2) as in the ques maximux n/2 element get added 
}
