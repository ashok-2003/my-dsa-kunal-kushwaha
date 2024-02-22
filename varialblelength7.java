import java.util.Arrays;

public class varialblelength7 {
    //now we gonna to learn about the varialbe length aurguments like if we don't know how many intiger value i gonna to take so i can store it 
    // the the variable length aurgument is basically is the array varaible lenght array
    public static void main(String[] args) {
        vara(3,5,6,4,5,3,5,6);//so we can give the many input as we want

        //similary if we want we can give variable and constatnt together but remmember that varaiable should lies in the last


        vara2(3,5,"ashok","rahul ","Amrit","ayush ", "ritik ");
        // as we have seen above that how it can be done like constatn and varaible at the same time


        //now we look for the overloading as niche hamne 2 function banaya hai same namm se
        vara(3333,5555);
        vara("ashok ","ritik");

        //so  here we can see it automaticaaly define kar liya function use case ka according
        //so ye apne app input se decide kar leta hai at the time of the compiling ....
    }
    static void vara2(int a , int b , String ...v){
        System.out.println( a );
        System.out.println(Arrays.toString(v));
        System.out.println(b);
    }

    static void vara(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void vara(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
