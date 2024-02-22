public class string21 {
    // so here we gonna to learn about the string in the java so in java string are immuatable that is onece it is
    // done it can't be changed i.e  string me do variable ek string ko point karnge in the heap memeory
    /*
    like here in the heap memory pool is created which is know as string pool i.e let 2 variable hai and dono ka
    value same hai to dono same point ko target karnge so now if ham ek refrence varialbe se soche change karde
    to uska change dusre me nahi ayyega because string are immuatable matlab ki ham uss ko change ki nahi kar skate
    ek baar jo ban gaya wo ban gaya this because of the security reason like storing someone passwords

     */
    public static void main(String[] args) {
        String a = "ashok";
        String b = "ashok";
        // so here both a and b are pointing to the the pool in the heap memory
        System.out.println(a);
        a = "kumar";
        System.out.println(a);
        System.out.println(b);
        // so now here you will say that i changed ashok variable but i have created the new value in the heap
        // named as kumar and  a is now pointing toward that value in the pool if no other variable is pointed toward
        // ashok it will go in the garbage value
        // SO BASICALLY ARRAYS CAN BE MODIFIED BUT STRING CAN'T BE .
        // so now how we can check wherther string pointing to the same pool in the heap memeory we can check by ==
        String c = "ashok";
        System.out.println(c==b);// so this is printing the value of the true so thus both pointing to the same pool
        // now we can explicity create new string outside the pool which will not point the same string
        String d = new String("ashok");
        System.out.println(d==b);// so now this is giving us the false as this string is outside the string pool in heap
        // now what if string outside pool and we want to check whether the char.. it contains is same or not waht for that
        // we usage equals to for that
        System.out.println(d.equals(b));  // so now it comparing the character and it is giving the true value for that

    }
}
