import java.util.*;
// time complexicity of hufmman is 0(n*log n)
public class huffman_coding_77 {
    // so now here we will learn about how we can compress the data in the loosless behaviour here
    // so now main thing is we use the bit index to get converted it into the data here


    // so now here doin it
    public static void main(String[] args) throws Exception {
        String str  = "ashok";
        huffman hf = new huffman(str);
        System.out.println(hf.encode(str));
        String cc = hf.encode(str);
        System.out.println(hf.decode(cc));
    }

}
class huffman{
    // so now here we are creating a node which we will use for the storing data
    private class Node implements Comparable<Node>{
        int cost;  // so this represent the frequency here
        Node left;
        Node right;
        Character data;

        // so now creating the constructor which take the value of the cost and data
        public Node(Character data , int cost){
            this.cost = cost;
            this.data = data;
            this.left = null;
            this.right = null;
            // as initilay left and right is null
        }
        // so now writing it's own compare to method here because as node have different type of data
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
            // so now this is created for the mean heap here
            // as positive value means current node have greater value
        }
        // so this also contain the value of the charset here
    }
    // so now here we are creating the constructor the for huffan man
    // so now for the creating the string here we can use the huffaman codeer and decoder here
    HashMap<String , Character> decoder;
    HashMap<Character , String> encoder;
    // so here encoder and decoder are being created here
    public huffman(String  feeder) throws Exception{
        // so now here it takes string as the input as inside of the constructor we can create the treee
        // so now create the frequecy hasmap first of all
        HashMap<Character, Integer> frequencymap = new HashMap<>();
        // so now here we insert the data here
        for (int i = 0; i < feeder.length(); i++) {
            char ch = feeder.charAt(i);
            // so now we have to check first of all whether this data exits or not
            if(frequencymap.containsKey(ch)){
                // so now it means it has it value previouse so we have to update it
                int val = frequencymap.get(ch);
                val+=1;
                // so now we have increase it's frequency by the one now
                frequencymap.put(ch, val);
            }else {
                // so now it means it not have the value here previously so now put the value here
                frequencymap.put(ch , 1);
            }
        }
        // so nwo we have stored the value
        Heap<Node> minheap = new Heap<>();
        // so now we have created the mean heap so now we have to insert the data in it here
        // so now here we have to creat the set map entry
        Set<Map.Entry<Character , Integer>> entryset = frequencymap.entrySet();
//        he code is assigning the result of the entrySet() method to the entryset variable. This means that the entryset variable now holds a set of entries from the HashMap. You can use this variable to iterate over the HashMap or perform some operation on each entry.

        // so i have written the thing which i get from the online here
        // so now here we are inserting the value in the tree node to make the tree from the mean heap
        for (Map.Entry<Character , Integer> entry : entryset){
            // so now here we have to get the value inside of it
            Node node = new Node(entry.getKey(), entry.getValue());
            // so now we have stored the value here
            // so now we have to insert the valu in the node so for that
            minheap.insert(node);
            // so now values have been inserted in the minheap
            // so now it will automatically adjust the value inside of it
        }




        // this totoal mean heap concept i could not understand how it is doin here

        while(minheap.size() != 1) {
            Node first = minheap.remove();  // as throw calls throw the exception so we have to used this
            Node second = minheap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minheap.insert(newNode);
        }
        // only till this part i don't understand here

        Node firstnode = minheap.remove();
        // so now we are making the
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();
        // so now we have to make a function which fill all the data in both encoder and decoder here
        this.encoderdecoder(firstnode , "");

        // so all of these run when the program run then it do all of the run automatically here
    }
    private void encoderdecoder(Node node , String str){
        // so now here we will put the value in the both of the hashmap here
        if(node == null) return;
        // so now if we are at the leaf node then we have to put the value
        // for the left we have to put value to the 0 and 1 for the right
        if(node.left == null && node.right == null){
            // so now we have to put the value here
            this.encoder.put(node.data , str);
            this.decoder.put(str , node.data);
            // so now this is how we have to put the value so now we have to run the rucursion
        }
        encoderdecoder(node.left , str+'0');
        encoderdecoder(node.right , str+'1');
        // so this is how the recursion works here
    }
    // so now we have to make the encode and decode program which will be public and will be run
    public String encode (String str){
        // so now we have to encode the string into the byte array here
//        Byte[] arr = new Byte[];// so now we don't know the size so for this we have to use something
        // like we can use the byte set
        Set<Byte> byteset = new HashSet<>();

        // as we are not able to retirive the data so using the string for now
        String ans = "";
        // so now we are using the byte set here
        // so now we have to encode the data
        for (int i = 0; i < str.length(); i++) {

            // so this giving us the erroe as this give result as the string but we are storing as byte
            ans = ans+encoder.get(str.charAt(i));
        }
        return ans;

    }
    // similary we can do the same thing for the decode

    // this is not working don't know why but not working here


//    public String decode(String str){
//        // so now we can use the string buffer class here
//        StringBuffer sb = new StringBuffer();
//        // so now we can add all data here in it
//        String key = "";
//        for (int i = 0; i < str.length(); i++) {
//            key = key + str.charAt(i);
//            if(decoder.containsKey(key)) {
//                sb.append(decoder.get(key));
//            }
//            key = "";
//            // so again reseting the key agian here
//        }
//        // so now we have to return it as the stirng
//        return sb.toString();
//    }


    public String decode(String codedString) {
        String key = "";
        String ans = "";
        for(int i=0; i<codedString.length(); i++) {
            key = key + codedString.charAt(i);
            if(decoder.containsKey(key)) {
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
