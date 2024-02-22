import java.util.Arrays;

public class opps_54 {
    // here we will learn about the generic and how we cam create our own array list
    // so first of all we would create our own arraylist here in the other section of it
    public static void main(String[] args) {
        customarryalist2<Integer> x = new customarryalist2();
        x.add(34); x.add(56); x.add(75); x.add(34);
        System.out.println(x);
        customarryalist2<String> y = new customarryalist2<>();
        y.add("dh");y.add("dfj");y.add("gjhu");y.add("hfdu");y.add("gr");y.add("hg");y.add("gf");y.add("bnf");
        System.out.println(y);
//        customarryalist3<String> op = new customarryalist3<String>();  //so this is giving the error we can see

    }
}
class customarryalist{
    private int[] digit;
    // so by default the lenght of it is 10 so now
    private static int defaultsize = 10;
    private int size = 0;

    public customarryalist() {
        this.digit = new int[defaultsize];
    }
    // so now adding the different types of the method we can add in this is following here
    public void add(int num){
        if(is_full()){
            resize();
        }
        digit[size++] = num;
    }
    public int get(int n){
        return digit[n];
    }

    public int size(){
        return size;
    }
    public void set(int index , int value){
        digit[index] = value;
    }
    public int remove(){
        int removed = digit[--size];
        return removed;
    }

    private void resize() {
        // so now here we have to resize it so creating the array of double size so
        int[] temp = new int[size*10];
        // now coping the previous element in it
        for (int i = 0; i < digit.length; i++) {
            digit[i] = temp[i];
        }
        // so now all of then are getting copied in it so now replacing it
        temp = digit;
    }

    private boolean is_full() {
        if(digit.length == size){
            return true;
        }
        return false;
    }
    // as this is not getting the value so we have to
    // override it's to string method for that so that it will give us the value here
    // so doing that

    @Override
    public String toString() {
        return "customarryalist{" +
                "digit=" + Arrays.toString(digit) +
                ", size=" + size +
                '}';
    }
}
// now making a array list in which we can enter the data of our own choice so now seeing how it works
class customarryalist2<t>{
    private Object[] digit;   // as every class is sub class of the object type so we can use this
    // so by default the lenght of it is 10 so now
    private static int defaultsize = 10;
    private int size = 0;

    public customarryalist2() {
        this.digit = new Object[defaultsize];
    }
    // so now adding the different types of the method we can add in this is following here
    public void add(t num){
        if(is_full()){
            resize();
        }
        digit[size++] = num;
    }
    public t get(int n){
        return (t)digit[n];
    }

    public int size(){
        return size;
    }
    public void set(int index , t value){
        digit[index] = value;  // here no coversion required because it doing it implicit
    }
    public t remove(){
        t removed = (t)digit[--size];
        return removed;
    }

    private void resize() {
        // so now here we have to resize it so creating the array of double size so
        Object[] temp = new Object[size*10];
        // now coping the previous element in it
        for (int i = 0; i < digit.length; i++) {
            digit[i] = temp[i];
        }
        // so now all of then are getting copied in it so now replacing it
        temp = digit;
    }

    private boolean is_full() {
        if(digit.length == size){
            return true;
        }
        return false;
    }
    // as this is not getting the value so we have to
    // override it's to string method for that so that it will give us the value here
    // so doing that

    @Override
    public String toString() {
        return "customarryalist{" +
                "digit=" + Arrays.toString(digit) +
                ", size=" + size +
                '}';
    }
}

// example of the wild card here which lead to limitation to enter certain type of the data here
class customarryalist3<t extends Number>{ // so now as this extend to the number class so it take only number as the
    // input
    private Object[] digit;   // as every class is sub class of the object type so we can use this
    // so by default the lenght of it is 10 so now
    private static int defaultsize = 10;
    private int size = 0;

    public customarryalist3() {
        this.digit = new Object[defaultsize];
    }
    // so now adding the different types of the method we can add in this is following here
    public void add(t num){
        if(is_full()){
            resize();
        }
        digit[size++] = num;
    }
    public t get(int n){
        return (t)digit[n];
    }

    public int size(){
        return size;
    }
    public void set(int index , t value){
        digit[index] = value;  // here no coversion required because it doing it implicit
    }
    public t remove(){
        t removed = (t)digit[--size];
        return removed;
    }

    private void resize() {
        // so now here we have to resize it so creating the array of double size so
        Object[] temp = new Object[size*10];
        // now coping the previous element in it
        for (int i = 0; i < digit.length; i++) {
            digit[i] = temp[i];
        }
        // so now all of then are getting copied in it so now replacing it
        temp = digit;
    }

    private boolean is_full() {
        if(digit.length == size){
            return true;
        }
        return false;
    }
    // as this is not getting the value so we have to
    // override it's to string method for that so that it will give us the value here
    // so doing that

    @Override
    public String toString() {
        return "customarryalist{" +
                "digit=" + Arrays.toString(digit) +
                ", size=" + size +
                '}';
    }
}

