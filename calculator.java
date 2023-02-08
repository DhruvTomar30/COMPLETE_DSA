import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        float a=sc.nextInt();
        System.out.println("Enter value of b:");
        float b=sc.nextInt();
        System.out.println("Enter the operation: ");
        char operator=sc.next().charAt(0);
        

        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("wrong");
        }
    }

}
