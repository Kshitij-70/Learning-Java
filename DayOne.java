import java.util.*;
/* 
class Hello{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int sum=(a+b)/2;
        System.out.println("Sum of a and b is :"+sum);
    }
}

//Declare an int variable named age and assign it the value 25.
class Hoho{
    public static void main(String args[]){
        int age =25;
        System.out.println(age);
    }
}

//Create a double variable called price and assign it 99.99.
class Hoho{
    public static void main(String args[]){
        double price=99.99;
        System.out.println(price);
    }
}

//Write a Java statement that adds two numbers, a and b, and stores the result in sum.
class Hoho{
    public static void main(String args[]){
        int a=10;
        int b=19;
        int sum=a+b;
        System.out.println(sum);
    }
}

//If x = 10 and y = 3, what is the output of System.out.println(x % y);?
class Hoho{
    public static void main(String args[]){
        int a=10;
        int b=19;
        int sum=a+b;
        System.out.println(sum);
    }
}

//Write an if-else statement to check if a number num is positive or negative.
class Hoho{
    public static void main(String args[]){
        int num=10;
        if (num>=0)
            System.out.println("Num is Positive");
        else
            System.out.println("Num is Negative");
    }
}

//Write a for loop that prints numbers from 1 to 5.
class Hoho{
    public static void main(String args[]){
        for (int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}

//Write a while loop that prints "Hello" 3 times.
class Hoho{
    public static void main(String args[]){
        int i=0;
        while (i<3){
            System.out.println("Hello");
            i++;
        }
    }
}

//conditional statement
//if - else
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if (age>=18)
            System.out.println("Can Vote");
        else
            System.out.println("Cant Vote");
    }
}

class Main{
    public static void main(String[] args){
    int a = 10;

    if (a > 5)
        System.out.println("Hello");
        System.out.println("World");
    }
}

class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no:");
    int no=sc.nextInt();
    if (no%2==0)
        System.out.println("No is Even");
    else
        System.out.println("No is Odd");
    }
}

class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if (a==b)
        System.out.println("Equal");
    if(a>b)
        System.out.println(a+" is Greater");
    else
        System.out.println(a+" is Lesser");
    }
}
class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();
    if (button==0)
        System.out.println("Hello");
    else if(button==1)
        System.out.println("Namaste");
    else
        System.out.println("Bonjour");
    }
}

class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();
    switch(button){
        case 0: System.out.println("Hello");
        break;
        case 1: System.out.println("Namaste");
        break;
        case 2: System.out.println("Bonjour");
        break;
        default: System.out.println("Invalid Button");
    }
    }
}*/

class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator:");
        String op=sc.next();
        System.out.println("Enter the a:");
        int a=sc.nextInt();
        System.out.println("Enter the b:");
        int b=sc.nextInt();
        switch(op){
            case "+": 
            int sum=a+b;
            System.out.println("The addition is :"+sum);
            break;
            case "-": 
            int diff=a-b;
            System.out.println("The Substraction is:"+diff);
            break;
            case "*": 
            int mul=a*b;
            System.out.println("The Multiplication is:"+mul);
            break;
            case "/": 
            int div=a/b;
            System.out.println("The Multiplication is:"+div);
            break;
            default:
            System.out.println("Wrong Operator");
            
        }
    }
}