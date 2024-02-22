import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //now basic of the while loop
        int i = 0;
        while(i!=7){
            System.out.println(i);
            i = i +1;

        }
        //so this is the basic of the while loop now we will se for the for loop

        for(i=1; i!=9;i++){  //condition ke annge nahi laga ; ye walla so here in for loop start end then conditon
            System.out.println(i);

        }

        //thir is one simple loop when to use which loop
//        WHEN YOU DON'T KNOW HOW MANY TIMES  loop is going to run then use while loop and when u know it use for loop

    }
}
