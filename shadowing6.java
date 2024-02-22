public class shadowing6 {
    //so in showding we basically define the values above the main function group so this value can be utilies by any of the function defined below it
    static  int x = 10;

    public static void main(String[] args) {
        System.out.println(x); // so now we can see that it not giving any error and printing the value from the above
        int x = 30 ;
        System.out.println(x);// now it will print out from the local variable so it over shodow the upper value so know as shodowing
        func();//so it will print 10 the sabse upar wall because main ka value main me hi reh gaya and iska upar walle universal se lega value
    }
    static void func(){
        System.out.println(x);
    }
}
