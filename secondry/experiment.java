package secondry;

public class experiment {
    /* so here we have created the package and we are testing how the package work in java
    so now here we would write the code that we can run in the other file from the opps and we will see how  */
    public static void message(){
        System.out.println("hello this code is from the different package");
        // so now as it is static so we can use it any where and it is public
    }
}
 class inthesame{
    public static void main(String[] args) {
        experiment.message();  // so we are running the it from the different class
    }
}

