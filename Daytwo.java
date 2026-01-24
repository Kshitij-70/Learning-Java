import java.util.*;

    // public class Daytwo{
    //     public static int product(int a,int b){
    //         int prod = a*b;
    //         return prod;
    //     }
    //     public static void main(String[] args) {
    //         Scanner sc =new Scanner(System.in);
    //         int a=sc.nextInt();
    //         int b=sc.nextInt();

    //         int prod=product(a, b);
    //         System.out.print(prod);
    //     }
    // }
    //     public class Daytwo{
    //     public static void giveFact(int n){
    //         int factorial=1;
    //         for (int i=n;i>=1;i--){
    //             factorial=factorial*i; 
    //         }
    //         System.out.println(factorial);
    //     }
    //     public static void main(String[] args) {
    //         Scanner sc =new Scanner(System.in);
    //         int n=sc.nextInt();
    //         giveFact(n);
    //     }
    // }

    //     public class Daytwo{
    //     public static int diff(int a,int b){
    //         int sum=a+b;
    //         return sum;
    //     }
    //     public static void main(String[] args) {
    //         Scanner sc=new Scanner(System.in);
    //         int a=sc.nextInt();
    //         int b=sc.nextInt();
    //         int sum=diff(a, b);
    //         System.out.println(sum);
    //     }
    // }

//Enter 3 numbers from the user & make a function to print their average.
// public class Daytwo{
//     public static float giveAvg(float a,float b,float c){
//             float avg=(a+b+c)/3;
//             return avg;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the a no");
//         float a=sc.nextFloat();
//         System.out.println("Enter the b no");
//         float b=sc.nextFloat();
//         System.out.println("Enter the c no");
//         float c=sc.nextFloat();

//         float avg=giveAvg(a, b, c);
//         System.out.println("The avg of given numbers is :"+avg);
//     }
// }

//Write a function to print the sum of all odd numbers from 1 to n.
// public class Daytwo {
//     public static int allSum(int n){
//         int sum=0;
//             for (int i=1;i<=n;i++){
//                 if (i%2!=0)
//                 {
//                     sum=sum+i;
//                 }
//             }
//             return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         int sumall=allSum(n);
//         System.out.println("Sum for the given n is :"+sumall);
//     }
// }

//Write a function which takes in 2 numbers and returns the greater of those two.
// public class Daytwo {
//     public static int great(int a,int b){
//             if (a>b){
//                 System.out.print("Greater no is :"+a);
//             }else{
//                 System.out.println("Greater no is :"+b);
//             }
//             return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         great(a, b);
//     }
// }

// Write a function that takes in the radius as input and returns the circumference of a circle.
// public class Daytwo {
//     public static int cir(double r){
//         double circum=2 * 3.14 * r;
//         System.out.println(circum); 
//         return 0;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         cir(r);
//     }
// }

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// public class Daytwo {
//     public static int age(int age){
//         if (age>=18) {
//             System.out.println("Can Vote");
//         }else{
//             System.out.println("Can't Vote");
//         }
//         return age;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         age(age);
//     }
// }
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// public class Daytwo {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int pos=0,neg=0,zero=0;
//         char choice;

//         do{
//             System.out.println("Enter the num you want :");
//             int num=sc.nextInt();
//             if(num>0){
//                 pos++;
//             }else if (num<0) {
//                 neg++;
//             }else{
//                 zero++;
//             }
//             System.out.print("Do you want to enter another number? (y/n): ");
//             choice = sc.next().charAt(0);

//         } while (choice == 'y' || choice =='Y');

//         System.out.println("\nCount of Positive numbers: " + pos);
//         System.out.println("Count of Negative numbers: " + neg);
//         System.out.println("Count of Zero numbers: " + zero);
//     }
// }

