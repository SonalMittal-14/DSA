import java.util.Scanner;

public class SecondLargestno {

    public static int findSecondLargest(int[] arr) {
        int max = -1;
        int secMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = findSecondLargest(arr);

        if (secondLargest == -1) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("Second Largest Number: " + secondLargest);
        }

        sc.close();
    }
}
