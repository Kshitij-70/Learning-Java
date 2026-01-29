// Recersion:

// public class Day5 {
//     public static void name(int till){
//         if (till==0) {
//             return;
//         }
//         System.out.println("Kshitij");
//         name(till-1);
//     }
//     public static void main(String[] args) {
//         name(5);
//     }
// }

// public class Day5 {
//     public static int fact(int n) {
//         if (n==0 || n==1) {
//             return 1;
//         }
//         int factstk=fact(n-1);
//         int factn=n*factstk;
//         return factn;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=fact(n);
//         System.out.println(a);
//     }
// }

// public class Day5 {
//     public static void returnSum(int a,int till, int sum){
//         if(a==till){
//             sum+=a;
//             System.out.println(sum);
//             return;
//         }
//         sum+=a;
//         returnSum(a+1, till, sum);
//     }
//     public static void main(String[] args) {
//         int a=1;
//         int till=5;
//         returnSum(a, till, 0);
        
//     }
// }

// public class Day5 {
//     public static void fib(int a,int b,int n){
//         if (n==0) {
//             return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         fib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a=0, b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         fib(a, b, n-2);
//     }
// }