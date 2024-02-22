public class custom_ques_61 {
    // so like we made the custom stack we can make the custom ques also here
    public static void main(String[] args) throws Exception {
        circularcustomque que1 = new circularcustomque(4);
        que1.insert(56);que1.insert(78);que1.insert(99);que1.insert(11);que1.insert(34);
        que1.display();
        System.out.println(que1.remove());
        // debug it to see what are the mistake done here

    }
}
class customeques{
    protected int end = 0;
    protected int[] data;
    private static int defaultsize = 10;
    public customeques(int size){
        this.data  = new int[size];
    }
    public customeques(){
        this(defaultsize);
        // so it crated the ques of default size
    }
    protected boolean isfull(){
        return end == data.length;
    }
    protected  boolean isempty(){
        return end == 0;
    }
    public void insert(int value){
        if(isfull()) System.out.println("ques is full ");
        // otherwise we have to add the elemetn
        data[end++] = value;
        // so it added and end++ done automatically here
    }
    public int remove()throws Exception{
        // so here now remove is bit tricky as as first come and first out follow here
        // so each time we have to shift the element here soo for that we have to shift all data so it take o(n)
        // complexicity
        if(isempty()){
            throw new Exception("ques is empty no more element can be removed ");
        }
        int removed = data[0]; // here we are removing the 0 index
        // so now other wise
        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];
            end--;
        }
        return removed;
    }
    public int front() throws Exception{
        if (isempty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
class circularcustomque extends customeques{
    // so here we uses the function of the ques then extend it and overwrite it afterwards
    int size = 0;
    int front = 0;
    // so now as the end was definged elarlier
//    int end = 0;


    public circularcustomque(){
        super(); // so it take the input from the super
    }
    public circularcustomque(int value){
        super(value); // so we created of out disered lenght we want
    }
    // so now we have to override teh insert and remove function for it

    @Override
    public void insert(int value) {
        // so here writing our own
        if(isfull()) System.out.println("ques is full");
        // other wise we have to add from the end as its zero
        data[end++] = value;
        end = end% data.length;  // this because as it is
        size++;
//        return super.insert(value);
    }

    @Override
    public int remove() throws Exception {
        if (isempty()){
            throw new Exception("my ques is empty here ");
        }
        // so now here we have to deal with the front so as front as with 0 so now moving it
        int remove = data[front++];
        // so now as this is cycle
        front = front%size;
        size--;
        // as size become less
        return remove;
    }

    @Override
    public void display() {
        if (isempty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
