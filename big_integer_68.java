import java.math.BigInteger;

public class big_integer_68 {
    // so here we will study about how we can store the big data out here so for that we use the biginterger
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(67879); // so it take the long as the input if we enter the very large
        //data then it will show us the error so
        BigInteger b = BigInteger.valueOf(748);
        // so what if we want to store the big data so for that we pass it in the string with the creating the
        // new object so like
        BigInteger c = new BigInteger("74387998430949895398539085398385943989384598");
        BigInteger d = new BigInteger("5437857387358583772279627467326749637493");
        // so now for adding we can not do like adding + symbol so for this we use the add method
        BigInteger e = a.add(b);
        System.out.println(e);
        BigInteger f = c.multiply(d);
        System.out.println(f);
        // so here in thses we can do all of the thing like multiply divide subtract and remaindet all of the stuffs
        // just see in and explore
        System.out.println(factorial(87784));
    }
    public static BigInteger factorial(int n){
        // so now we have to calulate the factorail of the big nubmer
        BigInteger mul = BigInteger.valueOf(1);
        for(int i = 2; i<=n;i++){
            mul = mul.multiply(BigInteger.valueOf(i)); // as here we can't just directly pass the i so doing it
        }
        return mul;
    }
}
