import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt(); // numbers input karvaye
            }
        }

        // System.out.println("Output row is : ");

        // output
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        int x = sc.nextInt();
        boolean found = false;

        // Search
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.println("x is found at (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number not found");
        }
    }
}
