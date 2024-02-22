import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class typecasting2 {
    /*so here we gonna to learn about the typecasting so in
    their 1st is the automatic conversion in which system automatically convert into a greater type of data liike
     intiger converted into the float as float it is of greater type so we can */



    //now their is force conversionn like say we want to convert the flaot in the intiger so for that we have to convert

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        int num = (int) 67.89;
        System.out.println(num);
        //so here we can see that float is converted into the intiger
        //simlary we can convert into the byte as
        int a =257;
        byte b = (byte) a ;
        System.out.println(b);
        //so answer 1 because in byte range to 256 so as we asing to 257 so it do that divide it and print out the
        // remainder value so 257%266 = 1 so it gives us one
        byte c = 50;
        byte d = 30;
        byte e = 100;
        int f = c*d/e;
        System.out.println(f);
        //so here as byte me multiplication hua so we to byte ke limit se exceed ho gya so acutally me java ne multiplicaton byte me nahi intiger me kiiya hai
//        like similary we can print out the asky values also
        int number = 'A';
        System.out.println(number);
        //so its give out the asky value of the A which is the 65

    }
}
