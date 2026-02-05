// Method Overriding : When child has same properties as their parents then the child overrides the parent 
// meaning instead of getting parents property, child uses its own property
class Vehicle{
    void start(){
      System.out.println("Vehicle will Start");
    }
}
class Car extends Vehicle{
  void start(){
    System.out.println("Car is starting");
  }
  void wheels(){
    System.out.println("car has 4 wheels");
  }
}

public class Mainclass {
  public static void main(String[] args) {
    Car c1=new Car();
    c1.wheels();
    c1.start();
  }
}

// op-> car has 4 wheels
//      Car is starting
