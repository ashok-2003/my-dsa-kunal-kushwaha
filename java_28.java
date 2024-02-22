public class java_28 {
    public static void main(String[] args) {
        // this tells us the number of digit when the number is converted into the binary form
        System.out.println(numberofdigit(10035));
        System.out.println(numberofdigit2(10035));
        // these determine whether the number is the power of 2 or not
        System.out.println(powoftwo1(6));
        System.out.println(powoftwo2(8));
        // so this will tell us the answer of base and power
        System.out.println(basepower(3,6));

    }
    static int numberofdigit(int n ){
        // so in this will tell us the number of digit when the number is converted into the binary form that is
        // wo kitna space occupy kar raha hai like 6 is like 110 so ye 3 digit ko occupy kiya

        // so we can make this program in 2 way
        // 1. using the right shift
        // 2. using the formula
        int count = 0;
        while(n>0){
            n = n>>1;
            count++;
        }
        return count;// so this will return the number of digit
    }
    static int numberofdigit2(int n ){
        int count = (int) (Math.log(n)/Math.log(2));
        return (count +1);
        // so basicaly formula ye hai ki binary me kitne digit honge wo depend karega ki uska log ka power kya hia
        // like for 6   log 6 base 2 is 3 so ans is 3+1 = 4 so ye answer hua number of digit so by use of this
        // formula we can find that the number of digit of the number
    }
    public static boolean powoftwo1(int n ){
        // so this program will check whether the number will be represented as the power of 2 or not
        // for that it have now again two ways to do it so first is
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        if(count == 1){
            return true;
        }
        return false;
    }
    public static boolean powoftwo2(int n ){
        // so here we will do it with the help of the bitwise operator
        if((n & (n-1)) == 0){  // so basically iska explanation hamne copy me likha hai you can check it
            return true;
        }
        return false;
    }
    public static int basepower(int base , int power ){
        // so now here we will see when we have to find the the base power ka less complexicity walla question
        // like for the  base 3 to power 6 = 729 so like that we will see
        // we will do that by converting the power 6 into the binary so that we can solve ealsiy
        int ans = 1;
        while (power>0){
            if((power&1) == 1){
                ans = base*ans;
            }
            base*=base;  // this mean base = base *base
            power = power>>1;
        }
        return ans;

    }
}
