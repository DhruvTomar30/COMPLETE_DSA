import java.util.*;
// how many times hello will print....
public class pdf_02_homework{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    //     for(int i=0;i<5;i++) 
    //     {
    //         System.out.println("Hello");
    //         i+=2;
    //     }
    //     }
    // }
// 02. WAP that reads set of integers and print sum of even and odd integers...
        int number;
        int choice;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.print("enter the number:");
            
            number=sc.nextInt();
            if(number%2==0){
                evensum+=number;
            }else{
                oddsum+=number;
            }
            System.out.print("do you want to continue? Press 1 for yes and 0 for no");
            choice=sc.nextInt();
        }while(choice==1);
            System.out.println("sum of even no's: "+evensum);
            System.out.println("sum of odd no's: "+oddsum);


        // 03 Factorial of a number.....
            int fact=1;
            int n;
            System.out.print("Enter any positive integer:");
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                fact=fact*i;
           

            }
            System.out.print("factorial is:" +fact);

        }
    }    

