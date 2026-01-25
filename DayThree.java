
import java.util.Scanner;

// public class DayThree {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] names=new int[n];
//         for(int i=0;i<n;i++){
//             names[i]=sc.nextInt();
//         }
//         for (int i=0;i<n;i++){
//             System.out.println(names[i]); 
//         }
//     }
// }
// public class DayThree {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int[] numbers=new int[size];

//         for(int i=0;i<size;i++){
//             numbers[i]=sc.nextInt();
//         }

//         System.out.println("Enter the no x you want to search:");
//         int x=sc.nextInt();
        
//         for(int i=0;i<numbers.length;i++){
//             if(x==numbers[i]){
//                 System.out.println(i );
//         }
//     }
// }
// }
// Take an array of names as input from the user and print them on the screen.
// public class DayThree {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         String names[]=new String[size];
//         // input
//         for (int i=0;i<size;i++){
//             names[i]=sc.next();
//         }
//         // output
//         for(int i=0;i<names.length;i++){
//             System.out.println(names[i]);
//         }
//     }
// }
// Find the maximum & minimum number in an array of integers. 
// public class DayThree {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int num[]=new int[size];
//         for(int i=0;i<size;i++){
//             num[i]=sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<num.length;i++){
//             if (num[i]<min) {
//                 min=num[i];
//             }
//             if (num[i]>max) {
//                 max=num[i];;
//             }
//         }
//         System.out.println("Maximum :"+max);
//         System.out.println("Minimun"+min);
//         }
//     }
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
    //  {3, 4, 6, 2} is not sorted in ascending order.
// public class DayThree {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int nums[]=new int[size];

//         for (int i=0;i<size;i++){
//             nums[i]=sc.nextInt();
//         }
//         boolean isAscending=true;

//         for (int i=0;i<nums.length-1;i++){
//             if (nums[i]>nums[i+1]) {
//                 isAscending=false;
//             }
//         }
//         if (isAscending){
//             System.out.println("is sorted in ascending order");
//         }else{
//             System.out.println("is not sorted in ascending order.");
//         }
//     }
// }
//Take a matrix as input from the user. Search for the given no x and print the indices at which it occured
// public class DayThree {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int rows=sc.nextInt();
//         int cols=sc.nextInt();
//         int[][] num=new int[rows][cols];
//         // input
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 num[i][j]=sc.nextInt();
//             }
//         }
//         // output
//         System.out.println("Enter the no x:");
//         int x=sc.nextInt();
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if (num[i][j]==x){
//                     System.out.print("("+i+" ,"+j+")");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// Print the spiral order matrix as output for a given matrix of numbers. 
public class DayThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        // input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}