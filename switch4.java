import java.util.Scanner;

public class switch4 {
    public static void main(String[] args) {
        //so here we are gonna to learn about the switch statement and learn out how it works

        // and we are gonna to learn more efficient way to write switch statement


        /* firs of all why we are using switch statement what was the problem with the
         if statement  this because as when we make out various cases in the our program so
         in   if it checks all but in the switch case it not check all so
         that's why we check out switch statement */


        //form which tell us the day if we enter the intiger
        System.out.println("enter the date ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch(day){
            case 1:
                System.out.println("the day is fucking monday ");
                break;
            case 2 :
                System.out.println("the is tuesday jai hanuman ji ki ");
                break;
            case 3:
                System.out.println("it wednesday baby ");
                break;
            case 4 :
                System.out.println("the is thrusday the thristy day ");
                break;
            case 5 :
                System.out.println("its friday bc u know what to do on ");
                break;
            case 6 :
                System.out.println("its saturday saturday so do party");
                break;
            case 7:
                System.out.println("its sunday bc enjoy your life coz tommmorow gonna to be monday ");
                break;
            default:
                System.out.println("please enter a number between 1 to 7 u fool basted ");

        }

        //now this whole code can be modified by the new type of the code which is suggested by the ide
        switch (day) {
            case 1 -> System.out.println("the day is fucking monday ");
            case 2 -> System.out.println("the is tuesday jai hanuman ji ki ");
            case 3 -> System.out.println("it wednesday baby ");
            case 4 -> System.out.println("the is thrusday the thristy day ");
            case 5 -> System.out.println("its friday bc u know what to do on ");
            case 6 -> System.out.println("its saturday saturday so do party");
            case 7 -> System.out.println("its sunday bc enjoy your life coz tommmorow gonna to be monday ");
            default -> System.out.println("please enter a number between 1 to 7 u fool basted ");
            //so we can see how much simple it has become as we can see without even the break line usagge
        }


        //now we can do nested switch condition  which will let make swtich inside the switch condition
    }
}
