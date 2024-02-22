
import java.util.Scanner;

public class function5 {
    public static void main(String[] args) {
        //now here we gonna to learn about the function so like how can we made function and stuffs like that

        Scanner in = new Scanner(System.in);

        sum(); // so it will call out the function sum

        int ans = sum1();
        System.out.println(" the sum of the numbers is " + ans );
        int a = in.nextInt();
        int b = in.nextInt();

        int ans2 = sum2(a,b);
        System.out.print("the sum of the enerted value is the " + ans2);


    }
    /*
    so in java function ara written below the main and it hava suscture like
      // return type name (arguments if we want to give )
         body
         return ;
         then close


         now we can call the function whenever we needed it in the main function so we can call it

         now thing define in the system are stays within it so thier scope is limited to that let suppose
         we define the num integer in main function then we define that num here also in the function so
         program will not give the error because it stays within it so no error will be given



         so making a sum function with first no return type then with int return type then with arguments

    */
    static void sum (){
        System.out.println("enter the two number repectevely ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b ;
        System.out.println("the sum of the number are " + sum);
        //no return value because return type is void
    }
    //now making of the type int
    static int sum1(){
        System.out.println("enter the two number repectevely ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b ;
        return  sum;
        //so as we can see that here we have to return the intiger value at last otherwise it will give us the error
        // now after return value assing if we write any statment it will be not executed
    }
    //now making a function with the aruguments
    static int sum2(int a , int b ){
        int sum = a + b;
        return  sum;
    }

    //SO HERE WE CAN SEE 3 TYPES AND HOW THE FUNCTION ARE WITHIN THE FUNCTION ITSELF SO THIS IS HOW IT WORK


    // their is  thing in java pass by value only works not pass by refrence not works so if we do like swap number
    // it not gonna to work we can see here also
     static void swap (int a , int b ){
        int temp = a ;
        a = b;
        b = temp;

     }

}
