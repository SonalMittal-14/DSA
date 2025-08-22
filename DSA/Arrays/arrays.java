import java.util.*;
public class arrays{
    public static void main(String args[]){
        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;

        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input lene ke lia
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // System.out.println("Output is :");

        // output lene ke lia 
        for(int i=0; i<numbers.length ; i++){
            if(numbers[i]==x){
                System.out.println("x is found : "+i);
            }
        }
        
    }
}