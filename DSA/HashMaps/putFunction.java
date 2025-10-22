package HashMaps;

import java.util.*;

public class putFunction {
    static class HashMap<K, V> { // HashMap data structure | generics | because kuch bhi type ho sakta h toh type baad mai define karenge abhi ke lia parameter intialize kar diya h 
        private class Node{
            K key;
            V value;

            public Node(K key, V value){ // linked list ki node 
                this.key = key;
                this.value = value;
            }
        }
    }
    private int n; // nodes 
    private int N; // buckets 
    private LinkedList<Node> buckets[]; // N = buckets.length -->> basically mera hashmap hai 

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N =4;
        this.buckets = new LinkedList[4];

        for(int i=0; i<4; i++){
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key){

    }

    public void put(K key, V value ){
        int bi = hashFunction(key);
        int di = searchinLL(key, bi); // data index  

        if(di == -1) { // key does not exist
            buckets[i].add(new Node(key, value));
        } else { // key exist

        }
    }

    public boolean containsKey(K key){
        return false;
    }

    public V remove (K key){
        return null;
    }

    public V get(K key){
        return null ;
    }

    public ArrayList<K> keySet(){

    }

    public boolean isEmpty(){
        return false;
    }
}
