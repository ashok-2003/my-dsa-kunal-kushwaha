public class recursion34_pattern {
    public static void main(String[] args) {
        traingle(5,0);  // this print the reverse of the traingle
        traingle2(5,0); // this print the simple traingle
    }
    static  void traingle(int r , int c){
        // so basically ham isme traingle print karnge jo ki ulta side se tariangle ko print karega
        // ham isme kitne row tak ka chaiye wo dall denge then wo uss hisab se ek kam karke * print
        // karega kudh se hi apne aap so this is how this program will work
        if(r == 0){
            return;
        }
        if (r>c){
            System.out.print(" * ");
            traingle(r,c+1);
        }
        else {
            System.out.println(); // this will print the new line then the function will get excuted
            traingle(r - 1, 0); // coulumn get reset when the line get printed
        }
    }static  void traingle2(int r , int c){
        // so basically ham isme traingle print karnge jo ki ulta side se tariangle ko print karega
        // ham isme kitne row tak ka chaiye wo dall denge then wo uss hisab se ek kam karke * print
        // karega kudh se hi apne aap so this is how this program will work
        if(r == 0){
            return;
        }
        if (r>c){
            traingle2(r,c+1);
            System.out.print(" * ");
        }
        else {
            traingle2(r - 1, 0); // coulumn get reset when the line get printed
            System.out.println(); // this will print the new line then the function will get excuted
        }
    }
}
