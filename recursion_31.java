public class recursion_31 {
    public static void main(String[] args) {
        // this program count the number of zero in the given number
        System.out.println(count(40503739));

    }
    static int count(int n ){
        // so in it we are writing a program for the to count the number of the zerozes in the number
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n== 0){
            return c;// so jab n ka value equal to zero hoga to count ko hi return kar dega
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10,c+1);
            // as here we see it is counting out the zero so count me +1 ho gaya
        }
        return helper(n/10,c);// as else case me nahi hua waisa so yaha same hi reh gaya hai
    }
}
