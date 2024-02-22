import com.sun.tools.javac.Main;

import static secondry.experiment.message;
// this line as we have inmportated the message their
// as here we can see that outer class can't be static as it should crate a object for running the code
public class opps_46 {
    /* here we are going to learn about the wrapper classed and stufs so what is this wrapper classes so warpper
     in which we can use the altreanate of the primitve data type as we know that primitve data types are
     not mutable so these are stored in the object and can be mutable until and unlees they are of the final
     class as the name suggest final so dataypes having the final class are can not be modifed


      note this final have also limitation like this can only not be cahnged when are with the primiteve data
      type when thry are with the non primitive data types then we can change thier values   */
    public static void main(String[] args) {
        Integer a = 45;
        a = 46; // we can alter the value
//        Integer a = 47;  // like we are not able to do that as we can not reassing the value
        // so like this here Integer is wrapper class of the int data types
        message();
        // so now we can see at the top as it is getting imported and we can see the directory above
        human ashok = new human(19,"ashok",false,1);
        human ritik = new human(20,"ritik",true,1);
        System.out.println(ritik.population); // so here we can see that it shows the population at 1 but it should be
        // 2 as we have creatd the two object

        // so this can be solved by the two way either we can make the population to the static
        fun();
        opps_46 obj = new opps_46();
        obj.fun2();


        // when the object is made then it take the whole class again for the first time and ran it see the kunal video
        // you will got it what i am saying when he make 2 object of the same reference
    }

    // now let see something about the static and non-static method by defaults
    static void fun(){
        // this is with the static classe
        System.out.println("this is from the static class");

//        fun2();
        // so here we can see we cannot call out the non static function in the static function
        // this because non- static class requrie a function to be get called where as static do'nt require any
        // funtion to be get callled

        // so if we make a object we can call it the


//        Main obj = new Main();  // so now this giving me error earlier it was used to crate the obj
//         obj.fun2();  this code earlier lead to run of the program but now it won't '

        // so we have to create it using the name of the class we are in as the main class have object
        opps_46 obj = new opps_46();
        obj.fun2();


    }
    void fun2(){
        // this is non static class
        System.out.println("this is not static class ");
//        fun2(); // where as we can call static in non - static
    }

}
class human{
    // so now wea are here creating the human in it
    int age;
    String name;
    static long population;  // so we make it static
    boolean married;
    public human(int age ,String name,boolean married,long population){
        this.age = age;
        this.name = name;
//        this.population +=1;   this works but this is not the correct way of writing down it
        human.population +=1;
        this.married = married;

    }
}
