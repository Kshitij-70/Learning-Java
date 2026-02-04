// we can create methods/functions of same name in classes but having different parameters 
// method overloading is achived by either changing the number of parameters or changing the data type of the parameter
class Student{
      void write(){
        System.out.println("Student is Writing");
      }

      void write(String name){
        System.out.println(name +" is Writing");
      }
      void write(String name,int count){
        for(int i=0;i<count;i++){
          System.out.println(name +" is Writing");
        }
      }
  }
public class Mainclass{
    public static void main(String[] args) {
      Student s1=new Student();
      s1.write();
      s1.write("Kshitij");
      s1.write("Ak",3);
    }
}
