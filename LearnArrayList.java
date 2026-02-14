import java.util.ArrayList;
import java.util.Collections;

public class LearnArrayList{
  public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>(); 
    // add elements
    al.add(2);
    al.add(19);
    al.add(12);
    System.out.println(al);

    // get elements
    int atindx=al.get(0);
    System.out.println(atindx);

    // add elt in between
    al.add(1,3);
    al.add(2,4);
    System.out.println(al);

    // set elt (changing the element at index)
    al.set(0, 1);
    System.out.println(al);

    // delete elt
    al.remove(0);
    System.out.println(al);

    // size
    System.out.println(al.size());

    // loops
    for(int i=0;i<al.size();i++){
      System.out.print(al.get(i)+" ");
    }
    System.out.println();
    // sorting
    Collections.sort(al);
    System.out.println(al);
  }
}