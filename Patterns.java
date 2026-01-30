// * * * * *
// * * * * *
// * * * * *
// * * * * *
// public class Patterns {
//     public static void main(String[] args) {
//         for(int i=0;i<4;i++){
//             for(int j=0;j<5;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// * * * * *
// *       *
// *       *
// * * * * *
// public class Patterns {
//     public static void main(String[] args) {
//         int r=4;
//         int c=5;
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 if (i==1 || j==1 || j==c ||i==r){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// *
// **
// ***
// ****
// public class Patterns {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4 ; i++) {
//             for(int j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// ****
// ***
// **
// *
// public class Patterns {
//     public static void main(String[] args) {
//         for (int i=1;i<=4;i++){
//             for(int j=4;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//     *
//    **
//   ***
//  ****
// public class Patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=4;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 1
// 12
// 123
// 1234
// public class Patterns {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// 1234
// 123
// 12
// 1
// public class Patterns {
//     public static void main(String[] args) {
//         for (int i=4;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// public class Patterns {
    
//     public static void main(String[] args) {
//         int num=1;
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }