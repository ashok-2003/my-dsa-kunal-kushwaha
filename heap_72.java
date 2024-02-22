import java.util.ArrayList;

public class heap_72 {
    // so now  i had written most of the thing about the heap in the copy so now here doing only the coding part here
    public static void main(String[] args) throws Exception {
        // so here creatign the heap
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        // so now try the heap sort
        ArrayList list = heap.heapsort();
        System.out.println(list);
    }


}
class Heap<T extends Comparable <T>>{
    // so now here we have to create it of the genereic type
    // so now as all the data stored in the list so



    // so for the size
    private int size = 0;
    public int size(){
        return size;
    }
    private ArrayList<T> list = new ArrayList<>();
    // so now here arraylisti is created
    // so now here calling the constructor of the heap
    public Heap(){
        list = new ArrayList<>();
    }
    // so now about the parent and the child here
    // as in the copy it start form the index 1 but here it start from the index 0
    public int left(int index){
        // so for the left element of that index it should return
        return  index*2+1;  // as if it start form the 1 then it would be the value of the right
    }
    public int right(int index){
        // so now for the right index
        return index*2+2;
        // so this is the index of the right side here
    }
    public int parent (int index){
        // so parent index is divided by two but now here again it will be different
        return (index-1)/2;
    }
    // so now at the time of inserting and deleting swap method so now the swap method is
    public void swap(int first , int second){
        // so as this is the type of t
        T temp = list.get(first); // so as this is generic type so now  we have to get the book here
        list.set(first , temp); // so at this take the index and the element value you want to set
        list.set(second , list.get(second));
    }
    // so now we can set the value here
    // so now inserting the value
    public void insert(T value){
        // so we have to add the value to the list
        list.add(value);
        size++;  // so size should also increase here
        // so now it added so now we have to chek the heap again so now as it is added so the last index so cheking the
        // heap form down to up
        // so this is called as the upheap here
        // so here we have to call the uphead function here at the last index
        upheap(list.size() -1);
    }
    // so here is the uphead method
    private void upheap(int index){
        // so now here it work on that index
        // so now element should be greater than it parent so now getting the index of the parent
        if(index == 0){
            return; // so now as it reaches the first index so we don't need to do recursion now
            // this is called as the edge case
        }
        int parent  = parent(index); // so now we had get the index of the parent
        // so now here we have to use the comparable method
        if(list.get(index).compareTo(list.get(parent))<0){
            // so this mean parent is greater than the index child we are currently at
            // so we have to swap it
            swap(parent , index);
            // so now again we have to call the recursion to check above
            // so now return parent in the unheap
            upheap(parent);
        }
    }
    // so now for the removing we have to also create the function here
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("list is empty so we can't remove");
        }
        // so now it will remove the first index not the index we want
        // so now storing the first index into the temp
        T temp = list.get(0); // so now we got the index 0 value
        T last  = list.remove(list.size()-1);
        // so now we are not getting the value but we have removed it
        // as lenght should also decrease
        // so now we have to set last value thier
        //
        // so here we are leaving the edge case
        if(!list.isEmpty()) {
            list.set(0, last); // so we are setting the 0 element with the last index
            // so now
            // we have to get the down heap method here
            // as this should start from the
            downheap(0);
        }
        size--; // as for the remove size should also decrease
        return temp;
    }
    private void downheap(int index){
        // so now here in the down heap
        // so now we are sotoring index in the int min
        int min = index;
        // so now we have to chek for both left and rignt
        int left = left(min);
        int right = right(min);
        // so now here we are cheking
        // if min value is greater then swap it
        if(left < list.size() && list.get(min).compareTo(list.get(left))>0){
            // so it means min is greater than the left
            min = left;  //  so value of min updates

        }
        if(right < list.size() && list.get(min).compareTo(list.get(right))>0){
            min = right;
        }
        // so now here we have to call the recursion function
        // but first of all we have to check if min have been changed or not
        if(min != index){
            // so as it means min have been changed
            // then call the recursion call
            // ans swap the value
            swap(min , index);
            downheap(min);
        }
    }

    // so now here is the heap sort
    // that is we have to remove from the list and added in the list
    public ArrayList<T> heapsort() throws Exception{
        // so now here  we have to remove from one and add in the another
        ArrayList<T> arr = new ArrayList<>();
        while(!list.isEmpty()){
            arr.add(this.remove());  // as thier is the remove method we have to use that we don't want to use the
            // typically arraylist remove method here
        }
        return arr;
    }
    // so this is knwo as the prrroty qeue here
    // like in the prioriry ques it mean like accoording to our need we want first element to be the maximum or the
    // first index to be minimun
    // so here we are doing it using the heap
    // now we can do it using the linkedlist also here
    // so now in linked list when we add one elment then we have to traverse over the linked list for that
    // as like where it should be get inserted will be inserted after comparing the value
}

// doing the heap sort on the unsorted array
//class array {
//    // so now here we are creating the arr and then do the heap sort on it
//    // so now
//    public static void main(String[] args) {
//        int[] arr = {4,1,3,2,16,9,10,14,8,7};
//        // so now  this is the array we have to do the heap sort on it
//    }
//    public int[] sortheap(int[] arr){
//        // so now here creating the arr
//        int[] ans = new int[arr.length];
//
//        // so now here we have to
//        return ans;
//    }
//}
