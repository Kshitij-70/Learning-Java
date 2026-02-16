import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
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
    }
} 
