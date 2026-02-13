// In java we can create an class inside an class i.e nested class, we can also create an class without name inside an class i.e Anonymous class
// Anonymous class usually extend subclass or implements interfaces
// 1) A superclass that an anonymous class extends
public class Anonymousclass{
  Outerclass obj=new Outerclass(){      //instead of extending Outerclass we created Anonymous class. Obj of the class is created, It can be used only one time 

  };
class Outerclass{
  public void outerMethod(){

  }
}
  
// 2) An Interface that an anonymous class implements.
public class Anonymousclass{
  SuperInterface obj=new SuperInterface(){
    
  @override
  public void interfaceMethod(){
      
    }
  };
innterface SuperInterface{
    void interfaceMethod(){
      }
}

// Functional Interfaces:
// An Interface that contains exactly one abstract method is known as a functional interface 
// Functional Interfaces introduced in java 8 allows us to use a lambda expression 
  public class Anonymousclass{
   Sample obj= (int val)->{
     S.o.p(val);
       return val;
      };
  }
  @FunctionalInterface 
  interface Sample{
    //abstract method
    int calculate(int val);
  }
eg)
  public class Mainclass {
  public static void main(String[] args) {
    Walke wa = (int steps)->{
      System.out.println(steps);
      return steps;
    };
    wa.walk(5);
  }
}

interface Walke {
  int walk(int steps);
}
