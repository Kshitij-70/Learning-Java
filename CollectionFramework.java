import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class Main{
    public static void main(String[] args) {

        // List : Its an ordered collection which can have duplicate values
        // Array List (It is asynchronized and Fast)
        ArrayList<String> al=new ArrayList<>();
        al.add("DPK");
        al.add("AK");
        al.add("DH");
        al.add("KK");
        System.out.println(al);
        al.remove(0);
        System.out.println(al);

        // Vector (It is sysnchronized and Slow)
        Vector<Integer> v=new Vector<>();
        v.add(9);
        v.add(5);
        v.add(2);
        System.out.println(v);

        // Linked List
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(0,10);
        ll.add(1);
        ll.add(1,43);
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);

        // Stack
        Stack<Integer> s=new Stack<>();
        s.push(10);  //pushes the element inside the stack
        s.push(20);
        s.push(30);
        System.out.println("Stack:"+s); 
        System.out.println(s.pop());     //gets the topmost element from the stack outside
        System.out.println(s.peek());    //shows the topmost element in the stack
        
        // Set : In Set the values are unique 
        // HashSet : Its in unordered collection
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(12);
        hs.add(34);
        System.out.println("HashSet:"+hs);

        // LinkedHashSet : while using this the order doesn't change 
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(12);
        lhs.add(11);
        lhs.add(11);
        System.out.println(lhs);
        
        // TreeSet : we will get sorted values
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(20);
        ts.add(4);
        ts.add(23);
        ts.add(10);
        System.out.println(ts);

        // Queue : FIFO
        Queue<Integer> q=new LinkedList<>();
        q.offer(10); // offer-> adds value in queue
        q.offer(12); 
        q.offer(14);
        System.out.println(q);
        System.out.println(q.remove());  //removes the first element from the queue
        System.out.println(q.poll()); //removes and returns the element
        // although remove and add does the same work as offer and poll but remove and add can throw exception so we use offer and poll for adding and removing the element in queue

        // PriorityQueue : In this priority is assigned to the topmost element in the queue
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(2);
        pq.offer(6);
        pq.offer(12);
        System.out.println(pq);
        System.out.println(pq.peek()); //smallest value in the queue will be at the top

        // Deque
        // ArrayDeque
        Deque<Integer> dq=new LinkedList<>();
        dq.offer(10);
        dq.offer(30);
        dq.offerLast(40);
        dq.offerFirst(11);
        System.out.println(dq);
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);

        // Map : values are stored in key and value pair <key,value> in this key is unique & value can be duplicate
        // HashMap
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Apple", 10);
        hm.put("Banana", 16);
        System.out.println(hm);

        // TreeMap : In this keys are sorted
        TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
        tm.put("Coconut", 10);
        tm.put("Apple", 16);
        System.out.println(tm);
        System.out.println(tm.keySet()); //to get all the keys
        System.out.println(tm.values()); //to get all the values
        
        // egs
        int arr[]={1,13,62,7,9,19};
        Arrays.sort(arr);
        for(int i :arr)
            System.out.print(i+" ");
        System.out.println("\n"+Arrays.binarySearch(arr, 19));

        ArrayList<Integer> all=new ArrayList<>();
        all.add(10);
        all.add(2);
        all.add(7);
        all.add(34);
        System.out.println(all);
        Collections.sort(all); //sort
        System.out.println(all); 
        System.out.println(Collections.min(all));
        System.out.println(Collections.max(all));

    }
}
