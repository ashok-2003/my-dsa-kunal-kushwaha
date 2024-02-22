public class segment_tree_66 {
    // so now we will create the segement tree here as now the whole explanation i have written in the copy out thier
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        segement_tree tree = new segement_tree(arr);
        tree.display();
        System.out.println(tree.querry(3,7));

    }
}
class segement_tree{
    private static class Node{
        // so now here node have start index end index left and right and the data
        Node left;
        Node right;
        int data;
        int startindex;
        int endindex;
        // so now here the constructor
        public Node(int startindex , int endindex){
            this.startindex = startindex;
            this.endindex = endindex;
        }
    }
    // so nwo creating the node out here
    private  Node root;
    // now constructor for the main function out here
    public segement_tree(int[] arr){
        // so now as segement tree takes the input out in it // so now we have to construct the segement tree
        this.root = construct(arr,0,arr.length-1);
        // so now we have to create the construct function which will create the tree of the segement
    }

    private Node construct(int[] arr, int start, int end) {
        // so now we have to run the recursion call here as with the base case when we reach the left node then we have
        // to update the data
        // otherwise we have to first created the node then take the mid then return the left and righ of it as we have
        // done
        if(start == end){
            // so this mean we are at the leaf data as start = end
            Node leaf = new Node(start,end);
            leaf.data = arr[start]; // so now here we have updated the value out here
            return leaf; // so atlast returnig the leaf
        }
        // so now creating the node
        Node node = new Node(start , end);
        // so now calculating the mid value
        int mid = (start+end)/2;
        // so now taking care of the left and right node
        node.left = construct(arr , start , mid);
        node.right = construct(arr , mid+1 ,end);
        // so now those two recursive node created
        // now updating the sum of both
        node.data = node.left.data+ node.right.data;
        // so now sum of both data updated in this
        // now returning the node
        return node;
    }
    // so now my tree is being created so now displaying the tree so for that
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        // so now creating the display function
        String str = "";
        // so now displaying the left node then the current node then the right node
        if(node.left != null){
            // so now this will display the left node
            str = str +"Interval is ["+ node.left.startindex +"to"+ node.left.endindex+"] and the data is " + node.left.data;
        } else{
            str= str+"their is no left child";
        }
        // so now displaying the current node
        str = str+" <| Interval is ["+node.startindex+"to"+node.endindex+"] and the data is"+node.data+" |> ";
        if(node.right != null){
            // so now here we have to display the right node
            str = str+"Interval is ["+node.right.startindex + "to" + node.right.endindex +"] and the data is "+ node.right.data;
        }else{
            str = str+"their is no right child";
        }
        System.out.println(str );

        if (node.left != null){
            display(node.left);
        }
        if (node.right != null){
            display(node.right);
        }
    }
    // so now for the qurrey part
    public int querry(int qsi, int qei){
        // so now its for the qrerry with the start index then qurrey end index here
        return this.querry(this.root , qsi , qei);
    }
    private int querry(Node node , int qsi , int qei){
      // so now we have to check if it is completly inside it or completly outside or overlapping
        // so now if it is completely inside it
        if(node.startindex >= qsi && node.endindex <= qei){   // here something wrong
            // so now its complety inside the data so
            return node.data;
        } else if (qei < node.startindex || qsi > node.endindex) {  // here we have to make it wisely
            // so its completely outside the qurrey data
           return 0;
        }
        else {
            return querry(node.left , qsi , qei) + querry(node.right , qsi , qei);
        }
    }
    // so now we have to update
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }
    // i have copied the update function so we have to chek it agian
    private int update(Node node, int index, int value) {
        if (index >= node.startindex&& index <= node.endindex){
            if(index == node.startindex && index == node.endindex) {
                // as it is at the leaf index so we have to udate the value
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }

}
