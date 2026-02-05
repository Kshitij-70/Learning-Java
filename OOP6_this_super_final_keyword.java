// this : this keyword refers to the current object of the class. In simple words 'this' means “the object that is calling the method right now.”
// Cannot be used in static context 
class Student {
    int age;

    void setAge(int age) {
        this.age = age;   // instance variable = local variable
    }
}
// Without this, Java would think both age are local.

// super : 'super' keyword refers to immediate parent class object.
class Vehicle{
    void start(){
      System.out.println("Vehicle will Start");
    }
}
class Car extends Vehicle{
  void start(){
    super.start();
    System.out.println("Car is starting");
  }
}
public class Mainclass {
  public static void main(String[] args) {
    Car c1=new Car();
    c1.start();
  }
}

// Using final, we make a variable fixed, and its value cannot be changed once assigned.
// eg. final variable, final method, final class
class  Car{
  final int wheels=4;
  void show(){
    wheels=5;   //it will show error as value of wheels is fixed to 4 with help of final keyword
    system.out.println(wheels);
}
  
