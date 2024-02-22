public class opps_56 implements Cloneable {  // so this colonalbe is used when we want to create the colne of the object
    /* so here
     we will learn about the exception handling  so exception handling is like exception cases which interupt the
     normal flow of the program like dividing by 0 so these are callled as the exception handling */

//    like here
    int age ;
    String name ;
    int[] arr = {3,6,8,23,67,9,45,1};
    // so this is the array here will be used for the object cloning

    // constructor for the following


    public opps_56(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = arr;
    }

    // so now when we have to create the clone so we wirte like this but imagine writing for the big one
    public opps_56(opps_56 other){
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }
    // so we can do this in the sort type like
    @Override   // so here override work so it is overridden
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); // so now we can use this for cloning it

    }
    // so upper this is the shallow coping here now doing the deep coping which will not change the main object
    public Object ccloned() throws CloneNotSupportedException{
        opps_56 twin = (opps_56)super.clone();
        // now making it a deep copy
        twin .arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
    // so this is the deep copy of the above one


    public static void main(String[] args) throws CloneNotSupportedException {
    int a = 4;
    int b = 0;

//    int c = a/b;
    // so as we can see this is giving errror of the arthematic exception by zero
    // so we can do the pretty printing of it



    try{
        int c = a/b;
    }catch (Exception e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println("this is the final message it will print it out in any case ");
    }

    int d = divide(3,0);
//    System.out.println(d);

}
public static int divide(int a , int b ){
    if(b == 0){
        throw new ArithmeticException("you are dividing by zero "); // arthematic exception is the sub class of the exception class
    }
    return a/b;
}
}
class  cloned {
    public static void main(String[] args) throws CloneNotSupportedException {
        // so now writing the code for the coloning here
        opps_56 ashok = new opps_56(30,"ashok");
        // so now simple cliig by the counstructo
        opps_56 conclone = new opps_56(ashok);
        // now cloning by the clone method
        opps_56 clonne = (opps_56) ashok.clone(); // so this object clone the ashok

        // now we will learn about the shawallow coping and the dept coping here
        // in shallow coping non - primitve are reffer to the original object and primite create the new object
        System.out.println(ashok.arr[0]);
        // so now chaging in the clone
        conclone.arr[1] = 77;
        clonne.arr[3] = 99;
        System.out.println(ashok.arr[1]);
        System.out.println(ashok.arr[3]);

        // so we can see here the main object is also changed

        // now doing the deep coping here
        opps_56 ritik = (opps_56) ashok.ccloned();
        ritik.arr[4] = 66;
        System.out.println(ashok.arr[4]);
        // so here we can see it dose not changes the main one here
        
    }
}


