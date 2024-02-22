public class binary_search_tree_64 {
    // so here we will learn about the binary tree search so now first of all the see how dose the balnced tree mean
    // so blanced tree means that in which difference between the height of two node is more than 1 then tree is not
    // blanced their
    public static void main(String[] args) {
        // so now doing the binary tree here
        BTS tree1 = new BTS();
        int[] nums = {4,1,7,0,7,3,8,23,78,34,26,78,90,100,34,22,66,88,99};
        tree1.pupulate(nums);
        tree1.display();
        tree1.inorder();  // so return the result in the sorted order
    }
}
class BTS{
    // so now defing the constructor and node first of all
    private class Node{
        int value;
        Node left;
        Node right;
        int height;
        // so now making the constructr
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root; //so now we have created the root node
    public BTS(){
        // so this is the constructor created here
    }
    public boolean isEmpty(){
        return  root == null;
        // so this will return whether my tree is empty or not
    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isBlanced(){
        // so now this will return the difference between the left and righ node
        return blanced(root);
    }
    private  boolean blanced(Node node){
        // so now we will check for the
        // so the base case for it
        if (node == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && blanced(node.left) && blanced(node.right);
        // so now it will check for the all of this as this is the recursive call so base case is also here
    }
    public void display(){
        display(this.root , "root node :");
    }
    private void display(Node node , String  indent){
        // so now in this function this will display the value
        if(node == null) return;
        // so now here first time it will print the value of root node
        System.out.println( indent + node.value); // so it will print what it take as the indent
        display(node.left, "this is the left child of " + node.value + ":");
        display(node.right, "this is the right child of " + node.value+ ":"); // so here node.value will give the
        // root node for the first time
    }
    // so now here we will use the insert function
//    public void insert(int value) {
//        root = insert(value, root);
//    }
//    private Node insert(int value , Node node){  // as it will return the node here
//        // so here we have to insert the node in the tree
//        // so now if tree become null so their we have to create the new node and enter the value at that node and
//        // return the node
//        if(node == null){
//            // so create the new node
//            node = new Node(value);
//            return node;
//        }
//        // so now cheking for the left here
//        if(node.value > value){
//            // so as here value is smalller than the node value so it means is should go in the left
//            insert(value,node.left);
//        }
//        // if greater than we have to insert in the right
//        if(node.value<value){
//            insert(value,node.right);
//        }
//        // so we have to deal with the height
//        node.height = Math.max(height(node.left) , height(node.right))+1; // as it insert so we have to increase the height
//        return node;  // so at last we have to return the node for this
//    }


    // as this was not showing the correct answer it was only diplaying the single value so copied this
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    // so now what if we don't want to insert it by one to one so for that
    public void pupulate(int[] nums){
        //so now it will take nums as the insert in it
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    // so nwo in the binary search tree if we add the data in the the sorted order so it will create the skew tree
    public void populatesorted(int[] nums){
        populatesorted(nums , 0 , nums.length);
    }
    public void populatesorted(int[] nums , int start , int end){
        // so now first of all make the edge case
        if(start>= end) return;
        int mid = (start+end)/2;
        this.insert(nums[mid]); // so now it will make the tree blanced here
        populatesorted(nums , start ,mid);
        populatesorted(nums , mid+1 , end);
    }
    // so now we would do traversal of the different types like pre order post order and inorder
    public void preorder(){
        preorder(root);
    }
    private void  preorder(Node node){
        // so now as in the pre order we display
        // N -> L-> R->
        if(node == null) return;
        // this is the edge case here
        System.out.println(node.value + " ");
        // so now return left node
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        // so now we have to display inorder
        // L -> N-> R->
        // so we have to go in the end first of all
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.value + " ");
        inorder(node.right);
    }
    public void postorder(){
        // L -> R -> N ->
        postorder(root);
    }
    private void postorder(Node node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value + " ");
    }
}
// below is the kunal kushwaha bts class down their
//class bts {
//    public class Node {
//        private int value;
//        private Node left;
//        private Node right;
//        private int height;
//
//        public Node(int value) {
//            this.value = value;
//        }
//
//        public int getValue() {
//            return value;
//        }
//    }
//
//    private Node root;
//
//    public bts() {
//
//    }
//
//    public void insert(int value) {
//        root = insert(value, root);
//    }
//
//    private Node insert(int value, Node node) {
//        if (node == null) {
//            node = new Node(value);
//            return node;
//        }
//
//        if (value < node.value) {
//            node.left = insert(value, node.left);
//        }
//
//        if (value > node.value) {
//            node.right = insert(value, node.right);
//        }
//
//        node.height = Math.max(height(node.left), height(node.right)) + 1;
//        return node;
//    }
//
//    public void populate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            this.insert(nums[i]);
//        }
//    }
//
//    public void populatedSorted(int[] nums) {
//        populatedSorted(nums, 0, nums.length);
//    }
//
//    private void populatedSorted(int[] nums, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//
//        int mid = (start + end) / 2;
//
//        this.insert(nums[mid]);
//        populatedSorted(nums, start, mid);
//        populatedSorted(nums, mid + 1, end);
//    }
//
//    public void display() {
//        display(this.root, "Root Node: ");
//    }
//
//    private void display(Node node, String details) {
//        if (node == null) {
//            return;
//        }
//        System.out.println(details + node.value);
//        display(node.left, "Left child of " + node.value + " : ");
//        display(node.right, "Right child of " + node.value + " : ");
//    }
//
//    public boolean isEmpty() {
//        return root == null;
//    }
//
//    public int height(Node node) {
//        if (node == null) {
//            return -1;
//        }
//        return node.height;
//    }
//
//    public boolean balanced() {
//        return balanced(root);
//    }
//
//    private boolean balanced(Node node) {
//        if (node == null) {
//            return true;
//        }
//        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
//    }
//
//}