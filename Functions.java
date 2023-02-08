import java.util.*;
public class Functions {
    // public static void HelloWorld(){     // Creating the function....
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     // return 2;
    // }

// public static int SumFunction(int num1, int num2){    // parameters or formal parameters...
//     int sum=num1+num2;
//     return sum;
// }

    // public static void main(String args[]){
        // HelloWorld();   // function cALLING.....
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int sum=SumFunction(a,b);   // arguments or actual parameters..
        // System.out.println("sum is: "+ sum);
    // }



    //  <----- Swapping between two numbers.... ----> 

        //swap values-exchange
        // public static void main(String args[]){
        // int a=5;
        // int b=4;
        // // swap
        // int temp=a;
        //  a=b;
        //  b=temp;
        // System.out.println(" a is : "+ a );
        // System.out.println(" a is : "+ b );

    // <------ product of a and b -----> 
        // public static int multiply(int a,int b){
        //     int product=a*b;
        //     return product;
        // }
        // public static void main(String args[]){
        //   int product=multiply(3,7);
        //    System.out.println(product);
        //   product= multiply(4,6);
        //   System.out.println(product);
        // }

// Factorial of a number...
// public static int factorial(int n){
//     int f=1;
    
//     for(int i=1;i<=n;i++){
//         f=f*i;
//     }
//     return f;
// }

// public static int bincoeff(int n,int r){
//    int fact_n= factorial(n);
//    int fact_r=factorial(r);
//    int fact_nmr=factorial(n-r);
//    int bincoeff= fact_n/(fact_r*fact_nmr);
//    return bincoeff;
// }

// // Func to calculate sum of 2 no's....
// public static int sum(int a ,int b){
//     return a+b;
// }

// // functions to calculate sum of 3 no's.... 
// public static int sum(int a, int b, int c){
//     return a+b+c;
// }

// fun to calculate int sum...
// public static int sum(int a,int b){
//     return a+b;
// }
// // fun to calculate float sum...
// public static float sum(float a , float  b){
//     return a+b;
// }

// <---- print a number is Prime or not.....> 
// public static boolean isPrime(int n){
//     if(n==2){
//      return true;
// }
//     for(int i=2;i<=/*n-1*/ Math.sqrt(n) ;i++){ // srqt is for square root of number....
//         if(n%i==0){
//            return false;
//             // break;
//         }
        
//     }
//     return true;
// }
 
// Print Prime numbers between 2 to 20 ...... 
// public static void primesInRange(int n){
//     for(int i=2;i<=n;i++){
//         if(isPrime(i)){    // true
//             System.out.print(i + "  ");
//         }
//     }
// }


// Convert Binary to Decimal number.....
public static void BinToDec(int BinNum){
    int pow=0;
    int decNum=0;
    int myNum=BinNum;
    while(BinNum>0){
        int lastDigit=BinNum%10;
        decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
        pow++;
        BinNum=BinNum/10;
    }
        System.out.println("Decimal of "+ myNum+ " = " + decNum);
  
}
   public static void main(String args[]){
        // System.out.println(factorial(5));
        // System.out.println(bincoeff(5,2));
        // System.out.println(sum(12,23));
        // System.out.println(sum(3,7,9));
        // System.out.println(sum(5,2));
        // System.out.println(sum(3.2f,5.3f));
        // System.out.println(isPrime(8));
        // primesInRange(20);
         BinToDec(101);


       }

}