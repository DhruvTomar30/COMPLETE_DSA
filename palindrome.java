import java.util.*;
public class palindrome {
    public static void main(String args[]){
        System.out.print("enter the number: ");
        Scanner sc=new Scanner(System.in);
        int palindrome=sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.print("number " + palindrome + " is a palindrome");}
        else{
            System.out.print("number " + palindrome + " is not a palindrome");
            }
    }

    public static boolean isPalindrome(int number){
        int palindrome = number;  // copied number into variable
        int reverse=0;
        while(palindrome!=0){
            int remainder= palindrome%10;
             reverse= reverse*10 + remainder;
             palindrome=palindrome/10;
        }
        // if original and the reverse of number is equal means it is palindrome
        if(number== reverse){
            return true;
        }
        else
        return false;
    }

}
    

