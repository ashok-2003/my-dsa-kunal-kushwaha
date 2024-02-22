import java.util.ArrayList;

public class string23prettyprinting {
    // so like prettry printing is like the scanf and  print f in the java nothing else
    public static void main(String[] args) {
        float a = 245.678934f;
        System.out.printf("formatted number is %.2f",a);
        // so now we can see that as we have use .2f it is show decimal upto 2 point and it is also rounding of the digit
        System.out.printf("value of pie till 4 is %.4f",Math.PI);
        System.out.printf("hello my name is %s and i am %s","ashok","stupid");
        // so this %s and %f is know as place holder in the java


        // now we will learn about the operator in the java so let say the examaple like
        System.out.println("..");
        System.out.println('a'+'b');// so now it show it numeric value as '' this is used so it will add the numric value
        // also know as ascasy value as it is coverting it in its ascay value
        System.out.println("a"+"b");// so not it showing ab as this is adding the string of its own
        System.out.println('a'+5); // so it adding 5 in the ascasy value of the a
        System.out.println((char)('a'+5));// so now we are explicity converting it in the char vlaue to see its character
        System.out.println("a"+1); // here a1 is giving because to string method 1 is being converted into the "1" and then both added
        System.out.println('a'+"b");
        // so now if add more complex data type nothing much java will convert all into the string and add it as the
        // it will call the two string method for that and do the work



//        System.out.println(new Integer(65)+ new ArrayList<>());


        // so for this java is giving us the error it because we are adding expression the integer which is not defined
        // the + operator is only defined for the primitves and the string only for those two not for  the expression
        // that is if we want to use the complex expression the atleast one of it should of the type string
        System.out.println("a"+ new ArrayList<>());  // as here one is of the type string so it is not giving error
//        System.out.println(45+ new ArrayList<>());  so it is giving error as usual
        // one of it should be string to work with complex varialbe
        String ans = new Integer(65) + "" + new ArrayList<>();
        System.out.println(ans);  // so now it adding it as one is string
    }
}
