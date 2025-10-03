import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String[] args) {
        // Craetion of Hashset
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("size of set is : "+ set.size());

        // printing all elements of set
        System.out.println("all elements of set are : "+ set);
        
        // searching
        if(set.contains(1)){
            System.out.println("set contain 1.");
        }
        if(!set.contains(6)){
            System.out.println("does not contains 6");
        }
        
        // deletion
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contains 1 .... coz we deleted it ");
        }
        
        System.out.println("size of set after deletion is : "+ set.size());
        System.out.println("all elements of set after deletion  are : "+ set);


        // Iteration
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}