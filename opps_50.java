public class opps_50 {
    /*
    so here we are learing abut ther acces control  */
    private int num;
    protected int num2;
    public int num3;
    int num4;
    // so now we will see how all of it get used
    //as we have see we can use the public everywher

    public opps_50(int num , int num2,int num3,int num4) {
        this.num = num;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    // now as we make private so how we will accese so for that their is getter for getting the value of it
    // and thier is setter for changin the value for like we want

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // now their are different types of the override method available in java we can write here

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    // one is string here we have used it

    @Override
    public String toString() {
        return super.toString();
    }
    // so these all the override method which we can use out
}
class first{
    // so now accesing all of it
    public static void main(String[] args) {
        opps_50 obj = new opps_50(2,4,6,8);
//        System.out.println(obj.num);   //as we can see here we cannot acces the private
        // but we can acces the num by getter  class
        System.out.println(obj.getNum());   // so by getter we can see we have gotten the private int
        obj.setNum(10);  // so here we setted the num
        System.out.println(obj.getNum());  // so here we have change the private here so we have to give
        // as we know we can here acces the all
        System.out.println(obj.num4);
    }
}
