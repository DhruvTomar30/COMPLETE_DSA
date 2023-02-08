import java.util.*;

public class input {
    public static void main(String args[]){
         Scanner sc =new Scanner(System.in);    //creates a new object of type scanner from the standard input of the program
        String input =sc.next();                //returns tokenized text.
        System.out.println(input);

        String name=sc.nextLine();              //returns all text up to a line break.
        System.out.println(name);

        int number=sc.nextInt();
        System.out.println(number);

        // String age=sc.nextLine();
        // System.out.println(age);


       

        int a=sc.nextInt();    
        int b=sc.nextInt();

        int sum=a+b;          // sum of two numbers by user defined ....
        System.out.println(sum);

        float product=a*b;   // product of two numbers by user defined ....
        System.out.println(product);


    }
}

