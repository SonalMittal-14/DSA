package Recursion2;

public class ReverseString {
    public static void stringReverse(String str, int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index)); // har level pe value print hogi
        stringReverse(str, index-1);//and then we call index-1
    }
    public static void main(String[] args) {
        String str = "harish";
        stringReverse(str, str.length()-1);
    }
}
