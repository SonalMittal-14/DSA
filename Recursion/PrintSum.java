public class PrintSum {
    public static void printSumN(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSumN(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSumN(1, 5, 0);
    }
}
