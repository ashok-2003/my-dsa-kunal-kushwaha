public class  linkedlist_57 {
    /* why we  use linked list as it is like we have array list so why do we enen need linked list for in that case
     this because  array and arraylist are countinouse  allocation as array have limited load as we give and
     array list double each time when the list get exceed the size and copy the previouse data inspite of
     having 0(1) time complexicity thier so here in linked list each of the element are single box and stored in
     the heap memory without any order so when we add element the it get stored in the separte box in the heeap
     and it is connected to the tread like so it have one head and one tail here for that and  each element
     only know the next element to it so like 1st element dose't know aobut the 4 elemtn it know only about the
     2nd element */

    // so now thier is the problem in this that is acceseing the data as we have only head and tail
    public static void main(String[] args) {
//        linkedList first = new linkedList();
//        for (int i = 0; i < 10; i++) {
//            first.InsertFirst(i);
//        }
//        first.InsertLast(67);
//        first.insert(45,3);   // 3rd index so 4 th number
//        first.display(); // so now we can see it's giving the answer
//        first.deleteLast();
//        first.display();
//        first.deleteFirst();
//        first.display();
//        first.delete(4);
//        first.display();


        DoublyLinkedList second = new DoublyLinkedList();
        second.insertLast(34);
        second.insertFirst(45);
        second.insertLast(78);
        second.inserafter(45,36);
        second.insertFirst(23);
        second.inserafter(23,89);
        second.display();
        second.inserafter(89,44);
        second.display();
        second.delete(44);
        second.display();
        System.out.println(second.size); // size start from the zero value


    }

}

class linkedList{
    private class Node{
        private  int value;
        private  Node next;
        // this is the constructor below for the value to be entered

        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
        // so now defeing the head / tail and the size of the linked list for that

    }
    private Node head;
    private Node tail;
    private int size;
    // so now each time we create the linked list the size should be 0 without of asking it
    public linkedList(){
        this.size = 0;
    }
    // so now what if we want to insert the function at the first index in the array which has already element at the
    // head or the first index
    public void InsertFirst(int value){  // so value of the element you want to insert
        Node temp = new Node(value); // so for that we created the node of the value so for it value is it itself and node next is null
        temp.next = head;  // so now in this line we have update the head to to next as it is the first element so all element in front of it
        head = temp;   // now this because head should be pointed to the first object so for that

        // now what if it is the only element then what about my tail
        if( tail == null){
            tail = head;  // so as tail is null so pinting to it
        }
        size++;  // as each time size should be increase with each element added
    }
    // now printing of this list so for that we should not move the head so create the temp vairalbe and each time move the temp
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;  // so temp value get increased
        }
        System.out.println("END");  // so printed end in the last here
    }
    //now what if we have to insert it to the last index
    public void InsertLast(int value){
        // as what if it is the first element
        if(tail == null){
            InsertFirst(value);
            return;
        }
        Node temp = new Node(value);
        // so now next node tail should be pointing to this
        tail.next = temp;
        tail = temp;
        // now what if tail is empty

        size++;
    }
    // now what if we want to insert at the particular index then what we have to do
    public void  insert(int value , int index ){
        // now writing the corner condition
        if(index == 0){
            InsertFirst(value);
        }
        if(index == size){  // as here my size also start from the zero so this is how it's working here
            InsertLast(value);
        }
        // so now for the middle case
        // so we can know about that thing
        Node temp = head; // so it starting from the head and we have to go to that palce
        for (int i = 1; i < index; i++) {  // starting from 1 as head as been already assinged
            temp = temp.next;  // so it's like going to the next element here
        }
        // so now we have to replace with the main node
        Node node = new Node(value,temp.next); // so node created so now we have to reach one previous index of the insertion and we have given the next value
        // this was like the next element if we insert it so it is increase the two time as above .next and that temp agian .next here again
        temp.next = node;
        size++;
    }
    // so now what if we want to delete the item then we can just move our pointer head to the next element
    public int deleteFirst(){
        int value = head.value;  // so now value of head is stored
        head = head.next;  // this is being shifted
        // now if it is the first element then
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }
    // so now what if we want to delete at the different index or last
    // so first of all we have to go one index previous than it
    public Node getIndex(int index ){
        Node temp = head;
        // now iterating it
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;  // so it return the node at which we point the index at
    }
    // so now if we want to delete the last index
    public int deleteLast(){
        if(size<= 1){
            return deleteFirst();
        }
        int value = tail.value;
        Node temp = getIndex(size-2);
        tail = temp;
        tail.next = null; // updating the next value of it to null as it end their
        size--;
        return value;
    }
    public int delete(int index ){
        if(index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        // so what if we want to delete at the particular index
        Node temp = getIndex(index-1);
        // so temp will get the one index of it
        int value = temp.next.value;
        // now removing that elemnet
        temp.next = temp.next.next;  // as two time so it removes the elment
        size--;
        return value;
    }
    public void insertRec(int index , int value){
        // so here we have to code it via recursion
        head = inserRec(value,index,head);
        // so it take the inital value here

    }
    public Node inserRec(int value ,int index, Node node){
        // so here we will wirte how we can
        if (index == 0){
            // so now when index == 0 so it mean it reached to the index here
            Node temp = new Node(value,node); // so it's value updated in the node
            size++;
            return temp;
        }
        // now that was the base condition so now
        // otherwise node should be moving next and next
        node.next = inserRec(value,index--,node.next);
        return node;
    }
}
class DoublyLinkedList{
    // so now we will create the doubly linked list which can take the pervious and next both of the element here
    private class Node{
        int value;
        Node next;
        Node previous;
        // so now creating constructor for both here value and if we want to insert all of this

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
    // so now defing the head only as per the norms and size
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        this.size = 0;  // initiallising for the each of it
    }

    // so now writing the program for the inserrfirs
    public void insertFirst(int value){
        // so here we have to insert at the first index
        Node temp = new Node(value);
        temp.next = head;
        temp.previous = null;
        if( head != null){
            head.previous = temp;
        }
        head = temp;
        size++;
        // so now this is the code for the insert first code here
    }
    // code for the insert last
//    public void insertLast(int value){
//        Node temp = new Node(value);
//        if(size == 0){
//            insertFirst(value);
//        }
//
//        temp.next = null;
//        temp.previous = tail;
//        if(tail != null){
//            tail.next = temp;
//        }
//        tail = temp;
//        size++;
//    }

    // my code of the insertlast is wrong here so fucking get it in the right way u bastard
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.previous = last;
        size++;
    }

    public Node getindex(int value)  {
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        // in the else condition
        return null;
    }
    // so now function for the inserafter the certain value
    public void  inserafter(int after, int value){
        // so first of all get to that index of the value
        Node pre =  getindex(after);
        // so now do this with the pre and make with the new node
        if(pre == null){
            System.out.println("value dose not exist");
        }
        Node node = new Node(value);
        node.next = pre.next;
        pre.next = node;
        node.previous = pre;
        if(node.next != null){
            node.next.previous = node;
        }
        size++;
    }
    // so now we will learn about the display function here
    public void display(){
       Node temp = head;
//       int x = size;
       while (temp != null){
           System.out.print(temp.value+"->");
           temp = temp.next;
//           x--;
       }
        System.out.println("end");
    }
    // so now for the deletion here we have to also do something
    public int delete(int value){
        Node temp = getindex(value);
        // so now this value get in the main node
        temp.previous.next = temp.next;
        temp.next = temp.previous;// hope so this delete the node
        size--;
        return value;
    }

}
// here now we can study about the circular linked list also but i don't want to code it right now so we will do it
// on the later on here not right now

