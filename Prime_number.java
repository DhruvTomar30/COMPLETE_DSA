import java.util.*;
public class Prime_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.print("it is prime: ");
        }
            else{
                boolean isPrime=true;
                for(int i=2;i<=/*n-1*/ Math.sqrt(n);i++){ 
                    if(n%i==0){
                        isPrime=false;
                    }
                }
                if(isPrime==true){
                    System.out.print("it is prime:");
                }
                else{
                        System.out.print("it is not prime");
                    }
                
            }
        
    }
}
