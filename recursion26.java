public class recursion26 {
    // so now we will learn about the recursion so recursion is basically when a function call another function inside
    // of it so it will be know as recursion

    /*
    here we are going to learn about the how the memory works
    primitve are stored in the stack memory
    all functions while running are stored in the stack memory and when they are being exucuted or we can say completed
    then they get removed from the stack memory and function being restored to the where the function was called

    so basically main thing is while a fuction is being called or used it will stay in the stack memory tiil then
    recursion is basically when the function calls it  self then we call it as the recursion

     */
    /*
    why we use the recursion so because
    we can breake down the bigger problem into the smaller problem
    and we will be able to replace it by for or while loop as we able to understand the problem


    now we are converting it into the interation of the for or while loop because as we have seen recursion acquire
    more of the space and often result in the stack overflow if not done properley so that's why
     */
    public static void main(String[] args) {
        print(1); // for printing the number from 1 to 5 we uses it for that
        System.out.println(fibbo(6));
// so it return the fibbonaich number at the that index of the the fibbonachi serise
        int[] arr = {1,3,5,8,23,45,67,89};
        int target = 45;
        System.out.println(binarysrch(arr,target,0,arr.length-1));

    }
    static void print(int n ){
        if (n==5){  // this is know as base call
            System.out.println(5);
            return;// so this case because 5 ke baad function ko run karna stop karna hai so that's why we used it
        }
        System.out.print(n);
        print(n+1);// here every time it call it stays in the stack memory every time it call it taking the each
        // diffrent call it occupy stack memory every time
        // so if thier is no base condition then it occupy stack memory and at the one time stack will run out of the
        // memory then it will give the stack overflow error

    }
    static int fibbo(int n){
        // base condtion added
        if (n<2){
            return n; // so as fibbonachi of 1 is 1 and fibbonachi of 0 is 0 so thats how we have added the base condition
        }
        return fibbo(n-1)+ fibbo(n-2);// so this is the recursion for that that will call function
        // so working of the fibbonachi serise
        /*
        as here in it as recursion me 2 function call ho rahe hai like take the example of the 4 so recursion of the 4
        will call out the recursion of the 3 and 2 so now here left will execute first i.e recursion of 3 ki trf jaynge
        ham log so now recrsion of 3 equal to 2 and 1 ka so now again left ki trf jaynge so now 2 ko slove karnge so
        it has made up of the 1 and o
        now we get the value of these two so now we get the sum of these value now 2 is closed now right
        so in 3 is made up of the 2 and 1 so now 1 is 1 so sum those two we get 3 so now again go to right so now again
        4 was made up of 3 and 2 so now 2 ke side same process repate karnge



        notice one thing this is recursive tree as bhut sarre ek sath stakc memory me khul rahe hai so isme pahle
        left walla ko exucute karnge ham log then right walla execute hota hai that's how tree works
         */

    }
    static int binarysrch(int[] arr , int target ,int start , int end){ // so as we can see here we have put start end
        // here only as this problem would be solve by the recursion then each time the start and end index would be changed
        int mid = start +(end-start)/2;
        // int mid is definded variable in the body because as we can see ye to har barr s+e / 2 hi hai
        if (arr[mid]== target){
            return mid;
        }
        if(arr[mid]>start){
            return binarysrch(arr,target,mid+1,end);
        }
        return binarysrch(arr,target,start,mid-1);// else condition
        // so here in the recursion if we are returing any data type then write condtion in such way that in every c
        // condition it return the type of that data

    }
}
