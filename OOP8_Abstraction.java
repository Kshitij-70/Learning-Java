// abstract class : It is a class whit cant be instantiated, meaning we cant create object of abstract class. We use abstract keyword to declare a abstract class.
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
