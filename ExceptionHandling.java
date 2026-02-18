// Exceptions : 
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
