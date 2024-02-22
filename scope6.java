public class scope6 {
    public static void main(String[] args) {
        //so now we gonna to study about different types of the scope of the function

        //function scope that we studied earlier that fuction wall jo ham create karte hai wo use andar hi
        //rehta hai uske bahar nahi atta wo so we can use that at only that place only

        // now 2ND BLOCK TYPE

         int a = 10 ;
         int b = 20 ;
        {
            //so this is the block inside the main function so in this
//            int a = 30; so this not gonna to work out as ye upar pahle se definded hai so is namm ka dusra object nahi banetga
            int c = 30 ;  //ye jo variable assing hai ye iske andar hi rahega iske bhar nahi print hoga
            System.out.println(c);
            a = 100;
            System.out.println(a);

        }
        System.out.println(a); //so as we can see a ka value 10 se 100 hoga because changes main me pass hua hai because yaha koi bhi copy create nahi hua hai
//        System.out.println(c);// so as we can see it giving us the error
        int c = 50; //as we can see andar jo defined hai int c usse koi mtlb nahi hai bhar bhi ham define kar sakte hai
        System.out.println(c);//and bhar ka value separete hi print hua irrrespective of the andar walla


        // SO BASICALLY IN SCOPE JO BAHR KA DEFINED HAI USSE YE USE KAR SAKTA BUT ISKE ANDAR WALLA DEFINDED KO BHAR  NAHI HAM USE KAR SKATE HAI


        //  THIS SIMILAR THING APPLY FOR THE --------FOR LOOP-------- Also
    }
}

