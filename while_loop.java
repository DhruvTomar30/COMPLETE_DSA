import java.util.*;
public class while_loop {
    public static void main(String args[]){
        // int counter =0;
        // while(counter<10){
        //     System.out.println("Hello world: ");
        //     counter++;
        // }
        // System.out.println("print HW");

// print numbers from 1 to 10 using while loop...
            // int counter=1;
            // while(counter<=10){
            //     System.out.print(counter+" ");
            //     counter++;
            // }
            // System.out.println();

                Scanner sc=new Scanner(System.in);
                // int range=sc.nextInt();
                // int counter=1;
                // while(counter<=range){
                //     System.out.println(counter);
                //     counter++;
                // }

        // print sum of first n natural numbers....
                int n=sc.nextInt();
                int sum=0;
                int i=1;
                while(i<=n){
                    sum=sum+i;
                    i++;
                    
                }
            System.out.println(sum);


            // Do while loop
            int counter=1;
            do{
                System.out.println("hello world");
                counter++;
            }while(counter<=10);
        }
}


