public class SQURdecompstion_78 {
    // so now here we will see the algorothim which will run the square root time complexicity
    // so now here this is used when we have to do something in the range so for that we have to deal with the
    // qurrey here  and like we have to sum the
    // of the range like form this index to this index so for that it will take the 0(n)
    // so now for this to solve it in the shorter time we can use the this with the complexicity of the
    // squart

    public static void main(String[] args) {
        // so so seeing it giving us the answe or not
        int[] arr = {1,2,5,7,8,4,9,10,7,4,2};
        System.out.println(square(arr , 2 , 5));
    }
    public static int square(int[] arr , int left , int right){
        // so now here we have to take the length and take the square root of it
        int n = arr.length;
        int sqrt = (int)Math.sqrt(n);
        // so now we have to create the array of the block wchich will deal with the block here
        int[] blocks = new int[sqrt+1];
        // so now we have to also create the block id also here
        int blockId = -1;
        for (int i = 0; i < n; i++){
            // so now here we have to check for the blocks here
            if(i%sqrt == 0){
                // so it means now my block is complete so now
                blockId++;
            }
            // so now we have to make the sum so making for that only
            blocks[blockId] += arr[i];
            // so it has now done the sum in the blocks here so now for our querry here
        }
        // so now call my querry fucntion here


        return querry(arr , blocks , left , right , sqrt);
    }
    private static int querry(int[] arr , int[] blocks  , int left , int right , int sqrt){
        // so now here we make the ans
        int ans = 0;
        // so now here we have to chek for the left then middle then the right
        // as here as we iterate then also time is squareroot of  n this because as here as it is going to the chunks
        // from the last and the starting here that's why this
        while(left% sqrt !=  0 && left != 0 && left < right){
            // so now we have to add the elment in the array
            ans += arr[left];
            left++;
        }
        // so now we have to write the middel case
        while(left + sqrt <= right){
            // so now we have to add the whole block here
            ans += blocks[left/sqrt];
            // so now it added the whole block
            left += sqrt;
        }
        // so now for the right par ther e
        while(left <= right){
            // so now we have to agian add the value simplye here
            ans+= arr[left];
            left++;
        }
        return ans;
    }
}
