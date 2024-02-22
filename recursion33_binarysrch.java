public class recursion33_binarysrch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(find(arr,8,0,arr.length));

    }
    static int find(int[] arr, int target, int s , int e){
        if(s>e){
            return -1;
        }
        int mid = s+ (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s]<arr[mid]){
            if(target>arr[s]){
                return find(arr,target,s,mid-1);
            }
            return find(arr,target,mid+1,e);
        }
        if(target>arr[mid] && target<arr[e]){
            return find(arr,target,mid+1,e);
        }
        return find(arr,target,s,mid-1);
    }
}
