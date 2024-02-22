public class opps_47 {
    // so now here we goona to learn about the inner class
    static class test1{
         String name;
        public test1(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test1 ashok = new test1("ashok");
        test1 ritik = new test1("ritik");
        test2 amrit = new test2("amrit");
        test2 ayush = new test2("ayeush");

        System.out.println(ashok.name);
        System.out.println(ritik.name);
        System.out.println(amrit.name);
        System.out.println(ayush.name);

    }
}
class test2{
    static String name ;
    public test2(String name ){
        test2.name = name;  // as here we can see it is giving ayush as we have done that we have modiefed the name of the
        // classs so it is giving ayush in both of them 
    }
}
