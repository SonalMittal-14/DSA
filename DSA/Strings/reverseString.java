import java.util.Scanner;

public class reverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
    // Complexity -> O(n)
}
