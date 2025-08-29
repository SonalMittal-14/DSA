package Recursion2;

public class findOcurrance {
    public static int first = -1;
    public static int last = -1;

    public static void occuranceFind(String str, int index, char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        occuranceFind(str, index+1, element);
    }
    public static void main(String[] args) {
        String str = "abcdabcdab";
        occuranceFind(str, 0, 'a');
    }
}
