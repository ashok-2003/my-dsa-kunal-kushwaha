public class Recursion_Subset_Subsequence_39 {
    public static void main(String[] args) {
        System.out.println(skip3("aauhugauygyugauhapplehauah"));
        System.out.println(skip_app_not_apple("uewiurappleyghapp"));

    }
    static String skip(String orginal , String modified){
        // so here in this program we would write the code in which we have to return the array in which particular
        // word from the string will be removed and return the string without that word so like in this case we
        // have to remove the a form the word


        // so intilay we have to take the modifed string to be "" like that and then we have to do add the words in it
        if(modified.isEmpty()){
            return "";
        }
        char ch = orginal.charAt(0);
        if(ch == 'a'){
            return  skip(orginal.substring(1),modified);
        }
        else {
            return skip(orginal.substring(1),ch+modified);
        }
        // so in this recusrion we can see that each time it is creating the array so creating it without creating
        // the arrays so for that
    }
    static String skip2(String original ){
        if(original.isEmpty()){
            return "";
        }
        char ch = original.charAt(0);
        if(ch == 'a'){
            return skip2(original.substring(1));
        }
        else {
            return ch + skip2(original.substring(1));
        }
    }
    // simalalary we can also remove the string also if we want it for like if we want to skip the apple word in the
    // string we can also do that if we want like as the apple is of the word 5 words then we can skip it
    static String skip3(String original){
        if(original.isEmpty()){
            return "";

        }
        if(original.startsWith("apple")){
            return skip3(original.substring(5));
        }
        else {
            return original.charAt(0)+skip3(original.substring(1)); // char at  0 so waha ka miss na kare ye
            // value so we used that
        }
    }
    static String skip_app_not_apple(String org){
        if(org.isEmpty()){
            return "";
        }
        if(org.startsWith("app") && !org.startsWith("apple")){
            return skip_app_not_apple(org.substring(3));
        }else {
            return org.charAt(0)+skip_app_not_apple(org.substring(1));
        }
    }
}
