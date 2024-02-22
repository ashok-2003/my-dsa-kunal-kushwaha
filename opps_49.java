public class opps_49 {
    /* so here we gonna to learn about the polymorphism so here how it is
     poly means different  and morphisme means ways to represent it so poly morphism means different ways to
      represent it

      their are two types of polymorphism
      1. compile time / static plymorphism
      this is basically multiple constructor overloading so we call this as compile time
      as at the compile time it determines the which constructor to call as inspite of having the same name

      2.runtime / dynamic polymerphisme
      this is achived method overriding so we are overriding the menthod


      */
    public static void main(String[] args) {
        shapes test1 = new shapes();
        traingle test2 = new traingle();
        square test3 = new square();
        shapes test4 = new square();
        test4.area();   // se here it is not printing the shapes but giving the area of the square
        // this because in overriding object of the child class is given as the priority thier
        test3.area();
        test1.area();
        hexa test5 = new hexa();
        test5.area();  // so this giving me the result of the parent class only as this is not overriding

    }
}
class shapes{
    void area(){
        System.out.println("this is shapes ");
    }
}
class traingle extends shapes{
    @Override
    void area(){
        System.out.println("area of traingle is 1/2*h*b");
    }
}
class square extends shapes{
    void area2(){
        System.out.println("area of the square is l*b");
    }
}
class hexa extends shapes{

}

// so now here we can see it is called as overriding as parent class have area function and child class also have a
// area function so it is dynamic polymerphism

// so now here we will look at the different overriding
class diff{
    int a = 45;
    diff(int a ){
        this.a = a;
    }

    @Override   // override because every class extend to the object class by default 
    public String toString() {
        return "object print a is "+a;
    }
    // so now it is giving me the value for x1

    // so now testing what answer it would give
    public static void main(String[] args) {
        diff x1 = new diff(45);
        System.out.println(x1);  // so now we are seeing it is givning me the random value here so we can solve this
        // by overriding the metood
    }
}
// now final keyword when we use the final keyword then we can not override that methotd as we have done above if it is
// final we just can not override that method thier
class mate{
     final void must(){
        System.out.println("parent class ");
    }
    static void over(){
        System.out.println("this is the main class of static");
    }
}
class mate2 extends mate{
//    void must(){
//        System.out.println("child class");
//    }
    // as we can see it is giving me the error when we are overriding
//    @Override  so here we can see that override in the static class is giving out the errror
    // this because we cannot override the static class actually static class is not overriden as it is static
    // so it run without creating the object that why and it will show the output of the main class
    static void over() {
        System.out.println("this is child class of the static");
    }

    public static void main(String[] args) {
        mate test = new mate2();
        test.over(); // as we can see it is giving the output of the parent calss only inspite of that
        mate2 test2 = new mate2();
        test2.over();  // gives the child class output their
//        mate2 test3 = (mate2) new mate();
//        test3.over();     this giving the erroe as we swap the parent class and child class

    }
    // so best explanation for it as overriding depends on the object and static method dose't depend on the
    // object so static method cannot be overridenn that's the explanation out their
}
/* now their is 3 thing to learn
* 1. ABSTRACTION
* 2. ENSCUPLATION
* 3. DATA HIDING
   so now thesse are 3 more things in the opps so
    abstaraction is the thing in which we show the main thing and hide the unnecessory thing like as we start
     the car with key so in that process we dosen't acquire how the car is being started we just insert the key
     * and let the car to be start this is know as abstraction
     *
     * where as encapulation is in which we hide the complexicity of the full program how we do it
     * it is basicall internal hiding and abstaraction is external hiding so in encaplution we hide data internally
     *
     * where as in data hiidng we are hiding the data like
     * private double keyword we are using these are data hidiing  */
