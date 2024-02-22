public class krapRabin_algo_74 {
    // so now here we are going to learn about the kraprobin algo here that's how it works here
    // so like when we have to srearch a string inside the other string then we can use this algo
    // this return the answer in the 0(n)
    // so now we use the hashmap here for the comprarasion here like we make the the hash and use that hash for the
    // comprasion
    public static void main(String[] args) {
        String first = "kunal ashok ritik";
        String second = "ashok";
        System.out.println(first.contains("ashok"));  // so now this function we can use but it is not giving the
        // index at which index this give

        krapRobin srch = new krapRobin();
        srch.search("kunal ashok ritik" , "ashik");
        // so when it is not present then it will give the answer to the nothing as thier is nothing the return statement
    }
}
class krapRobin{
    // so like here we will given the parent string and we have to search the child string inside it not in the
    // 0(quard) but in the 0(n) here
    private  final int prime = 101;
    // so now we use the prime type for calculation our own hash
    private double calculatehash(String str){
        // so now here we defin the hash
        double hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash += str.charAt(i)*Math.pow(prime,i);
        }
        return hash;
        // so now in this we can calculate our own hash according the our use here
    }
    // so now as we have to updat the hash as if we count the hash each time then it will be tedious and not so
    // efficient here
    private double updatehas(double prevhas , char oldchar , char newchar , int childlength){
        // so now here the thing we would subtract the oldchar value from it and new character value to it
        // like starting se 1st ko remove karnge so it will be the power 0 and ham piche se ek annge ka cahracter
        // badha denge as we are seraching like that so for that thing
        double newhash = (prevhas - oldchar)/ prime;
        // so now here new hash me previous hash ki value remove ho gayi hai so now we have to add the new character
        // hashvalue here
        newhash = newhash + newchar*Math.pow(prime , childlength-1);
        // so now here new has character value has been added here
        // note these all hasing is my own not of any algo we are using the prime number to get the variation in hash
        // as much as possibe so we are using it
        return newhash;
    }
    // so now as this two function as been created so now we have to create the
    // function for cheking  the has value is that contaion or not
    public void search(String parent , String child){
        // so now here we have to get the value of the length of the child so
        int childlength = child.length();
        // so now we have to calculate the hash of the child and parent hash till the child length
        double chilhash = calculatehash(child);
        // so now parent hash till the child length
        double parenthash = calculatehash(parent.substring(0,childlength));

        // so now we have to chek it
        for (int i = 0; i < parent.length() - childlength; i++) {
            // so here parentlength - childlength this becuase as i iterate then it can go out of the bound so
            // we have done this for not going it outof bound
            if(chilhash == parenthash){
                // so we have to check for the string if it is equal or not
                if(child.equals(parent.substring(i , i+childlength))){
                    System.out.println("string match found at the index of " + i);
                }
            }

            // so now otherwise we have to update it's value here for
            if(i < parent.length() - childlength){
                // so now we have to update it
                parenthash = updatehas(parenthash,parent.charAt(i) , parent.charAt(childlength+i),childlength);
                // so now it treverse each of the time
            }
        }
    }
}

