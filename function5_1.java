public class function5_1 {
    //so herw we gonna to see how the function swap does not work that is  it work on pass by value
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        swap(a,b);
        System.out.println( a  + "  " + b);
        //so her we can see value does not change as its pass by the value
        // where as if we built same function outside then it wil work
        String name = "ashok kumar ";
        greet(name);
        System.out.println(name);

        //so here we can see that it does not print kunal it print out ashok kumar


    }

    static void greet(String name) {
        name = "kunal ";
        System.out.println(name);
    }

    static void swap(int a , int b ){
        int temp =  a ;
        a = b ;
        b = temp;

    }

}

