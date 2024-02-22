public class recursioon_30 {
    public static void main(String[] args) {
        count(6);
        rev_count(6);
        System.out.println(factorial(6));
        System.out.println(sumdigit(45));
        System.out.println(multipledigit(345)); // don't know how it is working don't know why
        System.out.println(reverseofnumber(23456));

    }
    static void count(int n ){
        // so here we have to write the code to print the number only lower than it
        if(n== 0){
            return;
        }
        System.out.println(n);
//        count(n-1);



//        count(n--);// this will give me error because their is difference between the n-- and --n
        //  n-- me value liya then uske badd kam karta hai so har barr same hi value le lega that's why it will give us
        // error so we can use --n for that purpose



        count(--n);
    }// so this count in the reverse order so we have to find another method
    static void rev_count(int n ){
        if(n == 0){
            return;
        }
        rev_count(n-1);
        System.out.println(n);// so we can see one line change makes how much if a difference this because as iss walle
        // me pahle stack me number khul rahe hai then one ke badd wo apne app wo print out kar de rahe hai number
    }
    static int factorial(int n ){
        if(n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sumdigit(int n){
        if(n<=0){
            return 0;
        }
        return sumdigit(n/10)+n%10;
    }
    static int multipledigit(int n){
        if(n%10==n){
            return n;
        }
        return multipledigit(n/10)*n%10;
    }
    static int reverseofnumber(int n ){
        // so here we basically gonna to do the reverse of the number
        // as we have learn that to find the number of the digit we can do like math.log function use
        int count = (int)Math.log(n)+1;
        return helperofreverse(n,count);
    }
    static int helperofreverse(int n , int count){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,count-1) + helperofreverse(n/10,count-1);
    }
}
