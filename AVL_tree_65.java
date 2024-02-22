public class AVL_tree_65 {
    // so here we will learn about the self balancing binary tree is know as the avl tree so now i have written in the
    // copy how it is get balanced so now writing the code part only
    public static void main(String[] args) {
        AVL tree = new AVL();
        int[] nums = {3,3,7,47,56,44,9,7,1,4,77,99,11};
        tree.populate(nums);
        tree.display();
        System.out.println(tree.isBlance());
        // we can see that if we don't apply the rotate then it's gives the false
        // when we apply rotate then is balance is giving the true here
    }

}
class AVL{
    private class Node{
        Node node;
        Node left;
        Node right;
        int value;
        int height;
        public int getValue(){
            return this.value;
        }
        // so now defing the constructor
        public Node(int value){
            this.value = value;
        }
    }
    // so writing down the node root
    private Node root;
    // so writing down the main constructor
    public AVL(){

    }
    // so now we have to write the different fucntion
    public void display(){
        display(root , "root node ");
    }
    private void display(Node node , String indent ){
        if(node == null) return;
        System.out.println(indent + node.value);
        display(node.left ,"this is the left child of " + node.value +" : ");
        display(node.right , "this is the right child  of " + node.value +":");
    }
    public boolean isEmpty(){
        return root == null;
    }
    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }
    public boolean isBlance(){
        return isBlance(root);
    }
    private boolean isBlance(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <=1&& isBlance(node.left) && isBlance(node.right);
    }
    public void insert(int value){
        root = insert(value , root);
    }
    private Node insert(int value , Node node){
        // so now if this is null then at that place we have to add the value
        if(node == null){
            node = new Node(value);
            return node;
        }
        // so now if it is smaller then we have to insert in the left side
        if(node.value> value){
            // so value is smaller so
            node .left = insert(value, node.left);
        }
        if(node.value < value){
            node.right =  insert(value , node.right);
        }
        node.height = Math.max(height(node.left) , height(node.right))+1;
        // so now in the avl tree we don't have to return node but inspite of that we have to do rotate the node
//        return node;
        return rotate(node);
    }
    public Node rotate(Node node){
        // so here we have to apply all the rotate cases here that we have to check here all of it
        if(height(node.left) - height(node.right) > 1){
            // so for the case left is heavy so in that case
            if(height(node.left.left) - height(node.left.right)>0){
                // so now it means that it is the first case out here left left case
                return rightrotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // so it is the left right case so here first we have to leftrotate the node.left then right rotate
                node.left = leftrotate(node.left);
                return rightrotate(node);
            }
        }
        // so now we have to deal with the right heavy case here
        if(height(node.right) - height(node.left)> 1){
            // so it means the right heavy case
            if(height(node.right.right) - height(node.right.left) > 0){
                // so it the right right case so we have to do the left rotate here
                return leftrotate(node);
            }
            if(height(node.right.right) - height(node.right.left) < 0){
                node.right = rightrotate(node.right);
                return leftrotate(node);
            }
        }
        return node;
    }
    public Node rightrotate(Node p){  // as we are taking p as the rotating point here so
        Node c = p.left;
        Node t = c.right; // as left of c remian the same and right of p remain the same
        // so now for the rotating part
        c.right = p;
        p.left = t;
        // now update the height here
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;  // as c become the main node that's why
    }
    public Node leftrotate(Node p){
        // so now similary for the right rotate
        Node c = p.right;
        Node t = c.left;
        // so now changing it
        c.left = p;
        p.right = t;
        // now again updating the height
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
}
