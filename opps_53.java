public class opps_53 {
    // so here we are going to learn about the interface as this solve the problem of the mutiplie inheritance
    // which we are not able to do earlier here we can do that
}

interface engine {
    // so here it is the interface
    static final int price = 67000;

    void start();

    void stop();

    void acc();

}
interface Break{
    void barek();
}
interface media{
    void start();
    void stop();
    // so these are the void start and the void stop here
}
class car implements Break,media,engine{

    @Override
    public void acc() {
        System.out.println("this is the acceleration of the car 1 ");
    }

    @Override
    public void barek() {
        System.out.println("this is the brake time for the car 1");
    }

    @Override
    public void start() {
        System.out.println("this is the start of the car 1");
    }

    @Override
    public void stop() {
        System.out.println("this is the stop of the car 1");
    }
    // so now we can see we can do it now as here we are overrideing
    // and we can see that we have inherit more than one class 
}
