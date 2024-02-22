import java.util.ArrayList;

public class recursion_32 {
    // so here we are gonna to learn recursion for the arrays and all so here it will be
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,6,6,6,7};
        System.out.println(checksorted(arr,0));
        //program for the linear search using the recursion which tell us that whether element present in the array or not
        System.out.println(linearsrch(arr,10,0));
        //program to find the all values in the linear search
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findall(arr,6,0,list);
        System.out.println(ans);


    }
    static boolean checksorted(int[] arr , int index){
        // base condition
        if(index == arr.length-1){
            return true; // so as it reches the last succesfully then it can't compare it self with any one so it
            // return the true by it's default
        }
        return arr[index]<arr[index+1] && checksorted(arr,index+1);
    }
    static boolean linearsrch(int[] arr , int target,int index){
        // so here we have to do the linear search so in this when out of bound the return false
        if(index == arr.length){
            return false;
        }
        return (arr[index]== target || linearsrch(arr,target,index+1));
    }
    static ArrayList findall(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findall(arr,target,index+1,list);
    }
    // now we can create a function in which list is not passed in the argument so in that case every time new list is
    // being created so we will write the code of it
    static ArrayList findall2(int[] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        // so this list will add value in the list every time in creating the new list
        ArrayList<Integer> allansfrombelow = findall2(arr,target,index+1);
        list.addAll(allansfrombelow);
        return list;
    }// in this object is created again and agian so don't use it
}
