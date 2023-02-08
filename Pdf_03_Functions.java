// 01 . Average of 3 number
import java.util.*;
public class Pdf_03_Functions {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter first number: ");
//          float a = sc.nextFloat();
//         System.out.print("enter the second number:");
//         float b= sc.nextFloat();
//         System.out.print("enter the third number:");
//         float c= sc.nextFloat();
//         System.out.print("Avg is "+ average(a,b,c)+"\n");
        
//     }
// public static float average( float a, float b, float c){
//     return a+b+c/3;}

// 02. 
// public static void main(String args[]){
//     Scanner sc= new Scanner(System.in);
//     int num;
//     System.out.print("enter your integer: ");
//     num = sc.nextInt();
//     if(isEven(num)){
//         System.out.println(" it is even");
//     }
//     else{
//         System.out.println("it is odd");
//     }
// }
// public static boolean isEven(int number){
//     if(number%2==0){
//         return true;
//     }
//     else{
//         return false;
//     }
// }

// 05. Sum of integers ... 
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the integer: ");
    int digits=sc.nextInt();
    System.out.println("the sum is " + sumDigits(digits));
}
 
public static int sumDigits(int n){
    int sumofDigits=0;
    while(n>0){
        int lastDigit=n%10;
        sumofDigits+=lastDigit;
        n/=10;
    }
    return sumofDigits;
}
}
