import java.util.Scanner;

public class ZerosMovement {

    // Zeros ko end me shift karne wala method (swap logic ke saath)
    public static void zeroAtTheEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method to move zeros to the end
        zeroAtTheEnd(arr);

        // Print the updated array
        System.out.print("Array after moving zeros to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
