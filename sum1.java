import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
//        System.out.println();
    Scanner input = new Scanner(System.in);
//    int roll = input.nextInt();
//        System.out.println(roll);   was cheking where our program is working out or not

        // so making a sum program of the float using java where sum of the two number will be returned in
        System.out.println("enter the first and the second number respectvely");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float sum = a +b ;
        System.out.println("the sum of the two entered number is "+ sum );


        //now here we can see if we enter the number as the intiger then it do not give the error inspite it gives us the
        // answer in the float so this is how TYPE CASTING  is done their



    }
}