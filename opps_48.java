import org.w3c.dom.ls.LSOutput;

public class opps_48 {
    public static void main(String[] args) {
        System.out.println("this  is the main class ");

    }
}
 class inheritance{
/*
    public static void main(String[] args) {
        System.out.println("this is the secondry class ");
    }  // so this mean we can create the psvm in the each class
 so now the inheritance is like the property we inherit form out parent
 like as the child we get acces to the features of the father and their property so simliary here parent is called
 as the super class and the child is know as sub class
 and we can acces the data using the extent keyword and we will learn more about it
 like here if we made it with the parent class and the main class

*/
    private double not;   // as it is private it can be get accesed in only this file it also can't be get accesed by
    // the child class also as it is the private type
    double l;
    double w;
    double h;
    // so now making the constructor for it
     inheritance(){
        this.l = -1;
        this.h = -1;
        this.w=  -1;
        this.not = -1;
        // so this contruct is by default
    }
    inheritance(double side){
        this.l = side;
        this.w = side;
        this.h= side;
        // so this is for the square here
    }
    inheritance(inheritance box){
        this.l = box.l;
        this.w = box.w;
        this.h= box.h;
    }
    inheritance(double l , double w, double h){
         this.l = l;
         this.w = w;
         this.h = h;
    }
}
class child extends inheritance{
    // so now as we have used the extend key word so we can accese the data of it

    // now parent class can not acces the native variable here like here we are creating the weight so it can't acces it
    double weigh;
    child(double weigh,double l, double h, double w){
        super(l,h,w);  // so this keyword used for getting the parent class construct if it is present the it will do it
        this.weigh = weigh;

    }
    child(double l, double h, double w){
        // super should be on the top as it dosent't care for the child class
        super(l,h,w);  // so this keyword used for getting the parent class construct if it is present the it will do it
        this.weigh = -1;

    }
    public static void main(String[] args) {
        inheritance test1 = new inheritance();
//        System.out.println(test1.not);// so as we can see it cannot acces the private data so it is giving it error
        System.out.println(test1.l);
        // so now we can see that it is giving me the value of -1 which it inherit it from the parent class here

        inheritance test2 = new child(3,5,6,5);  // so now we can see that we are comparing the
//         parent calls with it child class as here we have put the value of weight so can we get it
//        System.out.println(test2.weight); // so it is giving me error
        // so now this because the left side which we use is the main so it is object of the parent class so it can only
        // acces to the parent class so this is why it not working
        // here we can not do same with child and nheratance
        // as inherantace will acquire 3 variable and child acquire 4 variable but we can make construvt and set that
        // and we can see


//        child test3 = new inheritance(3,5,7);   // so this will still dosent work due to that
        // parent and child realtion

        child test3 = (child) new inheritance(3,5,7);  // so we have to cast the expression to use it
        System.out.println(test3.weigh);   // it give the answer but giving some of the error


    }
}
class grandchild extends child{
    double price;
    grandchild(double weigh , double l , double h ,double w , double price){
        super(weigh, l, h, w);
        this.price = price;
    }
    // so now this class is the child of the child so it can acces the data of the main class also
}
/* multiple inheritance mean two or more parent to the same child so it is not allowed in java because let
 suppose that int n is defined in both of them so now it will get confused from which i should take the value
  so multiple inheritance in not allowed in java where as */
// simialry hybrid is also not supported in java
// we will do it all using the interface in java

/* hirechial inheritance  is allowed in java it means single parent having the multiple child so it is allowed
*  in java we can do it */