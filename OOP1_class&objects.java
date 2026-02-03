// Class is an blueprint to create objects (eg. Rules set to create Car). 
// Class is like an logical entity that doesn't exist in real world, but through which we can create objects
// Class contains of properties & functions
// Only one class can be public and that is main_class so we cant make other classes public
  class Car{
    String name;               //variable
    void can_run(){            //function
      System.out.println(name+"Can run fast")
  }
// Objects are instance of an class (eg. Car/Components of the car). 
// Object is like an physical entity ie it occupies space in memory 
public class MainClass {
    public static void main(String[] args) {
      Car c1=new Car();
      c1.name="Urus";
      System.out.println(c1.name);
      c1.can_run();
      
      Car c2=new Car();
      c2.name="G-wagon";
      System.out.println(c2.name);
      c2.can_run();
    }
}

// class - blueprint of an flat, can create multiple flats from a blueprint
// object - actual flat that is created with the help of that blueprint
