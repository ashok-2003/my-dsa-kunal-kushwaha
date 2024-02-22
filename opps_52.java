public abstract class opps_52 {
    // so now we are learnig about the abstract class and interfreace
    // so here we first of all learn about the abstract class which are shown below here
    // so in this thier we would not create the object

    // like we can create the abstract class thier
    abstract void carrier();
    abstract void daughter();

    int age;
    public opps_52(int age){
        this.age = age;
    }
    // so we can create the constructor out their
    static void hello() {
        System.out.println("this is normal class here ");
    } // as this is static out their so we can use static out their
    void normal(){
        System.out.println("this is the normal class here ");
    }
}
class son extends opps_52{
    // so here all you see are the basic we have to write all of this for not getting the error for at least once
    // as this should bare minimum for not giving the error

public son(int age) {
        super(age);
        }

@Override
    void carrier() {
    System.out.println(" i choose the carrier for coding ");
    }

@Override
    void daughter() {
    System.out.println(" i dont't know what to write here ");
    }
}

class daughter extends opps_52{
    // so here all you see are the basic we have to write all of this for not getting the error for at least once
    // as this should bare minimum for not giving the error

    public daughter(int age) {
        super(age);
    }

    @Override
    void carrier() {
        System.out.println(" i choose the carrier for doctor ");
    }

    @Override
    void daughter() {
        System.out.println(" yes i'm the daughter  ");
    }
}
class main{
    public static void main(String[] args) {
        // so here  we gonna run the code for the all of the above
        daughter one = new daughter(56);
        one.carrier();
        son two = new son(34);
        two.carrier();
        two.daughter();
        two.hello();  // so heer it is giving me to accees it by the help of the opps class name as it is static
        opps_52.hello(); // so now this is not giving in any colur
        two.normal();
    }
}


