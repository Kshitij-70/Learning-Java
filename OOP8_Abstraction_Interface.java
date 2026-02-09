// abstract class : It is a class whit cant be instantiated, meaning we cant create object of abstract class. We use abstract keyword to declare a abstract class. In abstract class we can create abstract method as
// well as non abstract methods.
abstract class Puma{
  abstract void canRun();    //abstract method, It has no body. abstract method can be only given in abstract class
  void hasLegs(){            //Normal method so we need to implement
    println("It has 4 legs.");
}
// To access these abstract classes we need to create their child class extending abstract class, and implimenting the methods in child class
class Animal extends Puma{
  @Override                
  void canrun(){
    println("Can Run");
  }
}

// Abstraction :- It allows us to hide unnecessary part and show only needed information.

// Interface :- It is an fully abstract class. It includes group of abstract methods. We use interface keyword to use Interfaces in java. We can achieve abstraction with interfaces. To use interface other classes
// must implement it. We use the implements keyword to implement the interfaces. We can achieve Multiple Inheritance using interfaces             
  interface Animalking {
    void lion();
  }
  class Cat implements Animalking{
    public void lion(){
      System.out.println("Lion is from cat family");
    }
  }
  public class Mainclass {
  public static void main(String[] args) {
    Cat c=new Cat();
    c.lion();
    }
  }
// Multiple inheritance
  interface Dog {
    void eat();
    
  }
  interface Cat {
    void eat();
  }
  class Animal implements Dog,Cat {
  
    public void eat(){
      System.out.println("Animals are eating");
    }
  }
  
  public class Mainclass {
  public static void main(String[] args) {
    Animal a=new Animal();
    a.eat();
  }
  }
