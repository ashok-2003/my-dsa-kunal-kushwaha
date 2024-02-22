import java.util.Arrays;

public class java_math29 {
    public static void main(String[] args) {
        // for checking out the prime number
        System.out.println(prime(5));
        // their is a boolean array in which all the elements by default contains the false as the index in it
        int n = 40;
        boolean[] primes = new boolean[n+1];
        totalprime(n,primes);
//        System.out.println(Arrays.toString(primes));

        // program to find the factors of the number is here
        factor(n);
        System.out.println("..");
        System.out.println(gcd(3,9));
        System.out.println(gcd_lcm(4,6));


    }
    public static boolean prime(int n ){
        // so here we are checking for the prime number where the number is prime or not so in this thing hame steps
        // jyda nahi chanlne hote hai we have to take less steps  so jo loop hai wo run karega till square root tak
        // run hota hai loop
        int x = (int)Math.sqrt(n);
        for (int i = 2; i < x + 1; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
        //this program returns the prime as the true as false as non prime number
    }
    public static void totalprime(int n, boolean[] primes){
        // so int n is the last index of it at which we have to check it in optimal way so for this again we will
        // check till the square root and we will ignore the mutliple of the prime as it would not be prime and
        // remaing number greater than the square root will be prime as it self
        for (int i = 2; i*i <=n ; i++) {
            if(prime(i)== true){
                for (int j = i*2; j<=n; j+=i ){// this is j+=i because we are taking the multiple of it that's why and
                    // we have done i*2 because it is the multiple which is not prime that's why
                    primes[j]= true;
                }
            }

        }
        // so this return prime as the false and non prime as the true in it this is how it done
        for (int i = 2; i <= n; i++) {
            if(primes[i]== false){
                System.out.print(i+" ");
            }
            

        }
        // space complexcity is 0(n) as array is being created
        // time complexicity is 0(n*log(log(n)))


    }
    public static void factor(int n){
        // so this program will tell us the factor of a number so thier is two way to do it 1st is like we can do by
        // simply running a for loop in which if i divide the number then its is the factor otherwise it will not
        // but the second way is as when the number divide then like 20/2 =10 so 2 and 10 both are the facotr
        // so loop acutually run the square root times and it would get store
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" "+n/i+" ");
                }
            }
            // so time complexicity is 0(squareroot of n)
        }
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;// like as the gcd of 300 and 0 is 300 similary gcd of 100 and 0 is 100
        }
        return gcd(b%a,a);  // so this is basically gcd to find out the recursion
    }
    static int gcd_lcm(int a , int b){
        return (a*b/gcd(a,b));
        // so this is lcm using the gcd of the number
        // so baically lcm nikalne ke liye ham dono number ko mutiply kar rahe hai then gretaest common factor se
        // divide kar rahe hai so lowest common multiple bas left ho ja raha hai
    }
}
