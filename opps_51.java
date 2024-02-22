public class opps_51 {
    // so now here also we can also acces the content of the opps 50 thier
    public static void main(String[] args) {
        opps_50 obj = new opps_50(2,4,8,5);
        System.out.println(obj.num2);
        System.out.println(obj.num4);
        System.out.println(obj.num3);
//        System.out.println(obj.num);  // so only this one is giving the error
        // so now i don't know how it is working here
        int i = obj.hashCode();
        System.out.println(i);
        // so here we can chek by cheking the two object out here
        opps_50 myobj = new opps_50(2,4,8,5);
        if(obj == myobj){
            System.out.println("both are equal by eqaul method ");
        }
        // so now this will give error becuase here == compare the by object refrence not by variable
        // like we can see that if we make the different object to refer the same varialbe so this will give the value
        opps_50 second = obj;
        if(second == obj){
            System.out.println("this are equal by comparsion of== method ");
        }
        // so we use the equal method here
        if(obj.equals(myobj)){
            System.out.println("this both are equal by equal method here ");
        }
        // i think this is not working because we have private int their
        // no the main reason here is because this is comparing by the hash value which is different for both here
        // so this is not giving any output out here that's the main reason

    }
    // we can copy any classes in java using the fn + f5 
}
