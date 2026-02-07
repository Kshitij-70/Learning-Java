// Packages are just like folders having same type of classes and interfaces
// Importing a package:-
package package.name;    //Takes the package named name
import package.Class;    //Only import a class
import java.util.*;      //imports whole util package

// Access Modifiers :- they control which class,variable,method,constructor could be accessed 
class Animal{
  public static method1(){
  }
  private static method2(){
  }
}
// In this class there are two methods, where method1 can be accessed by other class also as it is public, but not method2 as it has private access modifier.
// Types : default, private, protected, public

// Encapsulation : it means bundling of fields and methods inside a single class. It prevent outer classes from accessing and changing the fileds and methods of a class. It also helps in data hiding
