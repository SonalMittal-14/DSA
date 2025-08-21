public class PrintSum {
    public static void printSumN(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSumN(i+1, n, sum);
        System.out.println(sum); // gives the sum as it goes down
    }
    public static void main(String[] args) {
        printSumN(1, 5, 0);
    }
}
