import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
// so this upper is the interface which is of the consumer here whcih we have use in the lambada function

public class opps_55 {
    // first of all know that we can create the interface of the generic type also here

    // now here we will learn how we can compare the two of the data types here which take mutiple variable as the
    // input
}
class student implements Comparable<student>{   // so here compable is the interface so we have to implement it by
    int marks;
    int roll;
    String name;

    public student(String name ,int marks, int roll) {
        this.marks = marks;
        this.roll = roll;
        this.name = name;

    }

    @Override
    public int compareTo(student o) {
        int diff  = this.marks-o.marks;
        return diff;
        // so now this diff is being return to this function so now this calculate it's own

    }
    // so constructor for that is here
    // as now when we make the object here so we need to compare it so for that it need to compare method also
    // that method require for the sorting so thus how it is


    // now writring the two string method here


    @Override
    public String toString() {
        return name+" "+ marks +" "+ roll;
    }
    // so this make out the string appear in it

    public static void main(String[] args) {
        // so here creating two of the object and comparing it
        student ashok = new student("ashok",89,40);
        student ritik = new student ("ritik",90,39);
        student amrit = new student("amrit",88,22);
        //so now using the compare to comapre the value
        if(ashok.compareTo(amrit) > 0){
            System.out.println(" ashok has greater marks  " + ashok.marks);
        }
        if(ashok.compareTo(ritik) > 0){
            System.out.println(" ashok has greater marks  " + ashok.marks);
        }
        // so we can see it is working properly so that's how the comparalbe program works

        // so now learing about the sorting algoraithim
        student[] list = {ashok,ritik,amrit};


        // so this is one of the method to if we don't have created the compare to method then this array .sort
        // mehtod will don't work direclty in  so for in that case we can either use the lambada function or we can
        // use the new comparator mehtod for that their are these two ways by which we can acces it




//        Arrays.sort(list);
//        Arrays.sort(list, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//                int diff = o1.marks- o2.marks;
//                return diff;
//            }
//            // so this is one of the way to sort the array and we can sort in another way also
//        });
        System.out.println(Arrays.toString(list));
        Arrays.sort(list,(o1,o2) -> -(int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));
    }
}
class lambafun{
    // so now for this we have to create the non-primitive integer type here
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arr.add(i);
        }
        //so now here some of the function are being added now doing what we want

        // like creating a lambda funtion which multiple the all number in the list
        arr.forEach((item) -> System.out.print(item*2 +" "));
        System.out.println(" ");
        Consumer<Integer> fun = (item) -> System.out.print(item * 2 + " ");
        arr.forEach(fun);
        System.out.println();
        // like we can create some of the function in which we can get then sum
        // for this if we want we can create the interface class which take the number input
//        Consumer<Integer> sum = (item1 , itme 2) -> (item1+itme2);  // so we can see that dose not work so it means
        // this work for the one item type


        // so now we can create some of the operation
        operation sum2 = (a,b) -> a+b;
        // now below one is given by inteliji idea
        operation sum = Integer::sum;

        operation mul = (a,b) -> a*b;
        // like here we have done it
//        System.out.println(sum);
//        System.out.println(sum2);
        // so this does not work here we have to make a function for it to work

        lambafun mycal = new lambafun();
        System.out.println(mycal.operate(2,4,sum));
        System.out.println(mycal.operate(5,6,sum2));
        System.out.println(mycal.operate(3,8,mul));
    }
    private int operate(int a , int b , operation op){
        return  op.operat(a ,b);
    }

}

interface operation{
    int operat(int a , int b);  // so this will store my lambda variable


}

