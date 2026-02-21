// Exceptions : It is an event that disrupts normal flow of program. Its an object thats thrown at runtime
// Errors
// 1) Compile time error
// 2) Runtime error (Exceptions) - we need to handle these exceptions
// 3) Logical error

public class ExceptionHandling {

    public static void main(String[] args) {
        int i=2;
        int j=0;
        int arr[]=new int[2];
        try {     //in try block we write the code that may have an error
            j=8/i;
            System.out.println(arr[2]);
        } catch (ArithmeticException e) {  //when try is wrong it throws an error so we need to catch it
            // here Exception is a class in java. It represents errors that occur at runtime
            // e is a reference variable. It stores the exception object
            System.out.println("Something went wrong!");//catch block will only be executed when exception occurs 
        }
        // we can write multiple catch blocks for different exceptions
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println("Array is out of limit");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}

// throws : It tells that the method is throwing an exception so that we need to handle the exception
public class Animal {
    public static void main() {
        Animal a=new Animal();
        a.hii();
    }
    public static void hii(){
        try {
            hello();
        }catch (Exception e){
            System.out.println("Cant print out of index");
        }
    }
    public static void hello() throws ArrayIndexOutOfBoundsException {
        Integer arr[]=new Integer[5];
        arr[5]=10;
    }
}

// finally : prints anyway
class Animal{
    public static void main(String[] args) {
        System.out.println(hello(10,0));
    }

    public static int hello(int a,int b) {
        try {
            return a / b;
        }catch (Exception e){
            return -1;
        }finally {
            System.out.println("cant divide by zero");
        }
    }
}
