import java.util.ArrayList;

public class recursion_permutation_41 {
    /*
     now their is the difference between the permutation and the subsequence as thier in the permutation all elemtn
     should be present their where as in the case of the subsquence if all elemtnt are not present no issue as
     it can contain one element also as it contains the subset of it
    */
    public static void main(String[] args) {
        prmutation("","abc");
        ArrayList<String> ans = permu("","abc");
        System.out.println(ans);


    }
    static void prmutation(String p , String up){
        /* so here two strings are present their in which one is processeds and another is unprocessed so now as in the
         the case of the permutation here number of recuriion call is not fixes accutuall if differs in each step
          so we have to do it using the loop for the recursive call so now here we can do the thing which is */
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {  // so this run for the length of the process as we have seen if the
            // process length is 1 then number of the recursion call that we get is 2
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
            prmutation(first+ch+last,up.substring(1));
            // so here it will work according to the length of the process
        }
    }
    // now returning in the arraylist
    static ArrayList<String> permu(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();  // this arraylist contains my answer

        for (int i = 0; i <= p.length(); i++) {
            // here we have to make the permutaiton call
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            ans.addAll( permu(f + ch + l, up.substring(1)));
        }
        return ans;

    }//don't know why this function is not giving the answer i just don't know
}
