public class custom_stack_60 {
    // so here we will try to make our custom stack and also dynamic custom stack also and see how it will work here
    // so custom stack normal behave like a normal array where as dynamic stack behave like a arraylist so now  i will
    // code it
    public static void main(String[] args) throws Exception {
        customstack sttk = new customstack(5);
        sttk.push(56);
        sttk.push(78);
        sttk.push(65);
        sttk.push(59);
        sttk.push(34);
        sttk.push(12);
        System.out.println();
        System.out.println(sttk.peek());
        System.out.println();
        System.out.println(sttk.pop());System.out.println(sttk.pop());System.out.println(sttk.pop());System.out.println(sttk.pop());System.out.println(sttk.pop());
        System.out.println(sttk.pop());System.out.println(sttk.pop());System.out.println(sttk.pop());
        System.out.println();
        // so as we can see that it is working properly
    }

}
class customstack{
    // so here we will make custom stack and dynamic stack
    protected int[] data ;
    private static int DefaultSize = 10;
    int ptr = -1;  // initially pointer is at the place of -1 index in the stack so if no element present
    public customstack(int size){
        this.data = new int[size];
        // so if we enter the size then it take that size
    }
    public customstack(){
        this(DefaultSize);
        // so we are calling function under function this make the stack of the defalut size
    }
    public boolean push (int value )  {
        if(isfull()) {System.out.println("stack is full "); return false;}
        // other wise if it is not full then
        //so this is giving error to the pointer if it was above so it after two line then pntr++;
        ptr++;
        data[ptr] = value;
        return true;
    }
    public int pop() throws Exception {
        if(isempty()){
            throw new Exception("stack is empty so we can't remove it ");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    protected boolean isfull() {
        return data.length-1 == ptr;
    }
    protected boolean isempty(){
      return  ptr == -1;
    }
    public int peek(){
        // so this will return the peek element of it
        return data[ptr];
    }
}
class doublestack extends customstack{
    // so as most of thing here are same so we will override it
    public doublestack(){
        super();  // so it take that data from the super
    }
    public doublestack(int value){
        super(value);  // so when we take value of size here then it will see in the call custom stack function
    }
    // now we have to override the push method


    @Override
    public boolean push(int value) {
//        return super.push(value);
        // so we have to override it
        if(isfull()){
            // so when it is full
            int[] temp = new int[ptr*2]; // so this return the double of the size
            for (int i = 0; i < ptr+1; i++){
                temp[i] = data[i];
            }
            // so now it get store then
            data = temp;
        }
        return super.push(value);
        // so now it call the super function
    }
}

