import java.util.Scanner;

public class trees_intro_63 {
    /*
     so now we will study about the trees
     trees is the most asked topic in the interview so now main thing why tree is important so for that
     this becuse we can directly insert and remove from the tree and find stuff in the
     o(logn) time so this is that's why important 
    */
    // so now we will look into the recursion first how we insert inside the binary tree not binary search tree using
    // the tree how can we code it ?
    public static void main(String[] args) {
        // so now this is the main class
        Scanner in = new Scanner(System.in);
        binary_tree tree = new binary_tree();
        tree.populate(in);
        tree.display();
        // so now we don't need to call the node function it will do automatically inside of it we don't need that's
        // this is the private node and public tree here 
    }

}
class binary_tree{
    public binary_tree(){
        // empty static class
    }
    private static class Node{
        // so here we create the node which take the value and left and right
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    // so now calling the main constructor

    private Node root; // so root node created here
    // so now inserting the element here
    public void populate(Scanner in){
        // so now it take the scanner as the input
        // first taking the input for the root node
        System.out.println("enter the root node");
        int value = in.nextInt();
        root = new Node(value); // so now it take the value
        // so now it will ask for the other element so for that taking the recusion call here
        pupulate(in , root);
    }

    private void pupulate(Scanner in, Node node) {
        // so now it will take care of the other elment so first of all we have to ask wheter it will take the input
        // in left then we will ask when it will take the input in right
        System.out.println("do you want to enter the left of the"+ node.value);
        boolean left = in.nextBoolean(); // so now it take the input
        if(left){
            // so if the left is ture then
            System.out.println("enter the value you want to insert to the left of " + node.value);
            int value = in.nextInt();
            node.left = new Node(value);
            // so now left of the node taken the value so we have to run the recursion case here
            pupulate(in,node.left);
        }
        // simalry what if we want to take the node at the right end
        System.out.println("do you want to enter the right of the "+ node.value);
        boolean right = in.nextBoolean();
        if(right){
            // so now ask the value
            System.out.println("enter the value you want to enter to the right of " + node.value);
            int value = in.nextInt();
            node.right = new Node(value);
            // so now we have to return the recusrion case
            pupulate(in,node.right);
        }
        // so now if the neither of then excute the it will go to the main function of the root at the end then
        // recusrion will complete so now display it
    }
    public void display() { // this again as the root will run like that
        display(this.root, "  ");
    }

    private void display(Node node, String indent) {
        if(node == null) return ; // so return null
        // so now we will print the left and the right
        display(node.left , indent + "/t");
        display(node.right , indent+"/t");
    }
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
