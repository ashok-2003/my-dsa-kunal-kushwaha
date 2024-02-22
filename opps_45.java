import java.lang.reflect.Array;
import java.util.Arrays;

public class opps_45 {
    // so here we are goona to learn about how we can create out own class

    // by default value of the object is null
    // in java primitive are sotred in the stack memory and object are stored in the heap memory in java which are not
    // primitives their
    public static void main(String[] args) {
        students[] std = new students[5];
        System.out.println(Arrays.toString(std));  // by default giving the
        // now here we can assing the value we can by our own
        students ashok = new students();
        ashok.roll = 56;
        System.out.println(ashok.roll);
        System.out.println(ashok.name);  // so here it is taking the by default value present in the construct so
        // from their it is taking out the value
        // so here we are using inside the function for the greeting
        ashok.greeting();
        students kush = new students(45,"kunal",83.4f);
        kush.greeting(); // so now we can see it is still taking the default values here
        System.out.println(kush.roll);  // now if we make the function same like the name of the int then it is giving
        // the zero input as from the above one this is not taking the input from the my created one of the ashok
        // taking from the above one of it so ans this is happenin because it is confuse between then as int is
        // primitve and we can assing one name and one value that's why it has been get confused in that
        System.out.println(kush.name); // similary this is happening with it also  now if we make it with the this
        // variable then this will not happen then after
        System.out.println(kush.marks);
        // now it is giving us the correct result in it
        students ramdom = new students(kush);
        // so now this take the value from the kush variable and copied it
        System.out.println(ramdom.marks);
        students ramdom2 = new students();
        // calling the constreuctor inside the constructor of it
        System.out.println(ramdom2.marks);


    }
}

class students{
        int roll;
        String name ;
        float marks;
        // note memory of it allocates dinamacally at the runtime only calls does'n require any space at all
        // because these are stored in the stack memory and object formed by it are stored in the heap memory


        // this is know as construct as here in the class we have not assing any data in the function reading so
        // here we  can give the defalult value in the java ans it does not require any name in it
//        students(){
//            // now we can create here the default value which will be get added by this name here
//            this.roll = 40;
//            this.name = "ashok";
//            this.marks = 93.43f;
//        }
        // so here inside it we can make the greeting function of our own
        void greeting(){
            System.out.println("hi everyone i'm "+ this.name);
        }
        students( int roll, String name, float marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
        // here we are doing the constructor overloading as we are making the same student class again so now it will
    // take it itself only when we give the input in the starting then it will call this other wise it will call the
    // upper one if we don't give any thing
    // now we can create the function in which we take the values from the other variables out their
    students(students other){
            this.name = other.name;
            this.roll = other.roll;
            this.marks = other.marks;
    }
    // we can call a constructor inside of the constructor by using the this keyword
    students(){
            this(37,"default person" , 50.0f);
    }

}
    // now similary we can get our input in the constructor it self

