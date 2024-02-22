import java.util.ArrayList;

public class Recusrion_subsequence_40 {
    // so here in this subsequence is about the thing like the total permutation combination of abc  so the
    // combination here made is like the   we can get [ a, b , c , ab , bc , ac, abc] so these are the all
    // combination we have got so far so we have to print it out


    /*
    so baisc concept for it we can do is like  in abc  first take a then make the case like take it and leave it
    so we get like  a/ bc and ""/bc  so now as per recursion we get like  now in a / bc now pointer on the b so
    now take it or leave it so now it will form like ab/c and  a/c
     so now in the this contere on the c so now it will form the abc/ ""
          so when ever we get like the "" i.e empty then just add that value means that the one
          subsequence that we have got here
     */
    public static void main(String[] args) {
        subseq("","abcd");
        System.out.println(sub("","euryeu"));

        // program to get the ascii value of the character
        System.out.println(asii_value('a'));

    }
    static void subseq(String proces, String unproces){
        if(unproces.isEmpty()){
            System.out.println(proces);
            return;
        }
        // so now we have to divede the array as we have written the base condition
        char ch = unproces.charAt(0);
        subseq(ch+proces,unproces.substring(1));  // this with the take the value
        subseq(proces,unproces.substring(1));
    }
    // so now what if you want to return the array list then what we have to do
    static ArrayList<String> sub(String proces , String unproces){
        // so now as this is array list so we have to return the string when it's empty
        if(unproces.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(proces); // so here the process is get added in the list each time when it's returning the empty
            // one of the value
            return list;
        }
        char ch = unproces.charAt(0);
        ArrayList<String> left = sub(proces,unproces.substring(1));
        ArrayList<String> right = sub(ch+proces,unproces.substring(1));
        (left).addAll(right);   // so this line adding the all value in the one string
        return left; // we can return any one left or right any one we want


        // so this is how it work first we make the left and right array list for that include and not include value
        // then we add both of them in one and then return the list
    }
    static int asii_value(char ch){
        return ch+0;
    }
}
