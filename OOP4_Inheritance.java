// We can create a child class that can inherit properties from the parent class by using "extends" keyword (eg) class Child extends Parent 
class Vehicle{
    void start(){
      System.out.println("Vehicle will Start");
    }
}
class Car extends Vehicle{
  void wheels(){
    System.out.println("car has 4 wheels");
  }
}
public class Mainclass {
  public static void main(String[] args) {
    Car c1=new Car();
    c1.wheels();
    c1.start();      //We can aslo access the properties from parent class with object of child class as the child class extends parent class
  }
}


