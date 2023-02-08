import java.util.*;
public class practice_midTerm {
    // public static Boolean IsEven(int n){
    //     if(n%2==0){

    //         return true;
    //     }
    //     else
    //      return false;

    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     Boolean Check=IsEven(n);
    //     if(Check==true){
    //         System.out.print("even");
    //     }else{
    //         System.out.print("odd");
    //     }
    // }
    public static void Palindrome(int n){
        int rev=0;
        int a=n;
        while(n!=0){
        
        int last_digit=n%10;
        rev=rev*10+last_digit;
        n=n/10;}
        if(a==rev){
            System.out.println("num is palindrome");
        }
        else{
          System.out.println("num is not palindrome");}
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palindrome(n);
        

    }
}
