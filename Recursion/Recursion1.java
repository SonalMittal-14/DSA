public class Recursion1 {
    public static void printNumber(int n){
        if(n == 0){ //Base condition
            return;
        }
        System.out.println(n); // Printing the number
        printNumber(n-1); // Recursion
        System.out.println(n); // Printing the number as the stack comes down
    }
    public static void main(String args[]){
        int n=5;
        printNumber(n);
    }
}
