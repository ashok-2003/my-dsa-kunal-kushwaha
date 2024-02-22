import java.util.Arrays;

public class binary_search_2d_17 {
    // so in binary search in 2 d isme array sorted rehta hia row and coloumn wise usme ham serch karnge
    public static void main(String[] args) {
        /*
        so in this hamre pass target hai so ab hame start and end element rahega so ham s
        start index lenge row ko 0 lenge and end hamra last walla coloumn rahega so now agar ham target elemnt
        last walle element se choota hai to ham row ++ kara denge other wise ham col-- kar denge so
        isme hamra no.of step n + n ayya hia so complexcity hoga log(n) as ham consetang ko ingonre kar dete hia n


        like in this example
        [[1,3,5,7],
        [10,11,16,20],
        [23,30,34,60]]
        so ham start 1 se karnge and end elemnt 7 hoga let stay we are searching for the 3 so
        hamra 3 < 7 so ham row ++ kar denge now row 1 and 5 tak hamra reduce ho gaya matrix so now ham
        5 > 3 so ham again row ++ kar denge now hamr matrix 3 pr ayya and we found the answrr

        now let suppose we are searching for the 34 so now in that case 34 > 7 wo col -- so now 1st cololum is eleminated
        as uska bada element hi target se chotta hia so we do not need that coloumn so now
        same 34 > 20 so now col -- so now 60 > 34 so now space reduce to 23 30 34 so now == 34 answer found
         */
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = 3;
        System.out.println(Arrays.toString(binarysearch_2d(matrix,target)));
        // now we have missed the case of the row and coloumn matrix i.e 1d arrays so for that we have to also work
    }
    static int[] binarysearch_2d(int[][] matrix , int target ){
        // so now take the starting and end elment
        if(matrix.length==1){
            return binarysearch1d(matrix,target,0,0,matrix.length-1);
        }
        // we acutually don't need this if we use the row = matrix[0].length as for this see the example of the leetcode problem that we have soleved
        //  https://leetcode.com/problems/search-a-2d-matrix/?envType=list&envId=rmev31h3
        // here is the problems given
        int r= 0; // refers to the row
        int c = matrix.length-1; // refers to the col
        while(r < matrix.length && c>=0){
            if(matrix[r][c]== target){
                return new int[]{r,c};
            }
            if(matrix[r][c]>target){
                c--;
            }
            else {
                r++;
            }

        }
        return new int[]{-1,-1};
    }
    // row is horizontal and coloumn is the vertical
    static int[] binarysearch1d(int[][] matrix, int target , int row , int cstart , int cend ){
//        row = 0;
//        cstart= 0;
//        cend= matrix.length-1;
        while(cstart<cend){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid]== target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]>target){
                cend = mid -1;
            }
            else{
                cstart = mid +1;
            }
        }
        return new int[]{-1,-1};
    }
}
