package secondry;

public class moneyquestion {  //https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/
    // this is the qestion link
    public static void main(String[] args) {
        System.out.println(res(10));
        System.out.println(total(10));
//        System.out.println((1%7));
    }
    public static int totalMoney(int n) {
        int nums = 0;
        for(int i = 1; i <=(n/7)+1; i++){
            for(int j = i; j<=i+6 && j <=n; j++){
                nums+=j;
            }
        }
        return nums;

    }
    public static int total(int n){
        int nums = 0;
        int count = 0;
            for(int i = 1; i <=(n/7)+1; i++){
                while (count<=n) {
                    for (int j = i; j <= i + 6; j++) {
                        nums += j;
                        count++;
                    }
                }
            }
        return nums;
    }
    public static int res(int n){
        int nums = 0;
        int count = 0;
        int i =  1;
        while(i<= (n/7)+1){
                for (int j = 0+i; j<7+i; j++){
                    if(count<n){
                        nums+=j;
                    }
                    count++;
            }
            i++;
        }
        return nums;
    }
}
