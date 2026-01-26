import java.util.*;
// public class Day4 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // String name=sc.nextLine();
//         // System.out.println("Your name is "+name);
//         String name1st="KSHITIJ";
//         String nmae2nd=" KOLI";
//         String fullname=name1st+nmae2nd; //Concatination

//         // .length() gives us length of the String
//         System.out.println(fullname.length());

//         // .charAt() gives character one by one
//         for (int i=0;i<fullname.length();i++){
//             System.out.println(fullname.charAt(i));
//         }

//         // comparing string .compareTo()
//         String name="KSHITIJ";
//         String name2="KSITIj";
//         // str1>str2 gives +ve value
//         // str1==str2 gives 0 value
//         // str1<str2 gives -ve value
//         if (name.compareTo(name2)==0) {
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("Strings are not equal");
//         }

//         // .substring(start_index,end_index) to get substring of the string
//         String hero="Superman";
//         System.out.println(hero.substring(0,5));

//         // ParseInt converts string to integer
//         String str="1235";
//         int number=Integer.parseInt(str);
//         System.out.println(number);
//         // ToString converts to string
//         int num=12234;
//         String nums=Integer.toString(num);
//         System.out.println(str.length());
//     }
// }

// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
// public class Day4 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         String array[]=new String[size];
//         int total=0;
//         for(int i=0;i<size;i++){
//             array[i]=sc.next();
//             total=total+array[i].length();
//         }
//         System.out.println(total);
//    }
// }

// input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”
// public class Day4 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.next();
//         String result="";

//         for (int i=0;i<str.length();i++){
//             result=result+str.charAt(i);
//         }
//         System.out.println(result.replace("e","i"));
//     }
// }

// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”
// public class Day4 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String email=sc.next();
//         String username="";

//         for (int i=0;i<email.length();i++){
//             if (email.charAt(i)=='@') {
//                 break;
//             }else{
//                 username+=email.charAt(i);
//             }
//         }
//         System.out.println(username);
//     }
// }

// String Builder
// public class Day4 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // Declaration
//         StringBuilder sb=new StringBuilder("KSHITIJ");
//         System.out.println(sb);
//         // Get A Character from Index
//         System.out.println(sb.charAt(0));
//         // Set a Character at Index
//         sb.setCharAt(0, 'X');
//         System.out.println(sb);
//         // Insert a Character at Some Index
//         sb.insert(3, 'J');
//         System.out.println(sb);
//         // Delete char at some Index
//         sb.delete(0, 3);
//         System.out.println(sb);
//         // Append a char 
//         // Append means to add something at the end.
//         sb.append(" KOLI");
//         System.out.println(sb);
//         // Print Length of String
//         System.out.println(sb.length());
//     }
// }

// Reverse a String (using StringBuilder class)
public class Day4 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("CELLO");

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}